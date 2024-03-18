// write a java program to print table of a number by using functions.

//hint: take input as one number. 

// type : With Parameter but no return type 


import java.util.*;
public class TableFunction
{
    public static void Table(int iNumber)
    {
        int iTable=1;

        for (int iCnt =1 ; iCnt<=10; iCnt++)
        {
             iTable= iNumber*iCnt;

            System.out.println(iTable);      
        }
    }

    public static void main(String[] args)
    {
        Scanner iobj=new Scanner(System.in);

        System.out.println("Enter any Number :");

        int iNo1=iobj.nextInt();

        Table(iNo1);
        
    }
    
}
