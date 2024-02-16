
import java.util.*;
class Student
{
    protected int rno;
    protected String sname , course;
    
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Details");
        rno=sc.nextInt();
        sname=sc.next();
        course=sc.next();
    }
    void display ()
    {
    System.out.print(rno+""+sname+""+course);
    }
    
}
  class Marks extends Student
{
    private int m1,m2,m3,total;
    private float per;
    void accept ()
    {
    super. accept();
    Scanner sc =new Scanner (System.in);
    System.out.println("Enter Marks Details");
    m1=sc.nextInt();
    m2=sc.nextInt();
    m3=sc.nextInt();
    }
    void calculate()
    {
        total=m1+m2+m3;
        per= (float)total/3.0f;
    }
    void display()
    {
        super.display();
        System.out.println(m1+""+m2+""+m3+""+total+""+per);
    }
    void displaybyper()
    {
        if (per >75)
        {
            display();
        }
    }
    
}
class SingleLevel
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
        Marks x[]=new Marks [n];
        for (i=0;i<n;i++)
        {
            x[i]=new Marks();
            x[i].accept ();
            x[i].calculate();
        }
        System.out.println("Display all student details");
        for(i=0;i<n;i++)
        {
            x[i].display();
        }
        System.out.println("Display student details having >75%");
        for(i=0;i<n;i++)
        {
            x[i].displaybyper();
        }
    }
}