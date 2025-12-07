import java.util.Scanner;

public class KRSApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KRS krs = new KRS();

        // === DATA AWAL MATA KULIAH ===
        krs.tambahMataKuliah(new MataKuliah("IF201", "Pemrograman Berorientasi Objek", 8));
        krs.tambahMataKuliah(new MataKuliah("IF202", "Rekayasa Perangkat Lunak", 10));
        krs.tambahMataKuliah(new MataKuliah("IF203", "Struktur Data", 8));

        int pilihan;

        do {
            System.out.println("\n=== MENU SISTEM KRS ===");
            System.out.println("1. Lihat Daftar Mata Kuliah");
            System.out.println("2. Tambah Mata Kuliah");
            System.out.println("3. Cari Mata Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            while (!input.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                input.next();
                System.out.print("Pilih menu: ");
            }

            pilihan = input.nextInt();
            input.nextLine(); // bersihkan buffer

            switch (pilihan) {
                case 1:
                    krs.tampilkanKRS();
                    break;

                case 2:
                    System.out.print("Kode MK : ");
                    String kode = input.nextLine();

                    System.out.print("Nama MK : ");
                    String nama = input.nextLine();

                    System.out.print("SKS     : ");
                    int sks = input.nextInt();
                    input.nextLine();

                    MataKuliah mk = new MataKuliah(kode, nama, sks);
                    krs.tambahMataKuliah(mk);
                    break;

                case 3:
                    System.out.print("Masukkan Kode MK: ");
                    String cari = input.nextLine();

                    MataKuliah hasil = krs.cariMK(cari);
                    if (hasil != null) {
                        System.out.println("\nMata kuliah ditemukan:");
                        hasil.tampilkanInfo();
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan!");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan Sistem KRS.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilihan != 0);

        input.close();
    }
}
