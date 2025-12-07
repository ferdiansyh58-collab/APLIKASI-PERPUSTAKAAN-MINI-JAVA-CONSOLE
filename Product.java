public class Product {
    private String nama;
    private int harga;
    private int stok;

    public Product() {} // overloading

    public Product(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() { return nama; }
    public int getHarga() { return harga; }
    public int getStok() { return stok; }

    public void kurangiStok(int jumlah) {
        stok -= jumlah; // pass by value
    }

    public void tampilkanInfo() {
        System.out.println(nama + " - Rp" + harga + " (Stok: " + stok + ")");
    }
}
