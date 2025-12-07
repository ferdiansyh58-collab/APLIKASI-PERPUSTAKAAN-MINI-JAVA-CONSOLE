Laporan Aplikasi Mini Berbasis Java Console
(Pemrograman Berorientasi Objek – PBO)

👤 Developer
Nama    : Ferdi Ardiansyah
NIM     : 1003250050
Kelas   : Pemrograman Berorientasi Objek

 BAB I – PENDAHULUAN
1.1 Latar Belakang

Perkembangan teknologi mendorong kebutuhan akan sistem yang terstruktur dalam berbagai bidang, seperti pengelolaan perpustakaan, pengisian KRS, dan transaksi penjualan.
Proyek ini dibuat untuk memodelkan sistem tersebut dalam bentuk aplikasi berbasis console menggunakan Java dengan pendekatan Pemrograman Berorientasi Objek (PBO).

1.2 Tujuan Proyek

Tujuan pembelajaran dari proyek ini adalah:
Memahami konsep class dan object
Menerapkan constructor dan constructor overloading
Menggunakan enkapsulasi (private, getter, setter)
Mengelola data menggunakan ArrayList
Mengimplementasikan method dengan parameter dan return value

 BAB II – PERANCANGAN (DESIGN)
2.1 Identifikasi Objek Utama
 **Sistem Perpustakaan**
Class	Fungsi
Book	Menyimpan data buku
Member	Menyimpan data anggota
Library	Mengelola buku dan anggota

 **Sistem KRS**
Class	Fungsi
Student	Menyimpan data mahasiswa
Course	Menyimpan data mata kuliah
KRS	Mengelola pengambilan mata kuliah

**Sistem Vending Machine / Toko**
Class	Fungsi
Product	Menyimpan data produk
VendingMachine	Mengelola stok produk
Transaction	Mengelola transaksi

2.2 Relasi Antar Class

Contoh relasi has-a:
Library ──> ArrayList<Book>
KRS ──> ArrayList<Course>
VendingMachine ──> ArrayList<Product>

 BAB III – IMPLEMENTASI
3.1 Contoh Class (Book)
private String id;
private String judul;
private String penulis;
private boolean dipinjam;

Atribut private → penerapan enkapsulasi
Data diakses menggunakan getter dan setter

3.2 Constructor & Overloading
public Book() { }

public Book(String id, String judul, String penulis) {
    this.id = id;
    this.judul = judul;
    this.penulis = penulis;
}

3.3 Method dengan Parameter & Return
public boolean isDipinjam() {
    return dipinjam;
}

3.4 Penggunaan ArrayList
private ArrayList<Book> daftarBuku = new ArrayList<>();


Digunakan untuk:
add() → menambah data
for-each → menampilkan data
if → mencari data
3.5 Alur Program Utama
Mulai
↓
Tampilkan Menu
↓
Input User
↓
Proses Data
↓
Tampilkan Hasil
↓
Selesai

 BAB IV – PENGUJIAN
4.1 Skenario Pengujian
No	Skenario	Hasil
1	Menambah data	Berhasil
2	Mencari data	Ditemukan
3	Input tidak valid	Pesan error tampil
4.2 Contoh Output
Perpustakaan
ID Buku : B001
Judul   : The Last Earth
Penulis : Tere Liye
✅ Buku berhasil ditambahkan

KRS
Kode MK : IF101
Nama MK : Algoritma
SKS     : 3
✅ Mata kuliah berhasil ditambahkan

Vending Machine
Produk : Teh Botol
Harga  : 5000
✅ Produk berhasil ditambahkan

 BAB V – KESIMPULAN
5.1 Kesimpulan
Dari proyek ini dapat disimpulkan bahwa konsep PBO membantu dalam menciptakan program yang terstruktur dan mudah dikembangkan.

Konsep yang dipelajari:
Class & Object
Enkapsulasi
Constructor
ArrayList
Method (parameter & return)

5.2 Keterbatasan dan Pengembangan

Keterbatasan:
Belum menggunakan database
Program hanya berjalan saat runtime

Rencana Pengembangan:
Integrasi database (MySQL)
Pembuatan GUI
Versi berbasis Web
