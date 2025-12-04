/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Defry Ananta
 */

// File: Pengeluaran.java

public class Pengeluaran extends Laporan {
    
    private String kategori; // Atribut khusus Pengeluaran

    public Pengeluaran(String tanggal, String nominal, String catatan, String kategori) {
        // Panggil constructor superclass (Laporan)
        super(tanggal, nominal, catatan);
        this.kategori = kategori;
    }

    // Implementasi metode abstract DARI Laporan
    @Override
    public String getJenisLaporan() {
        return "Pengeluaran";
    }

    @Override
    public String getDetailSpesifik() {
        // Mengembalikan kategori pengeluaran sebagai detail
        return this.kategori;
    }
}