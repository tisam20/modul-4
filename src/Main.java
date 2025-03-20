public class Main {
    public static void main(String[] args) {
        //membuat object dari class Mahasiswa 
        //Mahasiswa mhs1 = new Mahasiswa("Eko", "1234", "Teknik Informatika");

        Mahasiswa mhs1 = new Mahasiswa();  
        mhs1.nama = "Eko";
        mhs1.nim = "12345";
        mhs1.jurusan = "Teknik Informatika";
        
        
        //mencetak nama dari object mhs1
        System.out.println(mhs1.nama);
        System.out.println(mhs1.nim);
        System.out.println(mhs1.jurusan);
        mhs1.belajar();
        System.out.println(mhs1.getNama());
        Mahasiswa.kuliah();
        System.out.println(Mahasiswa.angkatan);
        
        mhs1.belajar();
        mhs1.belajar("wahyu");
        
        mhs1.nama = "Joko";
        
        Mahasiswa mhs2 = new Mahasiswa();  
        mhs2.nama = "Eko";
        mhs2.nim = "12345";
        mhs2.jurusan = "Teknik Informatika";
        // Mahasiswa mhs2 = new Mahasiswa("Budi", "67890", "Sistem Informasi");

        //mencetak nama dari object mhs2
        System.out.println(mhs2.nama);
        System.out.println(mhs2.nim);
        System.out.println(mhs2.jurusan);
        
    }
    
}
