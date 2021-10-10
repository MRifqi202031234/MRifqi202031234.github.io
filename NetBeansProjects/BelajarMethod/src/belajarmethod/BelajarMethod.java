/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarmethod;

/**
 *
 * @author Rifqi Athallah
 */
public class BelajarMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tampil kuliah = new Tampil ();
        
        kuliah.cetak();
        kuliah.cetak2();
        
        Aritmatika jumlah = new Aritmatika();
        System.out.println( jumlah.penjumlahan (5, 7));
        System.out.println(jumlah.pengurangan (5, 7));
        }
    }
    

