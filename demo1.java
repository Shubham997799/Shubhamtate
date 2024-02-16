import java.util.*;
class Student
{
    private int rno;
    private String sname;
    private float per;
    void accept()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Std Details");
        rno=sc.nextInt();
        sname=sc.next();
        per=sc.nextFloat();
    }
    void display()
    {
        System.out.println(rno+""+sname+""+per);
    }
    void displayper()
    {
        if(per > 75)
        {
            display();
        }
    }
    void displaybyrollno(int n)
    {
        if(rno==n)
        {
            display();
        }
    }
    void displaybyname(String p)
    {
        if(sname.equals (p))
        {
            display();
        }
    }
}

class demo1
{
    public static void main(String args[])
    {
        int n,i,no;
        String r;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter n");
        n =sc.nextInt();
        Student x []= new Student[n];
        for (i=0;i<n;i++)
        {
            x[i]=new Student();
            x[i].accept();
        }
        System.out.println("Display Std Details");
        for(i=0;i<n;i++)
        {
            x[i].display();
        }
        System.out.println("Display Std above 75%");
        for(i=0;i<n;i++)
        {
            x[i].displayper();
        }
        System.out.println("Enter Roll NO");
        no=sc.nextInt();
        for (i=0;i<n;i++)
        {
            x[i].displaybyrollno(no);
        }
        System.out.println("Enter Name");
        r=sc.next();
        for(i=0;i<n;i++)
        {
            x[i].displaybyname(r);
        }
    }
}