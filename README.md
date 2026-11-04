**Tugas 2 Praktikum PBO: Inheritance, Composition, dan Polymorphism**

**Identitas Mahasiswa:**
- **Nama:** Rahadatul Qudsi
- **NPM:** 250810701100026
- **Kelas Praktikum:** Pemrograman Berorientasi Objek A
- **Link Repositori:** https://github.com/rahada14/-Tugas2_Inherit-polymorph-2526

- ---

## 📌 Deskripsi Singkat
Tugas 2 ini berfokus pada penerapan empat pilar dasar dan modul Praktikum 6 dan 7 PBO Java, yaitu Inheritance, Composition, dan Polymorphism (Upcasting, Downcasting, dan Overriding/Overloading). Program terdiri dari 4 soal utama yang mencakup hierarki perangkat elektronik, analisis runtime & ClassCastException, manajemen titik dan garis dengan defensive copying, serta mini-project toko digital.

---

## ✨ Fitur Utama
1. **Soal 1 (Hierarki Perangkat):** Perhitungan pajak 10%, potongan harga promo (akses protected), serta pemanggilan constructor superclass `super()` termasuk penambahan garansi otomatis pada LaptopGaming.
2. **Soal 2 (Analisis & Polimorfisme):** Verifikasi pencetakan constructor, penanganan `ClassCastException` dengan `instanceof`, serta analisis dispatch method dinamis dan pengabaian luas pada Titik.
3. **Soal 3 (Titik & Garis):** Implementasi relasi composition (has-a) antara Titik dan Garis, overloading constructor, serta pencegahan efek aliasing via *defensive copy*.
4. **Soal 4 (Mini Project Toko Digital):** Manajemen objek keranjang belanja heterogen berbasis polimorfisme, penanganan duplikasi kode produk via `IllegalStateException`, penentuan total harga akhir, dan pembacaan jumlah jenis produk dengan downcasting yang aman.

---

## 🛠️ Konsep OOP yang Diterapkan

| Nama Konsep | Lokasi Penerapan | Alasan Pemilihan Konsep |
| :--- | :--- | :--- |
| **Inheritance** | `Laptop extends Perangkat`, `Langganan extends ProdukDigital` | Mewariskan atribut dasar (merek/harga/kode) agar kode lebih reusabel dan modular. |
| **Protected Access** | `Perangkat.harga` | Memberikan akses langsung atribut `harga` kepada subclass (`Laptop`) tanpa membuka akses public. |
| **Composition** | `Garis` berisi `Titik`, `Keranjang` berisi `ArrayList<Produk>` | Mewakili relasi *has-a*, di mana Garis tersusun dari objek Titik terpisah. |
| **Polimorfisme** | `hitungHargaAkhir()`, `infoSingkat()` | Mengizinkan panggilan method uniform pada koleksi parent yang beradaptasi sesuai tipe objek konkritnya. |
| **Safe Downcasting**| `hitungPerJenis()` di kelas `Keranjang` | Mengkategorikan tipe spesifik dari reference generic `Produk` dengan cek `instanceof` untuk menghindari `ClassCastException`. |
| **Defensive Copy** | Constructor dan Getter di `Garis.java` | Mencegah efek eksternal mutasi (*aliasing*) pada objek internal `Titik`. |

---

## 📂 Struktur Project

```text
Tugas2_Inherit-polymorph-Npmawalakhir/
├── .gitignore
├── README.md
└── src/
    ├── soal1/
    │   ├── Perangkat.java
    │   ├── Laptop.java
    │   ├── Ponsel.java
    │   ├── LaptopGaming.java
    │   └── TesSoal1.java
    ├── soal2/
    │   ├── Hewan.java
    │   ├── Kucing.java
    │   ├── A.java
    │   ├── B.java
    │   ├── Lingkaran.java
    │   ├── Titik.java
    │   └── TesSoal2.java
    ├── soal3/
    │   ├── Titik.java
    │   ├── Garis.java
    │   └── TesSoal3.java
    └── soal4/
        ├── Produk.java
        ├── ProdukFisik.java
        ├── ProdukDigital.java
        ├── Langganan.java
        ├── Keranjang.java
        └── TesSoal4.java


## Cara Menjalankan Program
Prasyarat: 
Java Development Kit (JDK) versi 17 atau lebih baru.
IDE pilihan (IntelliJ IDEA, Eclipse, atau VS Code).

Menjalankan via Command Line (Terminal / CMD): 
javac src/soal1/*.java
java -cp src soal1.TesSoal1 (begitu juga selanjutnya)

## Contoh Output :
1. Soal 1 (Hierarki Perangkat Elektronik)
```text 
Asus | garansi 24 bulan | RAM 16 GB | layar 14.0 inci
Samsung | garansi 12 bulan | 128 GB | 3 kamera
MSI | garansi 18 bulan | RAM 32 GB | layar 15.6 inci | GPU RTX 4060
Pajak laptop: Rp800000
Promo laptop 10 persen: Rp7200000

