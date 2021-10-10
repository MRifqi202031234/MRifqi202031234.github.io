/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win 10
 */
public class Motor {
    
    private String username;
    private String password;
    private String nama;
    private String merk;
    private int tahun_produksi;
    private int cc;
    String get;
    
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
     public void setnama(String nama){
        this.nama = nama;
    }
      public void setmerk(String merk){
        this.merk = merk;
    }
       public void settahun_produksi(int tahun_produksi){
        this.tahun_produksi = tahun_produksi;      
    }
        public void setcc(int cc){
        this.cc = cc;
    }
        
  //method getter
    public String getUsername() {
        return username;
    }
    public String getpassword() {
        return password;
    }
   public String getnama() {
        return nama;
   }
    public String getmerk() {
        return merk;
   } 
    public int gettahun_produksi() {
        return tahun_produksi;
   }
     public int getcc() {
        return cc;
   }    
    

    
    
    
    
}
