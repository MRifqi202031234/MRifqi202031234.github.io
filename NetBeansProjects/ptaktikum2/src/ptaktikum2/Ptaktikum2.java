/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptaktikum2;

/**
 *
 * @author Rifqi Athallah
 */
public class Ptaktikum2 {

    /**
     * @param args the command line arguments
     */

         public static void main(String[] args) {
        SepedaMotor motor1 = new SepedaMotor ();
        
        motor1.setMerk("vario");
        motor1.setHarga(21000000);
        
        System.out.println("Merk seoeda motor : " + motor1.getMerk());
        System.out.println("Harga sepeda motor : " + motor1.getHarga());
    }
    
}