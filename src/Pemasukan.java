/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Defry Ananta
 */

public class Pemasukan extends Laporan {
    
    private String sumber; // Atribut khusus Pemasukan

    public Pemasukan(String tanggal, String nominal, String catatan, String sumber) {
        // Panggil constructor superclass (Laporan)
        super(tanggal, nominal, catatan);
        this.sumber = sumber;
    }

    // Implementasi metode abstract DARI Laporan
    @Override
    public String getJenisLaporan() {
        return "Pemasukan";
    }

    @Override
    public String getDetailSpesifik() {
        // Mengembalikan sumber pemasukan sebagai detail
        return this.sumber;
    }
}