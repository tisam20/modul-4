public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Eko", "12345", "Teknik Informatika", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("Budi", "67890", "Sistem Informasi", 4.0);

        // Menampilkan informasi mahasiswa
        System.out.println("Informasi Mahasiswa 1:");
        mhs1.tampilkanInfo();
        System.out.println("Lulus: " + mhs1.cekLulus());
        System.out.println();

        System.out.println("Informasi Mahasiswa 2:");
        mhs2.tampilkanInfo();
        System.out.println("Lulus: " + mhs2.cekLulus());
    }
}