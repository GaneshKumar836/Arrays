//Addition matrix using two dimensional array

import java.util.Scanner;//Package from Scanner class(built-in class)

public class AdditionMatrix {//Class starts

	public static void main(String[] args) {//Main method of the class
		int a[][]=new int[100][100];//array of  a
		int b[][]=new int[100][100];//array of b
		Scanner sc=new Scanner(System.in);//Scanner using to create an object
		System.out.println("enter your matrix");//print statement
		int n=sc.nextInt();//assign value to n
		System.out.println("your matrix is"+" "+n+"X"+n);//print statement
		int i,j;
		System.out.println("enter matrix a");//print statement
		for( i=0;i<n;i++)//outer loop
		{
			for( j=0;j<n;j++)//inner loop
			{
				a[i][j]=sc.nextInt();//assign data to array of a
			}
		}
		System.out.println("enter matrix b");//print statement
		for(i=0;i<n;i++)//outer loop
		{
			for( j=0;j<n;j++)//outer loop
			{
				b[i][j]=sc.nextInt();//assign data to array of b
			}
		}
		System.out.println("your matrix a is");//print statement
		for( i=0;i<n;i++);//outer loop
		{
			for(j=0;j<n;j++)//inner loop
			{
				System.out.print(a[i][j]+"  ");//print statement
			}
			System.out.println();//print statement for line space
		}
		System.out.println("your matrix b is");//print statement
		for(i=0;i<n;i++)//outer loop
		{
			for( j=0;j<n;j++)//inner loop
			{
				System.out.print(b[i][j]+" ");//print statement
			}
			System.out.println();//print statement for line space
		}
		System.out.println("addition of two matrix is" );//print statement
		for( i=0;i<n;i++)//outer loop
		{
			for( j=0;j<n;j++)//outer loop
			{
				System.out.print(a[i][j]+b[i][j]+" ");//print statement
			}
			System.out.println();//print statement for line space

		}

	}

}
