import java.util.ArrayList;

public class KRS {
    private ArrayList<MataKuliah> daftarMK = new ArrayList<>();

    // Method tambah MK
    public void tambahMataKuliah(MataKuliah mk) {
        daftarMK.add(mk);
        System.out.println("Mata kuliah berhasil ditambahkan");
    }

    // Method tampilkan semua MK
    public void tampilkanKRS() {
        if (daftarMK.isEmpty()) {
            System.out.println("Belum ada mata kuliah.");
            return;
        }

        System.out.println("=== Daftar Mata Kuliah ===");
        for (MataKuliah mk : daftarMK) {
            mk.tampilkanInfo();
            System.out.println("----------------------");
        }
    }

    // Method cari MK (pakai parameter & return)
    public MataKuliah cariMK(String kode) {
        for (MataKuliah mk : daftarMK) {
            if (mk.getKodeMK().equalsIgnoreCase(kode)) {
                return mk;
            }
        }
        return null;
    }
}
