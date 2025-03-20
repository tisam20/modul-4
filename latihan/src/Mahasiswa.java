public class Mahasiswa {
    // Atribut
    String nama;
    String nim;
    String jurusan;
    double ipk;

    // Constructor untuk inisialisasi data mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
    }

    // Method untuk mengecek apakah mahasiswa lulus atau tidak
    public boolean cekLulus() {
        return ipk >= 3.0;
    }
}
