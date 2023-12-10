import java.util.Scanner;//Package from Scanner class-built

public class DiagonalMatrix {//class starts

	public static void main(String[] args) {//main method of the class-built in method
		int[][] a=new int[100][100];//create an array of integer
		Scanner sc=new Scanner(System.in);//scanner to create an object for accessing
		System.out.println("enter your size of matrix:");//print statement
		int n=sc.nextInt();//assign value to variable
		System.out.println("your matrix size of"+n+"X "+n);//print statement
		int i,j,sum=0;//initialize the variables
		System.out.println("enter your matrix ");//print statement
		for(i=0;i<n;i++)//outer loop
		{
			for(j=0;j<n;j++)//inner loop
			{
			a[i][j]=sc.nextInt();//assign values to array of a
			
		}

	}
		System.out.println("your matrix is:");//print statement
		for(i=0;i<n;i++)//outer loop
		{
			for(j=0;j<n;j++)//inner loop
			{
				System.out.print(a[i][j]+" ");//print statement
			}
			System.out.println();//print statement using line space

	   }
		System.out.println("sum of one side diagonal:");//print statement
		for(i=0;i<n;i++)//condition checks
		{
			sum=sum+a[i][i];//operation happend
		}
		System.out.println(sum);//print statement to print sum
		sum=0;
		System.out.println("sum of another side diagonal:");//print statement
		for(i=0,j=n-1;i<n;i++,j--)//loop will condition checks
		{
			sum=sum+a[i][j];//operation happend
		}
		System.out.println(sum);//print statement to print sum
	}
		

}//class ends
