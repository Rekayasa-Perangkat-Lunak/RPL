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
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan Marketing = new Karyawan();
        KepKaryawan HeadMarketing = new KepKaryawan();
        
        System.out.println("Jabatan Kepala Karyawan dan Karyawan");
        System.out.println("Marketing :" +Marketing.getType());
        Jabatan TataUsaha = Marketing.clone();
        System.out.println("Tata Usaha :" +TataUsaha.getType());
        System.out.println("Head Marketing :" +HeadMarketing.getType());
        Jabatan KTU = HeadMarketing.clone();
        System.out.println("KTU :" +KTU.getType());
                }

    }
