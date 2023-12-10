import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		String[] names= {"ganesh","ganesh","ji","ss"};
		int n = names.length;
		int i,j;
		System.out.println("your elements:");
		for(i=0;i<n;i++)
		{
			System.out.print(names[i]+"\t");
		}
		System.out.println();
		System.out.println("duplicate elements are:");
		for(i=0;i<n;i++)
		{
			
			for(j=i+1;j<n;j++)
			{
				if(names[i]==names[j])
				{
					System.out.print(names[j]);
				}
				
			}
			
		}
}
}

