import java.util.Arrays;////package imports from Array class

public class OneDimensional {//array sorting-//class starts

	public static void main(String args[])//main method of class ->string type of array object
	{
		int[] a= {77,98,12,457,654,57,75};//create an array and initialize the values here
		int n=a.length;//length the array to store n
		System.out.println("length of the array:"+n);//print statement
		System.out.println("before sorting:");//print statement
		for(int i=0;i<n;i++)//condition checks until loop terminates
		{
			System.out.print(a[i]+" ");//print the values of an array before sorting
			
		}
		System.out.println();//new line space
		Arrays.sort(a);//built in class in util.package
		System.out.println("after sorting:");//print statement
		for(int i=0;i<n;i++)//condition checks until loop terminates
		{
			System.out.print(a[i]+" ");//print the values of an array after sorting
		}
	}
}
