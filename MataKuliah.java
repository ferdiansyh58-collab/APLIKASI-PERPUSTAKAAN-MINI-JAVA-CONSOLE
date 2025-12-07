public class MataKuliah {
    // Atribut (enkapsulasi)
    private String kodeMK;
    private String namaMK;
    private int sks;

    // Constructor tanpa parameter
    public MataKuliah() {
    }

    // Constructor dengan parameter (overloading)
    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    // Getter
    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public int getSks() {
        return sks;
    }

    // Setter
    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    // Method untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + namaMK);
        System.out.println("SKS     : " + sks);
    }
}
