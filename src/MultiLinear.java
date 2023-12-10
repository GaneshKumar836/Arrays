import java.util.Scanner;//package imports from scanner class

public class MultiLinear {//class starts

	public static void main(String[] args) {   //main method of class ->string type of array object
		int a[]=new int[100];//create an array with of 100
		int i,n,search,status=0,count=0;//initialize and declare the some values
		Scanner sc=new Scanner(System.in);//Scanner class object is created.its a built-in class
		System.out.println("enter no of elements:");//print statement
		n=sc.nextInt();//assign value to the variable
		System.out.println("enter your elements:");//print statement
		for(i=0;i<n;i++)//loop checks the condition
		{
			a[i]=sc.nextInt();//assign value to the array of a
		}
		System.out.println("enter your search element:");//print statement
		search=sc.nextInt();//assign value to the variable
		for(i=0;i<n;i++)//loop checks the condition
		{
			if(a[i]==search)//equals operator condition checks 
			{
				status=1;
				count++;
				System.out.println("elemnts found in"+(i+1));//print statement
			}
		}
		if(status==1)//equals operator condition checks 
		{
			System.out.println("element count is:"+count+"times");//print statement
		}
		else
		{
			System.out.println("element not found");//print statement
		}

	}

}//class ends
