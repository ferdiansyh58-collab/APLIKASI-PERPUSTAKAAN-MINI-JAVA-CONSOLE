import java.util.Scanner;

public class VendingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();

        vm.tambahProduk(new Product("Aqua 1 LITER", 7500, 10));
        vm.tambahProduk(new Product("Teh Pucuk", 4500, 7));
        vm.tambahProduk(new Product("Tanggo", 3500, 13));
        vm.tambahProduk(new Product("Kecap Bango", 9500, 9));
        vm.tambahProduk(new Product("Saos ABC", 9500, 11));

        int menu;
        do {
            System.out.println("\n=== MENU VENDING MACHINE ===");
            System.out.println("1. Lihat Produk");
            System.out.println("2. Beli Produk");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt(); sc.nextLine();

            if (menu == 1) {
                vm.tampilkanProduk();
            } 
            else if (menu == 2) {
                System.out.print("Nama produk: ");
                String nama = sc.nextLine();
                System.out.print("Jumlah: ");
                int jumlah = sc.nextInt();

                Product p = vm.cariProduk(nama);
                if (p != null && p.getStok() >= jumlah) {
                    Transaction t = new Transaction(p, jumlah);
                    p.kurangiStok(jumlah);
                    System.out.println("Total bayar: Rp" + t.hitungTotal());
                }
            }
        } while (menu != 0);
    }
}
