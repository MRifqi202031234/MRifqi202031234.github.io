/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win 10
 */
public class Motorg {
    public static void main(String[] args) {
 Motor roda = new Motor();
 
 roda.setUsername("Artya");
 roda.setPassword("7843");
 roda.setnama("BMW 400 X");
 roda.setmerk("BMW");
 roda.settahun_produksi(2019);
 roda.setcc(350);
 
 System.out.println("Username: " + roda.getUsername());
 System.out.println("Password: " + roda.getpassword());
 System.out.println("Nama: " + roda.getnama());
 System.out.println("Merk: " + roda.getmerk());
 System.out.println("Tahun Produksi: " + roda.gettahun_produksi());
 System.out.println("Volume Mesin: " + roda.getcc());
 
 
        
    }
    
}
