package menu;

public class Diskon extends MenuItem {

    private double persenDiskon;

    public Diskon(String nama, double harga, String kategori, double persenDiskon) {
        super(nama, harga, kategori);
        this.persenDiskon = persenDiskon;
    }

    @Override
    public void tampilMenu() {
        System.out.println("Diskon: " + getNama());
        System.out.println("   Persen: " + persenDiskon + "%");
    }

    public double getPersenDiskon() {
        return persenDiskon;
    }

@Override
public String toDataString() {
    return getNama() + ";" + getHarga() + ";" + getKategori() + ";" + persenDiskon;
}
}
