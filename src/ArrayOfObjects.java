import java.util.Scanner;

public class ArrayOfObjects {//class starts


	int studentid;//initialize the variable 
	String studentname;//initialize the variable-string is class
	int java,english,webtech;//initialize the variable
	String grade,result;//initialize the variable 
	int total,avg;
	ArrayOfObjects(int sid,String sname,int jv,int eng,int webt)//create an multiple-arguments constructor
	{
		studentid=sid;//assign sid to studentid
		studentname=sname;//assign sname to studentname
		java=jv;//assign jv to java
		english=eng;//assign eng to english
		webtech=webt;//assign webt to webtech

	}
	
	void report()//create one user-defined member method
	{
		if(java>35 && english >35 && webtech>35)//condition checks using if-else
		{
			result="pass";//print result
		}
		else
		{
			result="fail";//print result
		}
		
		total=java+english+webtech;//operation happend
		avg=total/3;//operation happend
		
		if(avg>90)//condition checks
		{
			grade="A";
		}
		else if(avg>80)//condition checks
		{
			grade="B";
		}
		else if(avg>70)//condition checks
		{
			grade="c";
		}
		else if(avg>60)//condition checks
		{
			
			
			grade="D";
		}
		else
		{
			grade="f";
		}
		
		System.out.println("Student id:"+studentid);//print statement for sid
		System.out.println("Student name:"+studentname);//print statement for sname
		System.out.println("java"+"\t"+"english"+"\t"+"webtech"+"\t"+"total"+" \t"+"avg"+"\t "+"result"+"\t "+"grade");//print statement
		System.out.println(java+"\t"+english+"\t"+webtech+"\t"+total+" \t"+avg+"\t "+result+"\t "+grade);//result
		
	}
public static void main(String[] args) {//main method of the class .prototype method
	
	ArrayOfObjects[] a=new ArrayOfObjects[100];//array of object is created
	int i,n,sid;//initialize the variables
	int jv,eng,webt;//initialize the variables
	String sname;//initialize the variables
	Scanner sc=new Scanner(System.in);//create scanner class object
	System.out.println("how many records do you want:");//print statement
	n=sc.nextInt();//assign value to variable n
	for(i=0;i<n;i++)//condition checks using for loop
	{
		System.out.println("enter student id:");//print statement
		sid=sc.nextInt();//assign value to variable n
		System.out.println("enter your name:");//print statement
		sname=sc.next();//assign value to variable n
		System.out.println("enter java marks:");//print statement
		jv=sc.nextInt();//assign value to variable n
		System.out.println("enter english marks:");//print statement
		eng=sc.nextInt();//assign value to variable n
		System.out.println("enter webtech marks:");//print statement
		webt=sc.nextInt();//assign value to variable n
		
		a[i]=new ArrayOfObjects(sid,sname,jv,eng,webt);//calling constructor
	}
	for(i=0;i<n;i++)
	{
		a[i].report();//access method using array
	}
}//main method ends
}//class ends
