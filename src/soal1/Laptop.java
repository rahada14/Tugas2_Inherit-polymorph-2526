package soal1;

/**
 * Subclass Perangkat yang merepresentasikan perangkat Laptop.
 */
public class Laptop extends Perangkat {
    private int ramGb;
    private double ukuranLayarInci;

    public Laptop(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga promo laptop berdasarkan persentase diskon.
     * @param diskonPersen persentase diskon (0-100)
     * @return harga setelah diskon
     */
    public double hitungHargaPromo(double diskonPersen) {
        if (diskonPersen < 0 || diskonPersen > 100) {
            throw new IllegalArgumentException("Diskon tidak valid.");
        }
        // Mengakses atribut protected harga dari superclass
        return harga - (harga * (diskonPersen / 100.0));
    }

    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | RAM " + ramGb + " GB | layar " + meyakinkanLayar(ukuranLayarInci) + " inci";
    }

    private String meyakinkanLayar(double layar) {
        return String.format(java.util.Locale.US, "%.1f", layar);
    }
}
