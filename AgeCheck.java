import java.util.*;

class AgeCheck
{
    public static void main(String []args)
    {


        System.out.println("Enter your age below : ");

        Scanner iobj = new Scanner(System.in);

        int age = iobj.nextInt();

        if(age > 17)
        {
            System.out.println("Eligible for Vote");
        }
        else
        {
            System.out.println("Not Eligible for Vote");
        }

    }
}
