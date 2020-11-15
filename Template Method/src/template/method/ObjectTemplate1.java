package template.method;


public abstract class ObjectTemplate1 {
    public void start(){
        System.out.println(getName());
        System.out.println(getName1());
        System.out.println(getJabatan());
        System.out.println(getNIP());
        System.out.println(getNIP1());
    }
    public abstract String getName();
    public abstract String getName1();
    public abstract String getJabatan();
    public abstract Integer getNIP();
    public abstract Integer getNIP1();
}
