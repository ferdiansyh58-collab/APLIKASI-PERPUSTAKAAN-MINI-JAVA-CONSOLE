import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // ================= DATA AWAL =================
        library.tambahBuku(new Book("B001", "Bumi", "Tere Liye"));
        library.tambahBuku(new Book("B002", "Laskar Pelangi", "Andrea Hirata"));
        library.tambahBuku(new Book("B003", "Bumi Manusia", "Pramoedya Ananta Toer"));
        library.tambahBuku(new Book("B004", "Rumah Kaca", "Pramoedya Ananta Toer"));
        library.tambahBuku(new Book("B005", "Cantik Itu Luka", "Eka Kurniawan"));

        library.tambahMember(new Member("M001", "Ardiansyah"));
        library.tambahMember(new Member("M002", "Budi"));
        library.tambahMember(new Member("M003", "Ferdi"));
        library.tambahMember(new Member("M004", "Alpin"));
        library.tambahMember(new Member("M005", "Rudi"));

        int pilihan = -1;

        while (pilihan != 0) {
            System.out.println("\n===============================");
            System.out.println("   SISTEM PERPUSTAKAAN MINI");
            System.out.println("===============================");
            System.out.println("1. Lihat Daftar Buku");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Daftar Anggota Baru");
            System.out.println("4. Lihat Daftar Anggota");
            System.out.println("5. Pinjam Buku");
            System.out.println("6. Kembalikan Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Input harus berupa angka!");
                continue;
            }

            switch (pilihan) {
                case 1:
                    library.tampilkanSemuaBuku();
                    break;

                case 2:
                    System.out.print("ID Buku: ");
                    String id = sc.nextLine();
                    System.out.print("Judul Buku: ");
                    String judul = sc.nextLine();
                    System.out.print("Penulis: ");
                    String penulis = sc.nextLine();

                    Book bukuBaru = new Book(id, judul, penulis);
                    library.tambahBuku(bukuBaru);
                    break;

                case 3:
                    System.out.print("ID Anggota: ");
                    String idMember = sc.nextLine();
                    System.out.print("Nama Anggota: ");
                    String nama = sc.nextLine();

                    Member memberBaru = new Member(idMember, nama);
                    library.tambahMember(memberBaru);
                    break;

                case 4:
                    library.tampilkanMember();
                    break;

                case 5:
                    System.out.print("Masukkan ID Buku yang dipinjam: ");
                    String idPinjam = sc.nextLine();
                    library.pinjamBuku(idPinjam);
                    break;

                case 6:
                    System.out.print("Masukkan ID Buku yang dikembalikan: ");
                    String idKembali = sc.nextLine();
                    library.kembalikanBuku(idKembali);
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }
        }

        sc.close();
    }
}
