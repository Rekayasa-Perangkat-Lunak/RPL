package template.method;

public abstract class ObjectTemplate {
    public void start(){
        System.out.println(getName());
        System.out.println(getJabatan());
        System.out.println(getNIP());
    }
    public abstract String getName();
    public abstract String getJabatan();
    public abstract Integer getNIP();
}
