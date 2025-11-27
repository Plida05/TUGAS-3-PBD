package menu;

public class Minuman extends MenuItem {
    private String jenisMinuman; // misal "Panas", "Dingin", "Dingin dengan Es"

    public Minuman(String nama, double harga, String kategori, String jenisMinuman) {
        super(nama, harga, kategori);
        this.jenisMinuman = jenisMinuman;
    }

    public String getJenisMinuman() {
        return jenisMinuman;
    }

    public void setJenisMinuman(String jenisMinuman) {
        this.jenisMinuman = jenisMinuman;
    }

    @Override
    public void tampilMenu() {
        System.out.printf("Minuman  : %s | Harga: %.2f | Kategori: %s | Jenis: %s%n",
                getNama(), getHarga(), getKategori(), jenisMinuman);
    }

    @Override
    public String toDataString() {
        // Format: MINUMAN;nama;harga;kategori;jenisMinuman
        return String.format("MINUMAN;%s;%.2f;%s;%s", getNama(), getHarga(), getKategori(), jenisMinuman);
    }
}
