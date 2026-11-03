package soal3;

/**
 * Kelas Garis yang menggunakan konsep Composition (has-a) dari kelas Titik.
 */
public class Garis {
    private Titik awal;
    private Titik akhir;

    /**
     * Constructor Garis dengan Defensive Copy untuk mencegah aliasing.
     * @param awal titik awal
     * @param akhir titik akhir
     */
    public Garis(Titik awal, Titik akhir) {
        // Defensive copy
        this.awal = new Titik(awal.getX(), awal.getY());
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Constructor overloading yang memanggil constructor utama lewat this(...)
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    public Titik getAwal() {
        return new Titik(awal.getX(), awal.getY()); // Defensive copy pada getter
    }

    public void setAwal(Titik awal) {
        this.awal = new Titik(awal.getX(), awal.getY());
    }

    public Titik getAkhir() {
        return new Titik(akhir.getX(), akhir.getY());
    }

    public void setAkhir(Titik akhir) {
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Menghitung panjang garis dengan memanggil jarakKe milik Titik.
     * @return panjang garis
     */
    public double getPanjang() {
        return awal.jarakKe(akhir);
    }

    @Override
    public String toString() {
        return awal.toString() + "-" + akhir.toString();
    }
}
