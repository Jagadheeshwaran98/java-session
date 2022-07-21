//@author  : Jagadheeshwaran

import java.util.*;

class LocalC{
	static int value1; 
	static int value2; 
	int value3;  //nan-static variable or instance variable 
	public static void main(String []a)
	{
		int i=0;//
		Scanner cs = new Scanner(System.in);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);//cant able to acces non-sataic variable intom static content
		System.out.println("Enter first value");
		int value1	= cs.nextInt();
		System.out.println("Enter second value");
		int value2= cs.nextInt();
		addition(value1,value2);
	}
	
	public static void addition(int i,int j)
	{
		int k = i + j;
		System.out.println("Result "+k);
		
	}
}