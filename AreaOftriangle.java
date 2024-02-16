AreaOftriangle




package abbc;
import java.util.*;

public class AreaOftriangle
{

	public static void main(String[] args)
	{

		Scanner Sc = new Scanner(System.in);
		float l,b,a;
		final float PI=3.14f;
		System.out.println("Enter length:");
		l=Sc.nextFloat();
		System.out.println("Enter Breadth:");
		b=Sc.nextFloat();
		a=0.5f*l*b;
		System.out.println("Area of Triangle: "+a);
		

	}

}
