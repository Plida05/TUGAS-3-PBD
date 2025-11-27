Tugas Praktikum Pemrograman Berorientasi Objek (OOP)

Proyek ini merupakan implementasi program pemesanan sederhana menggunakan konsep OOP di Java. Program menampilkan menu makanan/minuman, memproses pesanan, menghitung total harga + diskon, dan mencetak struk.

📌 Tujuan Proyek

Menerapkan konsep Class, Object, Encapsulation, Inheritance, dan Exception Handling

Membuat sistem pemesanan sederhana dengan struktur folder yang bersih

Menggunakan package untuk memisahkan fitur berdasarkan fungsi

📂 Struktur Folder
src/
│
├── menu/
│   ├── MenuItem.java
│   ├── MenuService.java
│   └── MenuItemNotFoundException.java
│
├── order/
│   ├── Order.java
│   └── OrderItem.java
│
├── struk/
│   └── ReceiptGenerator.java
│
└── Main.java

🚀 Fitur Program

Menampilkan daftar menu

User memilih menu + jumlah pesanan

Validasi input & penanganan error

Menghitung total harga otomatis

Penerapan diskon 10% bila total pembelian memenuhi syarat

Mencetak struk akhir yang rapi di terminal

🧩 Konsep OOP yang Digunakan

Encapsulation → atribut pada MenuItem, Order, dan OrderItem dibuat private

Class & Object → tiap bagian program dipisah menjadi class

Constructor → digunakan untuk inisialisasi menu dan pesanan

Exception Handling

MenuItemNotFoundException bila user memilih menu yang tidak ada

Package → memisahkan menu, order, dan struk untuk struktur yang bersih

▶️ Cara Menjalankan

Pastikan struktur folder sudah sesuai

Compile semua file:

javac Main.java


Jalankan program:

java Main

📝 Contoh Output Struk
========= STRUK PEMBELIAN =========
Es Teh x2    = 10.000
Nasi Goreng x1 = 18.000
-----------------------------------
Subtotal : 28.000
Diskon 10% : -2.800
Total Akhir : 25.200
===================================

🎯 Catatan

Program bisa dikembangkan lagi: tambah kategori menu, sistem pembayaran, database, dll.
