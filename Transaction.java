public class Transaction {
    private Product produk;
    private int jumlah;

    public Transaction(Product produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public int hitungTotal() {
        return produk.getHarga() * jumlah;
    }
}
