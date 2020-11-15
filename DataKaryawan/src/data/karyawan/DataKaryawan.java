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
public class DataKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jabatan Marketing = new Jabatan();
        Jabatan HeadMarketing = new Jabatan();
        
        System.out.println("Yang memiliki jabatan Kepala Karyawan");
        System.out.println("1. " +Marketing.getKaryawan());
        Jabatan TataUsaha = Marketing.clone();
        System.out.println("2." +TataUsaha.getKaryawan());
        
        System.out.println("Yang memiliki jabatan Karyawan");
        System.out.println("1." +HeadMarketing.getKepalakaryawan());
        Jabatan KTU = HeadMarketing.clone();
        System.out.println("2." +KTU.getKepalakaryawan());
                }
    
}
