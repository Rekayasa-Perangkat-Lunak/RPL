/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.*;

public class Karyawan {
    
    private String nama;
    private String Jabatan;
    private int Nip;
    private List< Karyawan > subordinates;
    
    public Karyawan(String nama, String Jabatan, int Nip){
        this.nama = nama;
        this.Jabatan = Jabatan;
        this.Nip = Nip;
        subordinates = new ArrayList< Karyawan >();
    }
    
    public void add(Karyawan add){
        subordinates.add(add);
    }
    
    public void remove(Karyawan remove){
        subordinates.remove(remove);
    }
    
    public List< Karyawan > getSubordinates(){
        return subordinates;
    }
    
    @Override
    public String toString(){
        return (" Nama : " + nama + ", Jabatan : " + Jabatan + ", Nip : " + Nip+"");
    }
}
