import java.util.*;

public class OddNo1 
{
    public static void main(String[] args)
    {
        Scanner iobj = new Scanner(System.in);
        System.out.println("Eneter a Min No :");
        int iMin = iobj.nextInt();
        System.out.println("Eneter a Max No :");
        int iMax = iobj.nextInt();

        
        int iCnt = iMin;
        while (iCnt <=iMax)
        {
            if(iCnt%2 !=    0)
            {
                System.out.println(iCnt);
            }

            iCnt++;
        }
        
    }
}
