package soal4;

import java.util.ArrayList;

public class Keranjang {
    private ArrayList<Produk> daftarProduk;

    public Keranjang() {
        daftarProduk = new ArrayList<>();
    }

    /**
     * Menambahkan produk ke keranjang.
     * @param p produk yang akan ditambahkan
     * @throws IllegalStateException jika kode produk sudah ada di keranjang
     */
    public void tambah(Produk p) {
        // Error handling & pencegahan duplikasi kode
        for (Produk item : daftarProduk) {
            if (item.getKode().equalsIgnoreCase(p.getKode())) {
                throw new IllegalStateException("Kode produk '" + p.getKode() + "' sudah ada di dalam keranjang.");
            }
        }
        daftarProduk.add(p);
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk item : daftarProduk) {
            total += item.hitungHargaAkhir(); // Polimorfisme
        }
        return total;
    }

    public void cetakStruk() {
        for (Produk item : daftarProduk) {
            System.out.printf("%s | %s | %s | Rp%.0f%n",
                    item.getKode(), item.getNama(), item.deskripsi(), item.hitungHargaAkhir());
        }
        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    public void hitungPerJenis() {
        int fisik = 0;
        int digital = 0;
        int langganan = 0;

        for (Produk item : daftarProduk) {
            // Urutan pengecekan sangat penting! Langganan diperiksa terlebih dahulu
            // karena Langganan merupakan subclass dari ProdukDigital.
            if (item instanceof Langganan) {
                langganan++;
            } else if (item instanceof ProdukDigital) {
                digital++;
            } else if (item instanceof ProdukFisik) {
                fisik++;
            }
        }

        System.out.printf("Fisik: %d, Digital: %d, Langganan: %d%n", fisik, digital, langganan);
    }
}
