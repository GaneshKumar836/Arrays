import java.util.Scanner;

public class Example {//array sum of elements

	public static void main(String[] args) {
		
		int[] a =new int[100];//starts with 0 end with 99
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        n=sc.nextInt();
        System.out.println("enter"+" "+n+" "+"element");
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        	sum=sum+a[i];
        }
        System.out.println(sum);
	}

}
