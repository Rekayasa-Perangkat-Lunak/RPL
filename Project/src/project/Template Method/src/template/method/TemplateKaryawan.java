/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.method;

/**
 *
 * @author user
 */
public abstract class TemplateKaryawan {
    public void start(){
       
     System.out.println(getName());
     System.out.println(getJabatan());
     System.out.println(getNIP());
     
    }    
    
    public abstract String getName();
    public abstract String getJabatan();
    public abstract Integer getNIP();
}
