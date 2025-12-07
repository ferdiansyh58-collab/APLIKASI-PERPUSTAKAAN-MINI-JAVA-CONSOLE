public class Book {
    private String id;
    private String judul;
    private String penulis;
    private boolean dipinjam;

    // Constructor tanpa parameter (overloading)
    public Book() {}

    // Constructor dengan parameter
    public Book(String id, String judul, String penulis) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
    }

    // Getter & Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public boolean isDipinjam() { return dipinjam; }

    // Method behavior
    public void pinjamBuku() {
        dipinjam = true;
    }

    public void kembalikanBuku() {
        dipinjam = false;
    }

    public void tampilkanInfo() {
        System.out.println(id + " | " + judul + " | " + penulis +
                " | Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
    }
}
