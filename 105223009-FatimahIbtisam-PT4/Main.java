public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("B 1234 XYZ", "Wuling", 300000, true);
        Mobil mobil2 = new Mobil("B 5678 ABC", "Alphard", 350000, true);

        System.out.println("DAFTAR MOBIL TERSEDIA");
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();

        Pelanggan pelanggan1 = new Pelanggan("Andi", "320101010101", "08123456789");

        if (mobil1.isTersedia()) {
            Sewa sewa1 = new Sewa(pelanggan1, mobil1, 6);
        } else {
            System.out.println("Mobil sudah tidak tersedia.");
        }

        System.out.println("\nSTATUS MOBIL SETELAH TRANSAKSI");
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
    }
}
