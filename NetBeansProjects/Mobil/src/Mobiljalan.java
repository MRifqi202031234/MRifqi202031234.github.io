/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rifqi Athallah
 */
public class Mobiljalan {
    public static void main(String[] args) {
        // Membuat Objek
        Mobilx mobilku = new Mobilx();
        //Memanggil atribut dan Memberi nilai
        mobilku.nama_mobil = "Honda Jezz";
        mobilku.merk = "Honda";
        mobilku.tahun_produksi = 2021;
        mobilku.Volume_mesin = 4416;
        System.out.println("Nama Mobil:" + mobilku.nama_mobil);
        System.out.println("Merk Mobil:" + mobilku.merk);
        System.out.println("Tahun Produksi:" + mobilku.tahun_produksi);
        System.out.println("Volume Mesin:" + mobilku.Volume_mesin + "cc");
                
    
}}
