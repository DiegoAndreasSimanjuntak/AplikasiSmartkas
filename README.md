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

## Konsep OOP yang digunakan
1. Encapsulation (Enkapsulasi)

Setiap class memiliki atribut private, misalnya:

User: userId, fullname, email, password

Transaksi: jumlah, deskripsi

Kategori: namaKategori

Akses melalui getter & setter, sehingga data aman dan tidak dimodifikasi secara langsung.

2. Inheritance (Pewarisan)

Agar kode tidak berulang, dibuat class BaseModel (jika diterapkan) atau konsep inheritance logis seperti:

Controller Inheritance Concept

AuthController, ProfileController, TransaksiController, dan KategoriController memiliki pola:

menerima input

validasi

memanggil model

mengembalikan status sukses/gagal

Konsep pewarisan yang biasa diterapkan:

Controller
   ↑
   ├── AuthController
   ├── ProfileController
   ├── TransaksiController
   └── KategoriController


Jadi semua controller mewarisi sifat dasar:
🔹 proses data
🔹 koneksi model
🔹 mengembalikan output

Jika kamu ingin, saya bisa buatkan BaseController.java untuk inheritance asli.

3. Polymorphism

Beberapa method memiliki nama sama tetapi beda perilaku.

Contoh method:

tambah()


Digunakan oleh:

TransaksiController.tambah()

KategoriController.tambahKategori()

Contoh lainnya:

update()


Digunakan pada model User, Transaksi, dan Kategori.

Method sama, objek berbeda, perilaku berbeda.

4. Abstraction (Abstraksi)

Model hanya menyimpan data & logic dasar, tidak perlu tahu cara tampil di UI.

Controller menyembunyikan detail model sehingga UI hanya pakai fungsi:

updateProfile()

getByUser()

tambahKategori()

tambahTransaksi()

UI tidak tahu logika SQL, hash password, dst.


