import java.util.ArrayList;

public class KRS {
    private ArrayList<MataKuliah> daftarMK = new ArrayList<>();

    public void tambahMataKuliah(MataKuliah mk) {
        daftarMK.add(mk);
    }

    public int hitungTotalSKS() {
        int total = 0;
        for (MataKuliah mk : daftarMK) {
            total += mk.getSks();
        }
        return total;
    }

    public void tampilkanKRS() {
        for (MataKuliah mk : daftarMK) {
            mk.tampilkanInfo();
        }
    }
}
