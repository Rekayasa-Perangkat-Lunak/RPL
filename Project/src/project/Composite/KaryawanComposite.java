/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class KaryawanComposite {
    private String nama;
    private String Jabatan;
    private int Nip;
    private List< KaryawanComposite > subordinates;
    
    public KaryawanComposite(String nama, String Jabatan, int Nip){
        this.nama = nama;
        this.Jabatan = Jabatan;
        this.Nip = Nip;
        subordinates = new ArrayList< KaryawanComposite >();
    }
    
    public void add(KaryawanComposite add){
        subordinates.add(add);
    }
    
    public void remove(KaryawanComposite remove){
        subordinates.remove(remove);
    }
    
    public List< KaryawanComposite > getSubordinates(){
        return subordinates;
    }
    
    @Override
    public String toString(){
        return (" Nama : " + nama + ", Jabatan : " + Jabatan + ", Nip : " + Nip+"");
    }
}