2. Soal 2 (Analisis Output & Polimorfisme)
```text
=== BAGIAN A ===
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
h2 bukan merupakan objek Kucing, downcasting dibatalkan.

=== BAGIAN B ===
A dibuat
init B, nilai=0
B dibuat, nilai=5

=== BAGIAN C ===
78.53981633974483
0.0
0.0

3. Soal 3 (Titik dan Garis)
```text
(0.0, 0.0)-(3.0, 4.0) panjang 5.0
(1.0, 1.0)-(5.0, 5.0)

4. Soal 4(Mini Project Toko Digital)
```text
F01 | Keyboard Mekanik | fisik 1.5 kg | Rp515000
D01 | Ebook Java | digital 20.0 MB | Rp90000
L01 | Kelas Online | langganan 12 bulan | Rp1440000
TOTAL: Rp2045000
Fisik: 1, Digital: 1, Langganan: 1
Gagal: Kode produk 'F01' sudah ada di dalam keranjang.


**Pertanyaan Tambahan Soal 1 (Eksperimen Private Access)**
1.Ketika modifier diubah dari protected menjadi private, 
```text
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        The field Perangkat.harga is not visible
        The field Perangkat.harga is not visible

        at soal1.Laptop.hitungHargaPromo(Laptop.java:26)
        at soal1.TesSoal1.main(TesSoal1.java:13)

Error karena hak akses private sifatnya sangat ketat dan cuma bisa diakses dari dalam kelas tempat dia dibuat (yaitu kelas Perangkat). Subclass seperti Laptop tidak lagi memiliki hak akses langsung untuk membaca atau memodifikasi variabel harga tersebut secara langsung tanpa melalui method getter/setter.


Jawaban Soal 2
Bagian A:
1. Ouput program bagian A:
``` Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
h2 bukan merupakan objek Kucing, downcasting dibatalkan

2. Jika h.panjat(); dibuka komentar-nya:
Error: Error Kompilasi (Compile-time Error).
Alasan: Variabel h bertipe statis Hewan. Kelas Hewan tidak memiliki method bernama panjat().

3. Baris yang Menyebabkan ClassCastException & Perbaikannya:
Baris Penyebab: Kucing k2 = (Kucing) h2; karena objek asli h2 adalah instansiasi murni dari Hewan, bukan Kucing
```perbaikan code:
if (h2 instanceof Kucing) {
    Kucing k2 = (Kucing) h2;
    k2.panjat();
}

4. Eksekusi h.makan() & Konsep Tipe Statis vs Dinamis:
Method suara() yang dieksekusi adalah milik Kucing (meong).
Penjelasan: Tipe statis dari variabel h adalah Hewan (menentukan variabel/method apa saja yang valid dipanggil saat kompilasi). Namun, tipe dinamis dari h saat runtime adalah Kucing. Karena suara() di-override oleh kelas Kucing, Java menggunakan Dynamic Method Dispatch untuk mengeksekusi method suara() milik tipe dinamisnya (Kucing).

Bagian B:
Prediksi Output new B() :
Saat constructor B() dipanggil, ia pertama-tama mengeksekusi super() yaitu constructor A(). Di dalam constructor A(), method init() dipanggil. Karena init() telah di-override di kelas B, method init() milik B yang dijalankan. Pada momen tersebut, inisialisasi field int nilai = 5 di kelas B belum dilakukan (masih berupa nilai default integer 0).
Risiko: Memanggil method yang dapat di-override (overridable method) dari dalam constructor sangat berbahaya karena method subclass dapat tereksekusi sebelum instance variabel subclass diinisialisasi sepenuhnya.

