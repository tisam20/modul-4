public class Mahasiswa {

    //atribut
    String nama;
    String nim;
    String jurusan;
    boolean isLulus = false;
    static int angkatan = 2019;

    //konstruktor
    // Mahasiswa(String nama, String nim, String jurusan) {
    //     this.nama = nama;
    //     this.nim = nim;
    //     this.jurusan = jurusan;
    // }

    void belajar() {
        System.out.println(nama + " sedang belajar");
    }

    void belajar(String nama) {
        System.out.println(this.nama + " sedang belajar");
    }

    String getNama() {
        return nama;
    }

    static void kuliah() {
        System.out.println("Mahasiswa sedang kuliah");
    }
    class Dalam{
        void test() {
            System.out.println("ini adalah inner class");
        }
    }
}