package aabc;

import java.util.Scanner;

public class AreaOfRectangle
{

	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		float l,b,a;
		
		System.out.println("Enter length:");
		l=Sc.nextFloat();
		System.out.println("Enter Breadth:");
		b=Sc.nextFloat();
		a=l*b;
		System.out.println("Area of Square : "+a);
				

	}

}