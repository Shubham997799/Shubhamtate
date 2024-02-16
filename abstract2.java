// Online Java Compiler
// Use this editor to write, compile and run your Java code online

abstract class Converter
{
    abstract void Convert();
}
class KgToGm extends Converter
{
    float m;
    KgToGm(float p)
    {
        m=p;
    }
    void Convert()
    {
        float a=m*1000;
        System.out.println("Gram=",a);
    }
}
class RsToDoller extends Converter
{
    float m;
    RsToDoller(float p)
    {
        m=p;
    }
    void Convert()
    {
        float a=m/77;
        System.out.println("Doller=",a);
    }
    
}
class Sample
{
    public static void main(String args[])
    {
        scanner sc= new scanner(System.in);
        float m;
       
        System.out.println("Enter Kg");
        m=sc.nextfloat();
        Converter x= new KgToGm(m);
        x.Conver();
        System.out.println("Enter Rs");
        m=sc.nextfloat();
        Converter x= new RS(m);
        x.Conver();
    }
}