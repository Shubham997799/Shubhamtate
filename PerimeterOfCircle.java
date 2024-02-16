package aabc;
import java.util.*;

public class PerimeterOfCircle
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		final float PI = 3.14f;
		System.out.println("Enter Radius :");
		double r=s.nextDouble();
		double c = 2*PI*r;
		System.out.println("Perimeter of circle is :"+c);
		

	}

}