Bagian C:
Analisis l3.luas() & Evaluasi Relasi Titik is-a Lingkaran:
Mengapa 0.0? Karena variabel l3 merujuk ke instance Titik. Berdasarkan polimorfisme, method luas() milik Titik yang mengeksekusi return 0.0.
Apakah masuk akal? Tidak masuk akal. Secara hirarki dunia nyata dan matematis, Titik bukanlah jenis dari Lingkaran (Titik is not a Lingkaran).
Konsekuensi: Jika method lain mengekspektasikan objek Lingkaran pasti memiliki area luas > 0, program akan menghasilkan logical bug saat disisipi objek Titik.


Jawaban soal 3:
Apa yang tercetak pada baris kedua saat System.out.println(g2); dijalankan dan mengapa? (Tulis prediksi dulu.)
- Prediksi Awal:
Jika TIDAK pakai Defensive Copy:
Outputnya bakal (100.0, 1.0) - (5.0, 5.0). Soalnya kalau referensi titiknya cuma dioper biasa, begitu nilai t.setX(100) diubah dari luar, data garis g2 ikut kecolongan berubah (terjadi masalah aliasing).

-Jika PAKAI Defensive Copy (Kondisi Kode yang Benar):
Outputnya tetap (1.0, 1.0) - (5.0, 5.0). Soalnya data titik di dalam garis sudah dikloning/dibuatkan objek baru yang terpisah.

-Kapan perilaku Sebelum / Sesudah perbaikan lebih tepat?
Sebelum Perbaikan (Shared Reference): Tepat saat kita menginginkan shared state mutabel secara real-time (misalnya 2 elemen grafis yang terhubung ke satu node pusat yang sama).
Sesudah Perbaikan (Defensive Copy): Tepat saat kita menginginkan immutability dan enkapsulasi penuh di mana state internal Garis tidak boleh diubah secara sengaja/tidak sengaja oleh pihak eksternal.

-Masalah Desain jika Garis extends Titik:
Pelanggaran Relasi: Terjadi pelanggaran konsep is-a. Garis bukanlah sebuah Titik. Garis memiliki dua buah Titik (has-a).
Redundansi & Keanehan Data: Jika Garis diwarisi dari Titik, Garis akan mewarisi nilai x dan y tunggal dari parent-nya yang tidak relevan bagi bentuk geometri sebuah garis yang memerlukan koordinat awal dan akhir.

**Analisis Konsep:**
1. Perbedaan Method Overriding dan Method Overloading serta Kaitannya:
Method overriding terjadi saat kelas anak menulis ulang method milik kelas induk dengan nama, parameter, dan return type yang sama persis untuk mengubah perilakunya. Contohnya adalah method infoSingkat() pada LaptopGaming yang menggantikan infoSingkat() milik Perangkat agar bisa menampilkan info GPU. Sementara itu, method overloading adalah pemakaian nama method yang sama dalam satu kelas tetapi dengan jumlah atau tipe parameter yang berbeda, seperti pada konstruktor Garis(Titik, Titik) dan Garis(double, double, double, double). Perbedaan utamanya ada pada waktu eksekusi: overriding bekerja saat program berjalan (runtime), sedangkan overloading ditentukan saat kode dikompilasi (compile-time).

2. Memilih Antara Inheritance vs Composition:
Inheritance (pewarisan) digunakan ketika hubungan antar-kelas bersifat hirarki murni "is-a" (adalah sebuah). Pada tugas ini, kelas Laptop menggunakan extends Perangkat karena Laptop memang merupakan sebuah perangkat elektronik yang mewarisi sifat induknya. Sedangkan Composition (komposisi) dipakai jika hubungannya bersifat "has-a" (memiliki/tersusun dari). Contohnya kelas Garis yang menyimpan objek Titik awal dan akhir, karena Garis bukan sebuah Titik, melainkan bangun yang tersusun dari dua buah Titik.

3.  Pada Soal 4, mengapa cetakStruk() tidak memerlukan instanceof sedangkan hitungPerJenis() 
memerlukannya? Mengapa downcasting tidak selalu aman?
Method cetakStruk() tidak butuh pengecekan instanceof karena memanfaatkan polimorfisme murni di mana Java otomatis memanggil method deskripsi() sesuai tipe asli objeknya. Sebaliknya, hitungPerJenis() wajib memakai instanceof karena program harus memilah dan menghitung total harga khusus untuk tipe subclass tertentu. Proses pemilahan ini membutuhkan downcasting (mengubah tipe induk kembali ke tipe spesifik anaknya). Melakukan downcasting tanpa diproteksi instanceof sangat berbahaya karena bisa memicu error ClassCastException yang membuat program crash.
