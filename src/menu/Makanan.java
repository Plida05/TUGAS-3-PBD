package menu;

public class Makanan extends MenuItem {
    private String jenisMakanan; // misal "Berat", "Ringan", "Cemilan"

    public Makanan(String nama, double harga, String kategori, String jenisMakanan) {
        super(nama, harga, kategori);
        this.jenisMakanan = jenisMakanan;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    @Override
    public void tampilMenu() {
        System.out.printf("Makanan  : %s | Harga: %.2f | Kategori: %s | Jenis: %s%n",
                getNama(), getHarga(), getKategori(), jenisMakanan);
    }

    @Override
    public String toDataString() {
        // Format: MAKANAN;nama;harga;kategori;jenisMakanan
        return String.format("MAKANAN;%s;%.2f;%s;%s", getNama(), getHarga(), getKategori(), jenisMakanan);
    }
}
