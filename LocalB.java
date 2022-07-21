//@author  : Jagadheeshwaran

import java.util.*;

class LocalB
{
	static int i; //static variable or globel or class level variable 
	//during the complilation static value it will upload in to jvm 
			public static void main(String []a)
			{
				Scanner cs = new Scanner(System.in);
				System.out.println(i);//
				int i=100;
				System.out.println(i);
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