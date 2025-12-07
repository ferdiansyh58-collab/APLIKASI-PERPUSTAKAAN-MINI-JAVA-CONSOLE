👤 Developer
Nama    : Ferdi Ardiansyah
NIM     : 1003250050
Kelas   : Pemrograman Berorientasi Objek

Aplikasi Console Java – Mini System
(Perpustakaan, KRS, dan Vending Machine)

Deskripsi Proyek
Aplikasi ini adalah program berbasis console (terminal) menggunakan bahasa Java yang menerapkan konsep Pemrograman Berorientasi Objek (PBO).
Program ini terdiri dari tiga sistem utama:
1.	Sistem Manajemen Perpustakaan
2.	Sistem KRS / Pengisian Mata Kuliah
3.	Sistem Vending Machine / Toko Sederhana


Semua sistem dibuat untuk melatih penggunaan:
•	Class dan Object
•	Constructor dan Overloading
•	Enkapsulasi (private, getter, setter)
•	ArrayList
•	Method dengan parameter & return value

1. Sistem Perpustakaan
Fitur:
•	Tambah buku
•	Tampilkan semua buku
•	Cari buku berdasarkan ID
•	Pinjam & kembalikan buku
Class yang digunakan:
•	Book
•	Member
•	Library
•	LibraryApp

2. Sistem KRS
Fitur:
•	Tambah mata kuliah
•	Tampilkan daftar mata kuliah
•	Cari mata kuliah
•	Daftar mata kuliah default tersedia saat program berjalan
Class yang digunakan:
•	MataKuliah
•	KRS
•	KRSApp
3. Sistem Vending Machine / Toko Sederhana
Fitur:
•	Tambah produk
•	Tampilkan daftar produk
•	Cari produk

Class yang digunakan:
•	Product
•	VendingMachine
•	VendingApp
 Cara Menjalankan Program
Syarat:
•	Sudah terinstal JDK
•	File .java berada dalam satu folder

Compile: javac *.java
Jalankan Program

Perpustakaan:
java LibraryApp
KRS:
java KRSApp
Vending Machine:
java VendingApp

Konsep PBO yang Diterapkan:
1.Class & Object
2.Enkapsulasi
3.Constructor
4.Ovearloading
5.Getter & Setter
6.ArrayList
7.Method Parameter
8.Return Value
Contoh Output
Menampilkan Daftar Buku :
=== MENU PERPUSTAKAAN ===
1. Lihat daftar buku
2. Tambah buku
3. Pinjam buku
4. Kembalikan buku
0. Keluar
Pilih menu: 1

=== Daftar Buku ===
ID     : B001
Judul  : The Last Earth
Penulis: Tere Liye
Status : Tersedia
------------------------
ID     : B002
Judul  : Laskar Pelangi
Penulis: Andrea Hirata
Status : Tersedia
------------------------
Menambah Buku
Pilih menu: 2
Masukkan ID Buku : B002
Judul Buku       : Laskar Pelangi
Penulis          : Andrea Hirata
Buku berhasil ditambahkan

Pinjam Buku
Pilih menu: 3
Masukkan ID Buku yang ingin dipinjam: B001
Buku berhasil dipinjam

Kembalikan Buku
Pilih menu: 4
Masukkan ID Buku yang ingin dikembalikan: B001
Buku berhasil dikembalikan

Input Menu Salah
Pilih menu: 9
Menu tidak tersedia

Contoh Output – Sistem KRS
Tampilkan Daftar Mata Kuliah :
=== MENU KRS ===
1. Lihat Mata Kuliah
2. Tambah Mata Kuliah
3. Cari Mata Kuliah
0. Keluar
Pilih menu: 1

=== Daftar Mata Kuliah ===
Kode MK : IF201
Nama MK : Pemrograman Berorientasi Objek
SKS     : 8
-------------------------
Kode MK : IF202
Nama MK : Rekayasa Perangkat Lunak
SKS     : 10
-------------------------
Kode MK : IF203
Nama MK : Struktur Data
SKS     : 8
-------------------------

Tambah Mata Kuliah
Pilih menu: 2

Kode MK : IF201
Nama MK : Pemrograman Berorientasi Objek
SKS     : 10
Mata kuliah berhasil ditambahkan

Cari Mata Kuliah
Pilih menu: 3

Masukkan Kode MK: IF201
Mata kuliah ditemukan:
Kode MK : IF201
Nama MK : Pemrograman Berorientasi Objek
SKS     : 10



Contoh Output – Sistem Vending Machine / Toko
Tampilkan Daftar Produk :
=== MENU VENDING MACHINE ===
1. Lihat Produk
2. Beli Produk
0. Keluar
Pilih menu: 1
=== Daftar Produk ===
Produk : Aqua 1 LITER
Harga  : 7500
---------------------
Produk : The Pucuk
Harga  : 4500
---------------------
Beli Produk
Pilih menu: 2
Masukkan nama produk: Teh Pucuk
Produk ditemukan:
Produk : The Pucuk
Harga  : 4500
Keterbatasan Program
•	Data belum tersimpan ke database
•	Data hilang saat program ditutup

 Rencana Pengembangan
•	Menambahkan database MySQL
•	Membuat versi GUI
•	Membuat versi Web
