package template.method;


public class Main {
    public static void main(String[] args){
        
        Karyawan Direktur_Utama = new Karyawan();
        Direktur_Utama.start();
        
        Karyawan2 KTU = new Karyawan2();
        KTU.start();
        
        Karyawan3 headMarketing = new Karyawan3();
        headMarketing.start();
        
        Karyawan4 Marketing = new Karyawan4();
        Marketing.start();
       
        Karyawan5 tatausaha = new Karyawan5();
        tatausaha.start();
        

    }
}