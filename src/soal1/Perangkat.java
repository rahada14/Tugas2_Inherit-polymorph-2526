package soal1;

/**
 * Superclass yang merepresentasikan perangkat elektronik umum.
 */
public class Perangkat {
    private static final double TARIF_PAJAK = 0.10;

    private String merek;
    protected double harga;
    private int garansiBulan;

    /**
     * Constructor untuk Perangkat.
     *
     * @param merek        merek perangkat
     * @param harga        harga perangkat
     * @param garansiBulan masa garansi dalam bulan
     * @throws IllegalArgumentException jika harga negatif atau merek kosong/null
     */
    public Perangkat(String merek, double harga, int garansiBulan) {
        if (merek == null || merek.trim().isEmpty()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong.");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif.");
        }
        this.merek = merek;
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    public String getMerek() {
        return merek;
    }

    public int getGaransiBulan() {
        return garansiBulan;
    }

    /**
     * Menghitung pajak perangkat.
     * @return besaran pajak 10% dari harga
     */
    public double hitungPajak() {
        return harga * TARIF_PAJAK;
    }

    /**
     * Mengembalikan informasi singkat perangkat.
     * @return string informasi singkat
     */
    public String infoSingkat() {
        return merek + " | garansi " + garansiBulan + " bulan";
    }
}
