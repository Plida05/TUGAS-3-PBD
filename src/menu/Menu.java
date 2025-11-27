package menu;

import java.io.*;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> daftarMenu = new ArrayList<>();

    public void tambahItem(MenuItem item) {
        daftarMenu.add(item);
    }

    public void tampilkanMenu() {
        for (MenuItem item : daftarMenu) {
            item.tampilMenu();
            System.out.println();
        }
    }

    public MenuItem cariByNama(String nama) throws MenuItemNotFoundException {
        for (MenuItem item : daftarMenu) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                return item;
            }
        }
        throw new MenuItemNotFoundException("Item '" + nama + "' tidak ditemukan!");
    }

    public void simpanMenuKeFile(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (MenuItem item : daftarMenu) {
                bw.write(item.getNama() + ";" + item.getHarga() + ";" + item.getKategori());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Gagal menyimpan menu: " + e.getMessage());
        }
    }

    public void loadMenuDariFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");

                String nama = data[0];
                double harga = Double.parseDouble(data[1]);
                String kategori = data[2];

                if (kategori.equals("Makanan")) {
                    daftarMenu.add(new Makanan(nama, harga, kategori, "Tidak diketahui"));
                } else if (kategori.equals("Minuman")) {
                    daftarMenu.add(new Minuman(nama, harga, kategori, "Tidak diketahui"));
                } else if (kategori.equals("Diskon")) {
                    daftarMenu.add(new Diskon(nama, harga, kategori, 10));
                }
            }

        } catch (Exception e) {
            System.out.println("Gagal membaca file menu: " + e.getMessage());
        }
    }
}
