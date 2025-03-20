public class Sewa {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private int durasi;
    private double totalBiaya;
    private boolean transaksiBerhasil;

    public Sewa(Pelanggan pelanggan, Mobil mobil, int durasi) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.durasi = durasi;
        this.prosesPenyewaan();
    }

    private void prosesPenyewaan() {
        if (mobil.isTersedia()) {
            mobil.setTersedia(false);
            totalBiaya = durasi * mobil.getHargaSewaPerHari();
            totalBiaya = Utility.hitungDiskon(totalBiaya, durasi);
            transaksiBerhasil = true;
            cetakStruk();
        } else {
            System.out.println("Transaksi gagal! Mobil tidak tersedia.");
        }
    }

    private void cetakStruk() {
        System.out.println("\nSTRUK PENYEWAAN");
        pelanggan.tampilkanInfo();
        mobil.tampilkanInfo();
        System.out.println("Durasi Sewa: " + durasi + " hari");
        System.out.println("Total Biaya: " + Utility.formatRupiah(totalBiaya));
        System.out.println("Status Transaksi: " + (transaksiBerhasil ? "Berhasil" : "Gagal"));
    }
}
