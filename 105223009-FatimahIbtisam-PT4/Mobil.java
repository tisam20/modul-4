public class Mobil {
    private String nomorPlat;
    private String merek;
    private double hargaSewaPerHari;
    private boolean tersedia;

    // konstruktor berparameter
    public Mobil(String nomorPlat, String merek, double hargaSewaPerHari, boolean tersedia) {
        this.nomorPlat = nomorPlat;
        this.merek = merek;
        this.hargaSewaPerHari = hargaSewaPerHari;
        this.tersedia = tersedia;
    }

    // konstruktor default
    public Mobil() {
        this("Tidak ada", "Tidak ada", 0, true);
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Merek: " + merek);
        System.out.println("Harga Sewa: " + Utility.formatRupiah(hargaSewaPerHari) + " per hari");
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Tidak tersedia"));
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean status) {
        this.tersedia = status;
    }

    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }
}
