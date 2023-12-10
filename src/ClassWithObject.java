import java.util.Scanner;//import package from scanner class

public class ClassWithObject {//class starts

		int id;//initialize the variable 
		String name;//initialize the class
		double sal;//initialize the variable 
		
		
		Scanner sc=new Scanner (System.in);//create an Scanner class object using new keyword
		
		void getData()//create user-defined member method
		{
			System.out.println("enter your id:");//print statement
			id=sc.nextInt();//assign a value to the variable
			System.out.println("enter your name:");//print statement
			name=sc.next();//assign a value to the variable
			System.out.println("enter your salary:");//print statement
			sal=sc.nextDouble();//assign a value to the variable
			
		}
		void printData()//create user-defined member method
		{
			System.out.println("your id is:"+id);//print statement of id
			System.out.println("your name is:"+name);//print statement of name
			System.out.println("your salary is:"+sal);//print statement of salary
		}
		public static void main(String[] args) {//main is a prototype method
			
			ClassWithObject o=new ClassWithObject();//create an object using classname with new keyword
              o.getData();//accessing member method
              o.printData();//accessing member method
			
			
			
	}

}//class ends
