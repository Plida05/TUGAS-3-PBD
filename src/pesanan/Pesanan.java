package pesanan;

import menu.*;
import java.io.*;
import java.util.ArrayList;

public class Pesanan {

    private ArrayList<MenuItem> listPesanan = new ArrayList<>();

    public void tambahPesanan(MenuItem item) {
        listPesanan.add(item);
    }

    public void tampilkanStruk() {
        double total = 0;
        double diskon = 0;

        System.out.println("===== STRUK PEMBELIAN =====");

        for (MenuItem item : listPesanan) {
            System.out.println("- " + item.getNama() + " : " + item.getHarga());
            total += item.getHarga();

            if (item instanceof Diskon disk) {
                diskon += (total * disk.getPersenDiskon() / 100);
            }
        }

        System.out.println("---------------------------");
        System.out.println("Subtotal : " + total);
        System.out.println("Diskon   : " + diskon);
        System.out.println("Total    : " + (total - diskon));
        System.out.println("===========================");
    }

    public void simpanStrukKeFile(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

            double total = 0;
            double diskon = 0;

            bw.write("===== STRUK PEMBELIAN =====\n");

            for (MenuItem item : listPesanan) {
                bw.write("- " + item.getNama() + " : " + item.getHarga() + "\n");
                total += item.getHarga();

                if (item instanceof Diskon d) {
                    diskon += (total * d.getPersenDiskon() / 100);
                }
            }

            bw.write("----------------------------\n");
            bw.write("Subtotal : " + total + "\n");
            bw.write("Diskon   : " + diskon + "\n");
            bw.write("Total    : " + (total - diskon) + "\n");

        } catch (Exception e) {
            System.out.println("Gagal menyimpan struk: " + e.getMessage());
        }
    }
}
