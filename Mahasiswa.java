public class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() { return nim; }
    public void tampilkanInfo() {
        System.out.println(nim + " - " + nama);
    }
}
