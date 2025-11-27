# 📘 Tugas Praktikum Pemrograman Berorientasi Objek (OOP)

Proyek ini merupakan aplikasi pemesanan sederhana berbasis **Java OOP** yang menampilkan menu, menerima pesanan, menghitung total beserta diskon, dan mencetak struk pembelian. Program ini dibuat untuk memenuhi tugas praktikum mata kuliah **Pemrograman Berorientasi Objek**.

---

## 📂 Struktur Proyek

src/
│
├── menu/
│ ├── MenuItem.java
│ ├── MenuService.java
│ └── MenuItemNotFoundException.java
│
├── order/
│ ├── Order.java
│ └── OrderItem.java
│
├── struk/
│ └── ReceiptGenerator.java
│
└── Main.java


---

## 🚀 Fitur Utama

- Menampilkan daftar menu makanan/minuman
- Memproses pesanan beserta jumlahnya
- Validasi input dan penanganan error
- Menghitung subtotal, diskon, dan total akhir
- Mencetak struk transaksi secara rapi di terminal
- Menggunakan konsep OOP lengkap: *Encapsulation, Class/Object, Constructor, Package, Exception Handling*

---

## 🧩 Konsep OOP yang Diterapkan

### ✔️ **Encapsulation**
Semua atribut class dibuat private dan diakses melalui getter/setter.

### ✔️ **Class & Object**
Memisahkan entitas:
- `MenuItem`
- `MenuService`
- `Order`
- `OrderItem`
- `ReceiptGenerator`

### ✔️ **Exception Handling**
Custom exception:
- `MenuItemNotFoundException`

Digunakan untuk menangani input menu yang tidak tersedia.

### ✔️ **Package**
Struktur modular yang memisahkan fungsi berdasarkan domain:
- `menu`
- `order`
- `struk`

---

## ▶️ Cara Menjalankan Program

1. Pastikan struktur folder sudah sesuai.
2. Compile seluruh file:
   ```bash
   javac Main.java
3. Jalankan program
   java Main

🧾 Contoh Output Struk

============= STRUK PEMBELIAN =============
Nasi Goreng       x1   = 18000
Es Teh            x2   = 10000
-------------------------------------------
Subtotal                : 28000
Diskon 10%             : -2800
Total Akhir            : 25200
===========================================

✨ Tujuan Pembuatan Proyek

1. Proyek ini dibuat sebagai implementasi nyata dari:
2. Penerapan konsep OOP secara terstruktur
3. Cara menggunakan package dalam Java
4. Penggunaan exception untuk validasi
5. Membuat aplikasi CLI modular yang mudah dibaca dan diperbaiki
