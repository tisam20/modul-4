public class Utility {
    public static double hitungDiskon(double total, int durasi) {
        if (durasi > 5) {
            return total * 0.9;
        }
        return total;
    }

    public static String formatRupiah(double angka) {
        String angkaString = String.valueOf((long) angka);
        StringBuilder hasil = new StringBuilder();
        int count = 0;

        for (int i = angkaString.length() - 1; i >= 0; i--) {
            hasil.insert(0, angkaString.charAt(i));
            count++;
            if (count % 3 == 0 && i != 0) {
                hasil.insert(0, ".");
            }
        }
        return "Rp " + hasil.toString();
    }
}
