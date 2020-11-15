/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author ACER
 */
public class Jabatan implements Cloneable {
    private String Kepalakaryawan;
    private String Karyawan;
    protected String Type;
    
    
    public Jabatan clone(){
        Jabatan b = null;
        try{
            b = (Jabatan)super.clone();
        } catch (Exception e){
        }
        return b;
    }    

    public String getKepalakaryawan() {
        return Kepalakaryawan;
    }

    public void setKepalakaryawan(String Kepalakaryawan) {
        this.Kepalakaryawan = Kepalakaryawan;
    }

    public String getKaryawan() {
        return Karyawan;
    }

    public void setKaryawan(String Karyawan) {
        this.Karyawan = Karyawan;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
}
