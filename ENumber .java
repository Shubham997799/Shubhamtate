package javaOne;

import java.util.*;

public class ENumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n,i ;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter n");
		n= sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter Elements");
		for (i=0 ; i<n ; i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("Display even elements ");
		for (i=0;i<n;i++)
		{
			if(a [i] % 2 ==0)
			{
				System.out.println(a[i]);
			}
		}

	}

}