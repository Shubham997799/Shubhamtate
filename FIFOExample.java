import java.util.*;
class FIFO
{
   int n,m,r=0,c=0;
   int p[],f[];
   void accept()
   {
     int i;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter n");
     n=sc.nextInt();
     p =new int[n];
     System.out.println("enter m");
     m=sc.nextInt();
     f=new int[m];
   
     System.out.println("enter sequence of pages");
     for(i=0;i<n;i++)
     {
         p[i]=sc.nextInt();
     }
     for(i=0;i<m;i++)
     { 
         f[i]=-1;
     }
   }
   void pageFault()
   {
      int flag,i,j;
      for(i=0;i<n;i++)
      {
          flag=0;
          for(j=0;j<m;j++)
          {
             if(p[i]==f[j])
             {
                flag=1;
                 break;
             }
          }
          if(flag==0)
          {
             f[r]=p[i];
             r++;
             if(r==m)
             { 
                r=0;
             }
             c++;
          }
      } 
          System.out.println("number of page faults="+c);
          System.out.println("number of page hit="+(n-c));
    }
}
class FIFOExample
{
   public static void main(String args[])
   {
       FIFO x=new FIFO();
       x.accept();
       x.pageFault();
   }
} 
          
            