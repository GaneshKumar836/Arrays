//to find maximum and minimum elements on array

import java.util.Scanner;////package imports from scanner class

public class Example1 {//class starts

	public static void main(String[] args) { //main method of class ->string type of array object


     int[] a=new int[100];//create an array of a with the size of 100
     int n,i,max,min;//declare the variables
     Scanner sc=new Scanner(System.in);////Scanner class object is created.its a built-in clas
    System.out.println("enter the value of n:");//print statement
    n=sc.nextInt();//assign a value to the variable n
    System.out.println("enter the elements of "+" "+n);//print statement
    for(i=0;i<n;i++)//loop checks the condition until its terminate
    {
    a[i]=sc.nextInt();	//assign a value to the array a[i]
    }
    min=a[0];//initialize the value of min 
    max=a[0];//initialize the value of min 

    for(i=0;i<n;i++)//loop checks the condition until its terminate
    {
    	if(a[i]<min)//condition checks
    	{
    		min=a[i];
    	}
    	else if(a[i]>max)
    	{
    		max=a[i];
    	}
    }
    System.out.println("minimum value of an array"+" "+min);//print statement
    System.out.println("maximum value of an array"+" "+max);//print statement
	}

}//class ends
