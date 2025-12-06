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

Halaman Login merupakan antarmuka pertama yang muncul saat aplikasi dijalankan. Halaman ini berfungsi sebagai gerbang keamanan sistem, di mana pengguna diwajibkan memasukkan kredensial berupa surel (email) dan kata sandi (password) yang valid untuk dapat mengakses fitur utama.

2️⃣ Registrasi (Sign Up)

Halaman Registrasi digunakan oleh pengguna baru untuk mendaftarkan akun ke dalam sistem database smartkas. Pada halaman ini, pengguna diminta untuk melengkapi data diri yang meliputi nama lengkap, alamat surel, dan kata sandi. Sistem akan melakukan validasi sebelum menyimpan data tersebut ke tabel users.

3️⃣ Dashboard

Setelah proses login berhasil, pengguna akan diarahkan ke halaman Dashboard. Halaman ini dirancang dengan tampilan yang bersih dan sederhana untuk menyambut pengguna. Pada bagian tengah, ditampilkan pesan "Selamat Datang di Aplikasi SmartKas" disertai dengan slogan motivasi "Kendalikan uangmu sebelum uang yang mengendalikanmu". Di sisi kiri layar, terdapat panel navigasi (sidebar) yang memudahkan pengguna untuk berpindah ke fitur-fitur lainnya.

4️⃣ Tambah Transaksi

Halaman ini merupakan fitur inti untuk mencatat transaksi keuangan. Interaksi utama pada halaman ini dirancang dinamis untuk memudahkan pengguna:
1.	Pemilihan Jenis: Pengguna memilih jenis transaksi (Pemasukan atau Pengeluaran).
2.	Pemilihan Kategori: Implementasi kategori menggunakan komponen Combo Box. Daftar kategori akan menyesuaikan secara otomatis berdasarkan jenis yang dipilih:
Pemasukan: Gaji, Hadiah, Investasi, Penjualan, Lainnya dan Pengeluaran: Makanan, Transportasi, Pendidikan, Kesehatan, Hiburan, Tagihan, Lainnya.
3.	Fitur Fleksibilitas: Terdapat opsi "Lainnya" yang disediakan apabila kategori yang diinginkan pengguna tidak tersedia dalam daftar standar.


5️⃣ Lihat Laporan

Menampilkan Tabel daftar transaksi, Total pemasukan, Total pengeluaran, dan Sisa saldo Serta Fitur Edit, Hapus dan Simpan Laporan

6️⃣ Profil Pengguna

Dapat mengubah: Nama Lengkap, Username, email, dan password

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


