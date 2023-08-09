package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertOperation {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee Id :-");
		int id=s.nextInt();
		System.out.println("Enter Employee Name :-");
		String ename=s.next();
		System.out.println("Enter Employee Salary :-");
		double sal=s.nextDouble();
		try 
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:xe","hotel","123");
		
		Statement stm=con.createStatement();
		stm.executeUpdate("insert into emp52 values('"+id+""+ename+""+sal+"')");
		System.out.println("Data Inserted Sucefully ");
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
