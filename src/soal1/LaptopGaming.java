package soal1;

/**
 * Subclass Laptop yang merepresentasikan Laptop Gaming.
 */
public class LaptopGaming extends Laptop {
    private static final int GARANSI_TAMBAHAN_BULAN = 6;
    private String kartuGrafis;

    public LaptopGaming(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci, String kartuGrafis) {
        // Meneruskan garansiBulan + 6 ke constructor Laptop lewat super
        super(merek, harga, garansiBulan + GARANSI_TAMBAHAN_BULAN, ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + kartuGrafis;
    }
}
