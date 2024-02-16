import java.util.*;

public class AreaOfCircle
{

	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		float r,a;
		final float PI=3.14f;
		System.out.println("Enter radius");
		r=x.nextFloat();
		a=PI*r*r;
		System.out.println("Area of circle: "+a);
		

	}

}
