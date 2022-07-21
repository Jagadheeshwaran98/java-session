//@author  : Jagadheeshwaran

import java.util.*;

class Local{
	public static void main(String []a){
		Scanner cs = new Scanner(System.in);
		
		System.out.println("Enter first value");
		int value1;//local variable

//		= cs.nextInt();
		System.out.println("Enter second value");
		int value2;//local variable 
//		= cs.nextInt();
		
		
		addition(value1,value2);
		
		
	}
	
	public static void addition(int i,int j)
	{
		
		int k = i + j;
		
		System.out.println("Result "+k);
		
		
	}
	
	
	
	
	
	
	
}