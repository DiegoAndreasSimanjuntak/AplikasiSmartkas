/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Defry Ananta
 */

public abstract class Laporan {
    // Atribut yang dimiliki semua laporan (Pemasukan & Pengeluaran)
    protected String tanggal;
    protected String nominal;
    protected String catatan;

    // Constructor untuk kelas abstract
    public Laporan(String tanggal, String nominal, String catatan) {
        this.tanggal = tanggal;
        this.nominal = nominal;
        this.catatan = catatan;
    }

    // --- Metode Konkret (Langsung bisa dipakai subclass) ---
    public String getTanggal() {
        return tanggal;
    }

    public String getNominal() {
        return nominal;
    }

    public String getCatatan() {
        return catatan;
    }
    
    // --- Metode Abstract (WAJIB di-implementasi oleh subclass) ---
    
    /**
     * Mengembalikan jenis laporan sebagai String.
     * @return "Pemasukan" atau "Pengeluaran"
     */
    public abstract String getJenisLaporan();
    
    /**
     * Mengembalikan detail spesifik dari laporan (misal: sumber atau kategori).
     * @return String yang mendeskripsikan detail
     */
    public abstract String getDetailSpesifik();
}