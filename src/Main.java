import java.util.Scanner;

import menu.Menu;
import menu.MenuItem;
import menu.MenuItemNotFoundException;
import menu.Makanan;
import menu.Minuman;
import menu.Diskon;
import pesanan.Pesanan;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        Pesanan pesanan = new Pesanan();

        // Load menu dari file saat program mulai
        menu.loadMenuDariFile("menu.txt");

        int pilihan;

        do {
            System.out.println("\n========== MENU UTAMA ==========");
            System.out.println("1. Tambah Makanan");
            System.out.println("2. Tambah Minuman");
            System.out.println("3. Tambah Diskon");
            System.out.println("4. Tampilkan Menu");
            System.out.println("5. Buat Pesanan");
            System.out.println("6. Tampilkan Struk Pesanan");
            System.out.println("7. Simpan Menu ke File");
            System.out.println("8. Keluar");
            System.out.println("================================");
            System.out.print("Pilih menu: ");

            while (!input.hasNextInt()) {
                System.out.print("Input harus angka! Pilih menu: ");
                input.next();
            }
            pilihan = input.nextInt();
            input.nextLine(); // clear buffer

            switch (pilihan) {

                case 1:
                    System.out.print("Nama makanan : ");
                    String namaMkn = input.nextLine();
                    System.out.print("Harga : ");
                    double hargaMkn = input.nextDouble();
                    input.nextLine();
                    System.out.print("Jenis makanan (contoh: Berat/Ringan) : ");
                    String jenisMkn = input.nextLine();

                    menu.tambahItem(new Makanan(namaMkn, hargaMkn, "Makanan", jenisMkn));
                    System.out.println("Makanan berhasil ditambah!");
                    break;

                case 2:
                    System.out.print("Nama minuman : ");
                    String namaMin = input.nextLine();
                    System.out.print("Harga : ");
                    double hargaMin = input.nextDouble();
                    input.nextLine();
                    System.out.print("Jenis minuman (contoh: Dingin/Panas) : ");
                    String jenisMin = input.nextLine();

                    menu.tambahItem(new Minuman(namaMin, hargaMin, "Minuman", jenisMin));
                    System.out.println("Minuman berhasil ditambah!");
                    break;

                case 3:
                    System.out.print("Nama diskon : ");
                    String namaDiskon = input.nextLine();
                    System.out.print("Persentase diskon (0-100) : ");
                    double persenDiskon = input.nextDouble();
                    input.nextLine();

                    menu.tambahItem(new Diskon(namaDiskon, 0, "Diskon", persenDiskon));
                    System.out.println("Diskon berhasil ditambah!");
                    break;

                case 4:
                    System.out.println("\n===== DAFTAR MENU =====");
                    menu.tampilkanMenu();
                    break;

                case 5:
                    System.out.print("Masukkan nama item yang ingin dipesan : ");
                    String namaPesan = input.nextLine();

                    try {
                        MenuItem itemDipesan = menu.cariByNama(namaPesan);
                        pesanan.tambahPesanan(itemDipesan);
                        System.out.println("Pesanan berhasil ditambahkan!");
                    } catch (MenuItemNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 6:
                    System.out.println("\n===== STRUK PESANAN =====");
                    pesanan.tampilkanStruk();

                    System.out.println("\nSimpan struk ke file? (y/n): ");
                    String simpan = input.nextLine();
                    if (simpan.equalsIgnoreCase("y")) {
                        pesanan.simpanStrukKeFile("struk.txt");
                        System.out.println("Struk berhasil disimpan ke struk.txt");
                    }
                    break;

                case 7:
                    menu.simpanMenuKeFile("menu.txt");
                    System.out.println("Menu berhasil disimpan ke menu.txt!");
                    break;

                case 8:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 8);

        input.close();
    }
}
