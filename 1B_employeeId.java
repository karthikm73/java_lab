package javalab;

import java.util.*;
public class employee 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int[] empId={1001,1002,1003,1004,1005,1006,1007};
		String[] empname={"Abc","Opqr","Ghi","Wxyz","Jklmn","Stuv","Def"};
		String[] date={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
		char[] empcode={'e','c','k','r','m','e','c'};
		String[] deptt={"R&D","PM","Acct","FrontDesk","Engg","Manufacturing","PM"};
		double[] basic={20000,30000,10000,12000,50000,23000,29000};
		double[] HRA={8000,12000,8000,6000,20000,9000,12000};
		double[] IT={3000,9000,1000,2000,20000,4400,10000};
		char[] desigcode={'e','c','k','r','m'};
		String[] designation={"Engineer","Consultant","Clerk","Receptionist","Manager"};
		double[] DA={20000,32000,12000,15000,40000};
		
		System.out.println("Enter the employee ID:");
		int id=sc.nextInt();
		int flag=0;
		double salary=0;
		for(int i=0;i<empID.length;i++)
		{
			if(id==empID[i])
			{
				flag=1;
				System.out.println("Emp ID:" + empID[i]);
				System.out.println("Emp name:" + empname[i]);
				System.out.println("Department:" + dept[i]);
				switch(empcode[i])
				{
					case 'e':System.out.println("Designation: Engineer");
						System.out.println("DA :20000");
						salary=20000+HRA[i]+basic[i]-IT[i];
						System.out.println("Salary:"+ salary);
						break;
					case 'c':System.out.println("Designation: Consultant");
						System.out.println("DA :32000");
						salary=32000+HRA[i]+basic[i]-IT[i];
						System.out.println("Salary:"+ salary);
						break;
					case 'm':System.out.println("Designation: Manager");
						System.out.println("DA :40000");
						salary=40000+HRA[i]+basic[i]-IT[i];
						System.out.println("Salary:"+ salary);
						break;
					case 'r':System.out.println("Designation: Receptionist");
						System.out.println("DA :15000");
						salary=15000+HRA[i]+basic[i]-IT[i];
						System.out.println("Salary:"+ salary);
						break;
					case 'k':System.out.println("Designation: Clerk");
						System.out.println("DA :12000");
						salary=12000+HRA[i]+basic[i]-IT[i];
						System.out.println("Salary:"+ salary);
						break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("Employee details not found!!!!!");
		}
	}
}
