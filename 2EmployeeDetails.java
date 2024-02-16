// Enter 2 employee details and display


import java.util.*;
class Employee
{
	private int eid;
	private String ename,designation;
	private float salary;
	
	void accept()
	{
		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter The Employee Details:");
		eid = Sc.nextInt();
		ename = Sc.next();
		designation = Sc.next();
		salary = Sc.nextFloat();
	}
	
	void display()
	{
		System.out.println(eid + " " + ename + " " + designation + " " + salary );
	}
}
class 2EmployeeDetails
{
	public static void main(String[] args) 
	{
		Employee x = new Employee();
		Employee y = new Employee ();
		
		x.accept();
		y.accept();
		
		x.display();
		y.display();
	}

}
