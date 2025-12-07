import java.util.ArrayList;

public class Library {
    private ArrayList<Book> daftarBuku;
    private ArrayList<Member> daftarMember;

    // Constructor
    public Library() {
        this.daftarBuku = new ArrayList<>();
        this.daftarMember = new ArrayList<>();
    }

    // ================== BOOK SECTION ==================

    public void tambahBuku(Book buku) {
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan!");
    }

    public void tampilkanSemuaBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku.");
            return;
        }

        System.out.println("\n=== Daftar Buku ===");
        for (Book b : daftarBuku) {
            b.tampilkanInfo();
        }
    }

    public Book cariBukuById(String id) {
        for (Book b : daftarBuku) {
            if (b.getId().equalsIgnoreCase(id)) {
                return b;
            }
        }
        return null;
    }

    public void pinjamBuku(String id) {
        Book buku = cariBukuById(id);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan!");
        } else if (buku.isDipinjam()) {
            System.out.println("Buku sedang dipinjam.");
        } else {
            buku.pinjamBuku();
            System.out.println("Buku berhasil dipinjam.");
        }
    }

    public void kembalikanBuku(String id) {
        Book buku = cariBukuById(id);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan!");
        } else if (!buku.isDipinjam()) {
            System.out.println("Buku tidak sedang dipinjam.");
        } else {
            buku.kembalikanBuku();
            System.out.println("Buku berhasil dikembalikan.");
        }
    }

    // ================== MEMBER SECTION ==================

    public void tambahMember(Member m) {
        daftarMember.add(m);
        System.out.println("Anggota berhasil ditambahkan!");
    }

    public void tampilkanMember() {
        if (daftarMember.isEmpty()) {
            System.out.println("Tidak ada anggota.");
            return;
        }

        System.out.println("\n=== Daftar Anggota ===");
        for (Member m : daftarMember) {
            m.tampilkanInfo();
        }
    }
}
