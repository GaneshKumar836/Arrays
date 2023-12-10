import java.util.Scanner;//Package from Scanner class-built

public class DuplicateNames {//class starts

	public static void main(String[] args) {//main method of the class-built in method
		String names[]=new String[100];//create an array of String
		int i,j,n;//Initialize the variables 
		Scanner sc=new Scanner(System.in);//scanner to create an object for accessing
		System.out.println("How many Names or elements u entered:");//print statement
		n=sc.nextInt();////assign value to variable
		System.out.println("enter your  elements:");//print statement
        for(i=0;i<n;i++)//loop using for condition checks
        {
        	names[i]=sc.next();//assign values of array
        	
        }
        System.out.println(" your  elements are:");//print statement
        for(i=0;i<n;i++)//outer loop
        {
        	System.out.println(names[i]);
        }
        System.out.println();
       System.out.println(" your duplicate elements are:");//print statement
        for(i=0;i<n;i++)//outer loop
        {
        	for(j=i+1;j<n;j++)//inner loop
        	{
        	if(names[i]==names[j])//condition verifies
        	{
        	System.out.print(names[j]);//print statement
        	
        }
        	}
	}

}
}//class ends
