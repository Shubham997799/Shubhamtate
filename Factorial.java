import java.util.*;

class Factorial
{
    public static int factorial(int iVal)
    {
        int iMul=1;
        for(int iCnt=1;iCnt<=iVal;iCnt++)
        {
            iMul=iMul*iCnt;
        }
        return iMul;
          
    }
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter A no :");
        int iNo= sobj.nextInt();

        int iRet = factorial(iNo);

        System.out.println("Factorial of " + iNo + " is :" + iRet);
    }
}