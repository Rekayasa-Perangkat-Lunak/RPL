/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author ACER
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prototype
        Karyawan Marketing = new Karyawan();
        KepKaryawan HeadMarketing = new KepKaryawan();
      
        System.out.println("Jabatan Kepala Karyawan dan Karyawan");
        System.out.println("Marketing :" +Marketing.getType());
        Jabatan TataUsaha = Marketing.clone();
        System.out.println("Tata Usaha :" +TataUsaha.getType());
        System.out.println("Head Marketing :" +HeadMarketing.getType());
        Jabatan KTU = HeadMarketing.clone();
        System.out.println("KTU :" +KTU.getType());
        
        //Composite
        KaryawanComposite Direktur_Utama = new KaryawanComposite("Irwan Rifani","Direktur_Utama",199051726);
        KaryawanComposite KTu = new KaryawanComposite("Rizky Widhayat", "KTu",1994051727);
        KaryawanComposite headMarketing = new KaryawanComposite("Dadang Hawari","Head Marketing",1993051728);
        KaryawanComposite marketing = new KaryawanComposite("Faisal","Marketing",1995051729);
        KaryawanComposite tatausaha = new KaryawanComposite("Astri Diani","TU",1992051731);
        
        Direktur_Utama.add(KTu);
        Direktur_Utama.add(headMarketing);
        
        headMarketing.add(marketing);
        KTu.add(tatausaha);
        System.out.println(Direktur_Utama);
        
        for(KaryawanComposite headKaryawan : Direktur_Utama.getSubordinates()){
            System.out.println();
            System.out.println(headKaryawan);
     
            for(KaryawanComposite Karyawan : headKaryawan.getSubordinates()){
                System.out.println(" - "+Karyawan);
            }
        }
        
       //Template Method 
        Object object = new Object();
        object.start();
        
        Object2 object = new Object2();
        object.start();
        
        Object3 object = new object();
        object.start();
        
        Object4 object = new Object4();
        object.start();
        
        Obejct5 object = new Object5();
        object.start();
    }

    
    }
    
    
        
        
        
    
 
    
