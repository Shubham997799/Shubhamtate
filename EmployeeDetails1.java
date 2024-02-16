
import java.util.*;

class Employee
{
	private int eid ;
	private String ename,designation;
	private float salary;
	
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id :");
		eid = sc.nextInt();
		System.out.println("Enter The Employee Name :");
		ename = sc.next();
		System.out.println("Enter The Employee Designation :");
		designation = sc.next();
		System.out.println("Enter The Salary  :");
		salary = sc.nextFloat();
	}	
		void display()
		{
			System.out.println (eid + " " + ename + " " + designation + " " + " " + salary );
		}
		
	
}

public class EmployeeDetails1
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		Employee x = new Employee();
		Employee y = new Employee();
		Employee z = new Employee();
		
		x.accept();
		y.accept();
		z.accept();
		
		
		x.display();
		y.display();
		z.display();	
	}

}
