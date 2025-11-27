package pesanan;

public class Struk {
    public static void cetakStruk(String namaPelanggan, String namaBarang, int jumlah, double hargaSatuan) {

        double total = jumlah * hargaSatuan;
        double diskon = 0;

        if (total >= 50000) {
            diskon = total * 0.10;
        } else if (total >= 30000) {
            diskon = total * 0.05;
        }

        double totalAkhir = total - diskon;

        System.out.println("\n===============================");
        System.out.println("           STRUK BELANJA       ");
        System.out.println("===============================");
        System.out.println("Pelanggan : " + namaPelanggan);
        System.out.println("Barang    : " + namaBarang);
        System.out.println("Jumlah    : " + jumlah);
        System.out.println("Harga     : Rp" + hargaSatuan);
        System.out.println("-------------------------------");
        System.out.println("Total     : Rp" + total);
        System.out.println("Diskon    : Rp" + diskon);
        System.out.println("-------------------------------");
        System.out.println("TOTAL BAYAR : Rp" + totalAkhir);
        System.out.println("===============================");
        System.out.println("Terima kasih sudah berbelanja!");
    }
}
