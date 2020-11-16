/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        
        Karyawan Direktur_Utama = new Karyawan("Irwan Rifani","Direktur_Utama",199051726);
        
        Karyawan KTU = new Karyawan("Rizky Widhayat", "KTU",1994051727);
        
        Karyawan headMarketing = new Karyawan("Dadang Hawari","Head Marketing",1993051728);
        
        Karyawan marketing = new Karyawan("Faisal","Marketing",1995051729);
       
        
        Karyawan tatausaha = new Karyawan("Astri Diani","TU",1992051731);
       
        
        Direktur_Utama.add(KTU);
        Direktur_Utama.add(headMarketing);
        
        headMarketing.add(marketing);
        
        
        KTU.add(tatausaha);
    
        
        System.out.println(Direktur_Utama);
        
        for(Karyawan headKaryawan : Direktur_Utama.getSubordinates()){
            System.out.println();
            System.out.println(headKaryawan);
     
            for(Karyawan Karyawan : headKaryawan.getSubordinates()){
                System.out.println(" - "+Karyawan);
            }
        }
    }
}