package soal4;

public class Langganan extends ProdukDigital {
    private static final double DISKON_LANGGANAN_MINIMAL_12 = 0.20;
    private static final int BATAS_DURASI_BULAN = 12;

    private int durasiBulan;

    public Langganan(String kode, String nama, double hargaDasar, double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        if (durasiBulan <= 0) {
            throw new IllegalArgumentException("Durasi bulan harus lebih dari 0.");
        }
        this.durasiBulan = durasiBulan;
    }

    @Override
    public double hitungHargaAkhir() {
        double totalAwal = getHargaDasar() * durasiBulan;
        if (durasiBulan >= BATAS_DURASI_BULAN) {
            return totalAwal * (1.0 - DISKON_LANGGANAN_MINIMAL_12);
        }
        return totalAwal;
    }

    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}
