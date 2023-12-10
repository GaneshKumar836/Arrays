import java.util.Scanner;//Package from Scanner class(built-in class)

public class MatrixMul {//Class starts

	public static void main(String[] args) {//Main method of the class built-in 
		int[][] a=new int[100][100];//array of  a
		int[][] b=new int[100][100];//array of  b
		int[][] c=new int[100][100];//array of  c
		int i,j,k,n;//initialize the variables 
		Scanner sc=new Scanner(System.in);//Scanner using to create an object for access variables
		System.out.println("enter the marix value");//print statement
		n=sc.nextInt();//assign a value to the variable 
		System.out.println("your matrix is"+" "+n+" X "+ n);//print statement
		System.out.println("enter matrix a");//print statement
		for(i=0;i<n;i++)//outer loop
		{
			for(j=0;j<n;j++)//inner loop
			{
				a[i][j]=sc.nextInt();//assign data to array of a
			}
		}
		System.out.println("enter matrix b");//print statement
		for(i=0;i<n;i++)//outer loop
		{
			for(j=0;j<n;j++)//inner loop
			{
				b[i][j]=sc.nextInt();//assign data to array of b
			}
		}
		System.out.println("matrix of a is");//print statement
		for(i=0;i<n;i++)//outer loop
		{
			for(j=0;j<n;j++)//inner loop
			{
				System.out.print(a[i][j]+" ");//print statement
			}
			System.out.println();//print statement for line space
		}
		System.out.println("matrix of b is");//print statement
		for(i=0;i<n;i++)//outer loop
		{
			for(j=0;j<n;j++)//inner loop
			{
				System.out.print(b[i][j]+" ");//print statement
				
			}
			System.out.println();//print statement for line space
		}
		System.out.println("matrix multiplication is");//print statement
		
		for(i=0;i<n;i++)//outer loop
		{
			for(j=0;j<n;j++)//inner loop
			{
				c[i][j]=0;
				for(k=0;k<n;k++)//inner inner loop
				{
					c[i][j]+=a[i][k]*b[k][j];//operation performs
				}

	}

}
		for(i=0;i<n;i++)//outer loop
		{
			for(j=0;j<n;j++)//inner loop
			{
				System.out.print(c[i][j]+" ");//print statement for array of c
			}
			System.out.println();//print statement for line space
	}
}
}