package soal4;

public class ProdukFisik extends Produk {
    private static final double ONGKIR_PER_KG = 10000.0;
    private double beratKg;

    public ProdukFisik(String kode, String nama, double hargaDasar, double beratKg) {
        super(kode, nama, hargaDasar);
        if (beratKg < 0) {
            throw new IllegalArgumentException("Berat tidak boleh negatif.");
        }
        this.beratKg = beratKg;
    }

    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() + (beratKg * ONGKIR_PER_KG);
    }

    @Override
    public String deskripsi() {
        return String.format(java.util.Locale.US, "fisik %.1f kg", beratKg);
    }
}
