## **Tugas 2 Praktikum PBO: Inheritance, Composition, dan Polymorphism**

**Identitas Mahasiswa:**
- **Nama:** Rahadatul Qudsi
- **NPM:** 250810701100026
- **Kelas Praktikum:** Pemrograman Berorientasi Objek A
- **Link Repositori:** (https://github.com/rahada14/Tugas2_Inherit-polymorph-2526)

---

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
Tugas2_Inherit-polymorph-2526/
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
```
---


### 📋 Prasyarat
* **Java Development Kit (JDK):** Versi 21 atau yang lebih baru.
* **Integrated Development Environment (IDE):** IntelliJ IDEA, Eclipse, VS Code, atau editor teks pilihan Anda.

---

## 🚀 Cara Menjalankan Program
#### Cara 1: Menggunakan IntelliJ IDEA
1. Buka **IntelliJ IDEA** > pilih **Open** > buka folder root proyek (`-Tugas2_Inherit-polymorph-2526`).
2. Klik kanan folder `src` > pilih **Mark Directory as** > **Sources Root** (pastikan folder berubah warna biru).
3. Buka **File** > **Project Structure** > **Project**, lalu atur SDK ke **JDK 21** (atau versi yang terinstal).
4. Buka salah satu file pengujian di folder `src/`: `soal1/TesSoal1.java`, `soal2/TesSoal2.java`, `soal3/TesSoal3.java`, atau `soal4/TesSoal4.java`.
5. Jalankan program dengan mengklik ikon **Run** (segitiga hijau) atau tekan tombol **Shift + F10**.

#### Cara 2: Menggunakan Command Line (Terminal / CMD)
1. Buka Terminal atau CMD, lalu masuk ke direktori utama (*root folder*) proyek:
   ```bash
   cd path/to/-Tugas2_Inherit-polymorph-2526
   Jalankan perintah kompilasi (`javac`) dan eksekusi (`java`) sesuai soal yang ingin diuji:
ex:
* **Soal 1:**
  ```bash
  javac src/soal1/*.java
  java -cp src soal1.TesSoal1


## 💻 Contoh Output

### 1. Soal 1 (Hierarki Perangkat Elektronik)
![Output Soal 1](Output%20Program/Output%20soal1.png)

---

### 2. Soal 2 (Analisis Output & Polimorfisme)
![Output Soal 2](Output%20Program/Output%20soal2.png)

---

### 3. Soal 3 (Titik dan Garis)
![Output Soal 3](Output%20Program/Output%20soal3.png)

---

### 4. Soal 4 (Mini Project Toko Digital)
![Output Soal 4](Output%20Program/Output%20soal4.png)

---

## ❓ Pertanyaan Tambahan & Analisis Error

### 1. Ketika Modifier `harga` Diubah dari `protected` Menjadi `private`

![Output Error Soal 1](Output%20Program/Output%20error%20soal1.png)

**Penjelasan:**
Error terjadi karena hak akses `private` bersifat sangat ketat dan hanya dapat diakses dari dalam kelas tempat atribut tersebut dideklarasikan (`Perangkat`). Subclass seperti `Laptop` tidak lagi memiliki akses langsung untuk membaca atau memodifikasi atribut `harga` tanpa melalui method getter/setter.
---


**Jawaban Soal 2**
#### Bagian A

1. **Output Program Bagian A:**
   ```text
   Hewan dibuat: Tom
   Kucing dibuat
   Tom makan
   meong
   meong
   Tom memanjat
   Hewan dibuat: Generik
   h2 bukan merupakan objek Kucing, downcasting dibatalkan.

2. **Jika h.panjat(); dibuka komentar-nya:**

![Output Error Soal 2](Output%20Program/Output%20error%20soal2.png)

Error: Error Kompilasi (Compile-time Error).

Alasan: Variabel h bertipe statis Hewan. Kelas Hewan tidak memiliki method bernama panjat().


**3. Baris yang Menyebabkan `ClassCastException` & Perbaikannya:**
- **Baris Penyebab:** `Kucing k2 = (Kucing) h2;`  
  *Alasan:* Objek asli `h2` merupakan instansiasi murni dari kelas `Hewan`, bukan `Kucing`.
- **Kode Perbaikan:**
  ```java
  if (h2 instanceof Kucing) {
      Kucing k2 = (Kucing) h2;
      k2.panjat();
  }

**4. Eksekusi `h.makan()` & Konsep Tipe Statis vs Dinamis:**
- **Hasil Eksekusi:** *Method* `suara()` yang dieksekusi adalah milik `Kucing` (`meong`).
- **Penjelasan:** Tipe statis dari variabel `h` adalah `Hewan` (menentukan variabel atau *method* apa saja yang valid dipanggil saat kompilasi). Namun, tipe dinamis dari `h` saat *runtime* adalah `Kucing`. Karena `suara()` di-*override* oleh kelas `Kucing`, Java menggunakan *Dynamic Method Dispatch* untuk mengeksekusi *method* `suara()` milik tipe dinamisnya (`Kucing`).

#### Bagian B:

* **Prediksi Output `new B()`:**  
  Saat *constructor* `B()` dipanggil, ia pertama-tama mengeksekusi `super()` yaitu *constructor* `A()`. Di dalam *constructor* `A()`, *method* `init()` dipanggil. Karena `init()` telah di-*override* di kelas `B`, *method* `init()` milik `B` yang dijalankan. Pada momen tersebut, inisialisasi *field* `int nilai = 5` di kelas `B` belum dilakukan (masih berupa nilai *default* integer `0`).

* **Risiko:**  
  Memanggil *method* yang dapat di-*override* (*overridable method*) dari dalam *constructor* sangat berbahaya karena *method subclass* dapat tereksekusi sebelum *instance variable subclass* diinisialisasi secara penuh.

#### Bagian C:

* **Analisis `l3.luas()`:**
  * **Mengapa `0.0`?**  
    Karena variabel `l3` merujuk ke *instance* `Titik`. Berdasarkan prinsip polimorfisme, *method* `luas()` milik `Titik` yang dieksekusi, yang mengembalikan nilai `return 0.0`.
  * **Apakah masuk akal?**  
    Tidak masuk akal. Secara hierarki dunia nyata maupun matematis, `Titik` bukanlah jenis dari `Lingkaran` (*Titik is not a Lingkaran*).

* **Konsekuensi:**  
  Jika *method* lain mengekspektasikan setiap objek `Lingkaran` pasti memiliki area luas `> 0`, program akan menghasilkan *logical bug* saat disisipi objek `Titik`.

---

### Jawaban Soal 3
**Pertanyaan:**  
Apa yang tercetak pada baris kedua saat `System.out.println(g2);` dijalankan dan mengapa?

* **Prediksi Awal:**
  * **Jika TIDAK memakai Defensive Copy:**  
    Outputnya akan `(100.0, 1.0) - (5.0, 5.0)`. Soalnya kalau referensi titiknya hanya dioper biasa, begitu nilai `t.setX(100)` diubah dari luar, data garis `g2` ikut berubah (*terjadi masalah aliasing*).
  * **Jika MEMAKAI Defensive Copy (Kondisi Kode yang Benar):**  
    Outputnya tetap `(1.0, 1.0) - (5.0, 5.0)` karena data titik di dalam garis sudah dikloning atau dibuatkan objek baru yang terpisah.

* **Kapan Perilaku Sebelum / Sesudah Perbaikan Lebih Tepat?**
  * **Sebelum Perbaikan (*Shared Reference*):** Tepat saat kita menginginkan *shared state mutabel* secara *real-time* (misalnya 2 elemen grafis yang terhubung ke satu *node* pusat yang sama).
  * **Sesudah Perbaikan (*Defensive Copy*):** Tepat saat kita menginginkan *immutability* dan enkapsulasi penuh di mana *state* internal `Garis` tidak boleh diubah secara sengaja maupun tidak sengaja oleh pihak eksternal.

* **Masalah Desain jika `Garis extends Titik`:**
  * **Pelanggaran Relasi:** Terjadi pelanggaran konsep *is-a*. `Garis` bukanlah sebuah `Titik`, melainkan `Garis` memiliki dua buah `Titik` (*has-a*).
  * **Redundansi & Keanehan Data:** Jika `Garis` diwarisi dari `Titik`, `Garis` akan mewarisi nilai `x` dan `y` tunggal dari *parent*-nya yang tidak relevan bagi bentuk geometri sebuah garis yang memerlukan koordinat awal dan akhir.
---

## 💡 Analisis Konsep Pemrograman Berorientasi Objek

---
1. **Perbedaan Method Overriding dan Method Overloading serta Kaitannya:**
   - **Method Overriding:** Terjadi saat kelas anak (*subclass*) menulis ulang *method* milik kelas induk (*superclass*) dengan nama, parameter, dan *return type* yang sama persis untuk mengubah atau menyesuaikan perilakunya.  
     *Contoh:* *Method* `infoSingkat()` pada `LaptopGaming` yang menggantikan `infoSingkat()` milik `Perangkat` agar bisa menampilkan informasi GPU tambahan.
   - **Method Overloading:** Pemakaian nama *method* yang sama dalam satu kelas tetapi dengan jumlah atau tipe parameter yang berbeda.  
     *Contoh:* Konstruktor `Garis(Titik, Titik)` dan `Garis(double, double, double, double)`.
   - **Perbedaan Utama:** Terletak pada waktu eksekusinya, di mana *overriding* bekerja saat program berjalan (*runtime polymorphism*), sedangkan *overloading* ditentukan saat kode dikompilasi (*compile-time polymorphism*).

2. **Memilih Antara Inheritance vs Composition:**
   - **Inheritance (Pewarisan):** Digunakan ketika hubungan antar-kelas bersifat hirarki murni **"is-a"** (adalah sebuah).  
     *Contoh:* Kelas `Laptop` menggunakan `extends Perangkat` karena `Laptop` memang merupakan sebuah perangkat elektronik yang mewarisi sifat dasar dari induknya.
   - **Composition (Komposisi):** Dipakai ketika hubungan antar-objek bersifat **"has-a"** (memiliki atau tersusun dari).  
     *Contoh:* Kelas `Garis` yang menyimpan objek `Titik` awal dan akhir, karena `Garis` bukanlah sebuah `Titik`, melainkan bentuk geometris yang tersusun atas dua buah objek `Titik`.

3. **Polimorfisme `cetakStruk()` vs Downcasting `hitungPerJenis()`:**
   - **Mengapa `cetakStruk()` tidak butuh `instanceof`?**  
     *Method* `cetakStruk()` memanfaatkan fitur polimorfisme murni di mana Java secara otomatis memanggil *method* `deskripsi()` sesuai tipe asli (*runtime type*) dari masing-masing objek.
   - **Mengapa `hitungPerJenis()` memerlukan `instanceof`?**  
     Program harus memilah dan memproses rekapitulasi data khusus untuk tipe *subclass* tertentu. Proses pengelompokan ini membutuhkan *downcasting* (mengubah tipe referensi induk kembali ke tipe spesifik anaknya).
   - **Mengapa *downcasting* tidak selalu aman?**  
     Melakukan *downcasting* secara paksa tanpa diproteksi oleh pengecekan `instanceof` sangat berbahaya karena jika tipe objek sebenarnya tidak sesuai, Java akan melempar *error* `ClassCastException` yang menyebabkan program *crash* saat dijalankan.

---

## 🛑 Batasan dan Pengembangan Lanjutan

### Batasan Program Saat Ini
- **Antarmuka Pengguna (UI):** Program masih berbasis *Command Line Interface* (CLI) atau terminal sederhana, belum memiliki antarmuka grafis (GUI) yang interaktif.
- **Persistensi Data:** Data keranjang belanja dan objek lainnya disimpan secara sementara di memori (*RAM/runtime*), sehingga data akan hilang begitu program ditutup dan belum terhubung ke *database*.
- **Validasi Input:** Validasi input dari pengakses/pengguna baru diterapkan pada skenario bawaan (*hardcoded test case* di metode `main`), belum menyediakan *input scanner* dinamis secara langsung.

### Rencana Pengembangan Lanjutan
- **Antarmuka Grafis (GUI):** Mengembangkan tampilan antarmuka interaktif menggunakan **JavaFX** atau **Swing** agar aplikasi lebih nyaman digunakan.
- **Integrasi Database:** Menambahkan sistem basis data (seperti MySQL atau SQLite) untuk menyimpan data produk dan histori transaksi secara permanen.
- **Sistem Pembayaran & Fitur Bundel:** Mengimplementasikan modul `ProdukBundel` (opsional) serta menambahkan simulasi metode pembayaran digital (e-wallet / transfer bank).


