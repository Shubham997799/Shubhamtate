import java.util.*;

 interface Converter
{
	 void convert();
	 
}
 class KgToG implements Converter
 {
	 private float Kg,gm;
	 KgToG (float p)
	 {
		 Kg=p;
	 }
	 public void convert()
	 {
		 gm=Kg*1000.0f;
		 System.out.println("Total gram = "+gm);
	 }
 }
class RsToDollar implements Converter
{
	private float Rs,dollar;
	RsToDollar (float p)
	{
		Rs=p;
	}
	public void convert()
	{
		dollar =Rs/77.0f;
		System.out.println("Total Dollar ="+ dollar);
	}
}
class interface Example
{
	public static void main(String[] args) 
	{
		float m;
		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter Kilogram");
		m=Sc.nextFloat();
		Converter x= new KgToG(m);
		x.convert();
		
		System.out.println("Enter Rs");
		m=Sc.nextFloat();
		Converter y = new RsToDollar(m);
		y.convert();
		
	}
}