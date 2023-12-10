import java.util.Scanner;

public class Empsalary //class &classname
{
	int employeeid;     //member variables
	String employeename;
	String employeedesignation;
	double employeesalary;
	double hra,ma,da,pt,gs,ns,spa,it,tpt,ctc,bs;
	
	Empsalary(int empid,String empname,String empdes,double empsal)
	{
		employeeid=empid;
		employeename=empname;
		 employeedesignation=empdes;
		 employeesalary=empsal;
	}
	void Salarydetails()
	{
		
	}

	public static void main(String[] args) //main method
	{
		Empsalary e[]=new Empsalary[100];
			Scanner sc=new Scanner(System.in);
			int i,n;
			System.out.println("enter how many employee salary details u want:");
			n=sc.nextInt();
			for(i=0;i<n;i++)
			{
			System.out.println("enter empid:");
			int empid=sc.nextInt();
			System.out.println("enter empname:");
			String empname=sc.next();
			System.out.println("enter empdesignation:");
			String empdes=sc.next();
			System.out.println("enter empsalary:");
			double empsal=sc.nextDouble();
			e[i]=new Empsalary(empid,empname,empdes,empsal);
			/*for(i=0;i<n;i++)
			{
				e[i]=new Empsalary(empid,empname,empdes,empsal);
			}*/
			
			}
			for(i=0;i<n;i++)
			{
				e[i].Salarydetails();
			}

}

}