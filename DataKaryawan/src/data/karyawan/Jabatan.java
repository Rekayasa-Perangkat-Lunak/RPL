/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.karyawan;
/**
 *
 * @author ACER
 */
public abstract class Jabatan {
    public String Kepalakaryawan;
    public String Karyawan;
    
    public Jabatan(){
    }
    
    public Jabatan(Jabatan target){
        if(target != null){
            this.Karyawan = target.Karyawan;
            this.Kepalakaryawan = target.Kepalakaryawan;
        }
    }
    
    @Override
    public abstract Jabatan clone();
    

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
    
}
