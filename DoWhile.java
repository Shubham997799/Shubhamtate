// write a java program to print the numbers which are divisible by 3 from 1 to 60 in descending order.

import java.util.*;

public class DoWhile
{
    public static void main(String[] args) 
    {
        int iNo1 =60;
        int iNo2 =1 ;

        int iCnt = iNo1;

        do
        {
            if (iCnt % 3 == 0)
            {
                System.out.println(iCnt);
            }
             iCnt--;
        }while(iCnt>=iNo2);
        
    }
    
}
