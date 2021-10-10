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
public class SepedaMotor {
    private String mark;
    private long harga;
    
    public void setMerk(String merk){
        this.mark = merk;
        
   }
    public String getMerk() {
        return this.mark;
       
   }
   public void setHarga(long harga) {
       this.harga=harga;
   }
   public long getHarga() {
       return this.harga;
   }
}
