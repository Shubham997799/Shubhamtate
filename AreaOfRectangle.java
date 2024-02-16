import java.util.*;

public class AreaOfRectangle
{

	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		float l,b,a;
		
		System.out.println("Enter Length");
		l=x.nextFloat();
                   System.out.println("Enter Breadth");
		b=x.nextFloat();
		a=l*b;
		System.out.println("Area of Rectangle: "+a);
		

	}

}