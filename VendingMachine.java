import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Product> daftarProduk = new ArrayList<>();

    public void tambahProduk(Product p) {
        daftarProduk.add(p);
    }

    public void tampilkanProduk() {
        for (Product p : daftarProduk) {
            p.tampilkanInfo();
        }
    }

    public Product cariProduk(String nama) {
        for (Product p : daftarProduk) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                return p;
            }
        }
        return null;
    }
}
