# Aplikasi Smartkas

## Halaman Aplikasi
<img width="1304" height="710" alt="Cuplikan layar 2025-12-05 184952" src="https://github.com/user-attachments/assets/7981ae2b-c43c-4457-9a17-b2733507411c" />


## Anggota Kelompok
1. Diego Andreas Simanjuntak (2410631170068)
2. Defry Ananta Perangin Angin (2410631170066)
3. Muhammad Hafidz Rizqi Rukmana (2410631170037)
4. Muhammad Fharel Athallah Pane (24106311700157)


## Fitur-Fitur Aplikasi
1️⃣ Login

⦁	Validasi email & password
⦁	Autentikasi database

2️⃣ Registrasi (Sign Up)

⦁	Simpan data pengguna baru
⦁	Tidak boleh email duplikat
⦁	Password aman (hashing bisa ditambahkan)

3️⃣ Dashboard

Menampilkan:
⦁	Menu navigasi (Sidebar)
⦁	Sapaan selamat datang
⦁	Tombol-tombol menuju fitur aplikasi


4️⃣ Tambah Transaksi

Form input meliputi:
⦁	Jenis (Pemasukan / Pengeluaran)
⦁	Nominal
⦁	Catatan
⦁	Tanggal

5️⃣ Lihat Laporan

⦁	Tabel daftar transaksi
⦁	Total pemasukan
⦁	Total pengeluaran
⦁	Sisa saldo

6️⃣ Profil Pengguna
Menampilkan data user

Dapat mengubah:
nama, email, password

## Implementasi Konsep OOP
Implementasi Konsep PBO
Pengembangan aplikasi SmartKas menerapkan paradigma Pemrograman Berorientasi Objek (PBO) secara menyeluruh. Penerapan konsep ini bertujuan untuk menciptakan kode yang modular, aman, dan dapat digunakan kembali (reusable). Berikut adalah analisis implementasi konsep-konsep utama PBO dalam aplikasi:

1. Enkapsulasi (Encapsulation)
Enkapsulasi diterapkan untuk melindungi data sensitif dan memastikan bahwa atribut objek hanya dapat diakses atau dimodifikasi melalui mekanisme yang telah ditentukan.

Implementasi: Penggunaan access modifier private pada atribut vital.

Contoh pada Kode: Pada kelas Session.java, atribut userId dideklarasikan sebagai private static untuk mencegah akses langsung dari luar kelas yang berpotensi merusak integritas sesi pengguna. Akses terhadap variabel ini dibatasi melalui metode public yaitu setUserId() dan getUserId().

2. Pewarisan (Inheritance)
Pewarisan digunakan untuk mengadopsi properti dan perilaku dari kelas induk (superclass) ke kelas turunan (subclass), yang mengurangi duplikasi kode secara signifikan.

Implementasi pada GUI: Seluruh kelas antarmuka (seperti Login, MenuDashboard, TambahLaporan) mewarisi kelas javax.swing.JFrame. Hal ini memberikan kemampuan bagi kelas-kelas tersebut untuk berperan sebagai jendela aplikasi desktop standar.

Implementasi pada Model: Kelas Pemasukan dan Pengeluaran merupakan turunan dari kelas induk Laporan. Dengan demikian, kedua kelas tersebut secara otomatis mewarisi atribut umum seperti tanggal, nominal, dan catatan tanpa perlu pendefinisian ulang.

3. Polimorfisme (Polymorphism)
Polimorfisme memungkinkan satu antarmuka digunakan untuk berbagai bentuk implementasi yang berbeda.

Implementasi (Overriding): Pada hierarki kelas Laporan, terdapat metode abstrak getJenisLaporan(). Metode ini diimplementasikan ulang (override) dengan perilaku berbeda pada kelas turunannya: kelas Pemasukan mengembalikan nilai "Pemasukan", sedangkan kelas Pengeluaran mengembalikan nilai "Pengeluaran".

Implementasi (Ad-hoc): Pada kelas TambahLaporan.java, diterapkan anonymous inner class dari MouseAdapter untuk menangani event klik tetikus yang berbeda-beda pada setiap tombol navigasi.

4. Abstraksi (Abstraction)
Abstraksi digunakan untuk menyembunyikan detail implementasi yang kompleks dan hanya menampilkan fungsionalitas utama kepada pengguna atau objek lain.

Implementasi: Kelas Laporan dideklarasikan sebagai abstract class. Hal ini menegaskan bahwa kelas Laporan hanya berfungsi sebagai kerangka dasar (blueprint) dan tidak dapat diinstansiasi menjadi objek secara langsung. Objek hanya dapat dibuat melalui bentuk konkretnya, yaitu Pemasukan atau Pengeluaran.

5. Pemisahan Logika (Separation of Concerns)
Sebagai bentuk implementasi arsitektur perangkat lunak yang baik, aplikasi ini memisahkan kode antarmuka (View) dengan kode pemrosesan (Logic).

Contoh Nyata: Kelas Register.java hanya berfungsi mengambil input dari pengguna. Ketika tombol daftar ditekan, kelas ini tidak melakukan penyimpanan data secara langsung, melainkan memanggil metode registerUser() yang berada di dalam kelas UserController.java. Pendekatan ini membuat struktur kode lebih rapi dan memudahkan proses debugging jika terjadi kesalahan pada salah satu lapisan.


