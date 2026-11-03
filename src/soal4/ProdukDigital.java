package soal4;

public class ProdukDigital extends Produk {
    protected static final double DISKON_DIGITAL = 0.10;
    private double ukuranMb;

    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb) {
        super(kode, nama, hargaDasar);
        if (ukuranMb < 0) {
            throw new IllegalArgumentException("Ukuran MB tidak boleh negatif.");
        }
        this.ukuranMb = ukuranMb;
    }

    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() * (1.0 - DISKON_DIGITAL);
    }

    @Override
    public String deskripsi() {
        return String.format(java.util.Locale.US, "digital %.1f MB", ukuranMb);
    }
}
