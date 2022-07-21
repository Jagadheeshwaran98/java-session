/**
  @author  : Jagadheeshwaran
  Title : Calculations 
**/

import java.util.*;

class Calc{
	
	//main method calling 
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1 val");
		          int A =sc.nextInt();
		System.out.println("Enter the 2nd val");
					int B =sc.nextInt();
		int addvalue = Addition(A,B);
		int subtactionval = Subtraction(A,B);
		long mulival = Multiplication(A,B);
		double div = Divition(A,B);
		double modval = Modulus(A,B);
		System.out.println("Addition : " +addvalue );
		System.out.println("Subtraction : " +subtactionval );
		System.out.println("Multiplication : " +mulival );
		System.out.println("Divition : " +div );
		System.out.println("Modulus : " +modval );
	}
	//Addition
	public static int Addition(int Param1,int Param2)
	{
		return Param1 + Param2;
	}	
	//Subtrcat return value
	public static int Subtraction(int subval1,int subval2)
	{
		return subval1 - subval2 ;  
	}
	//Multiplication value return
	public static long Multiplication(int param1,int param2)
	{
		return param1 * param2;
	}	
	//Divition return
	public static double Divition(int div1,int div2)
	{
		return div1/div2;
	}
	
	public static double  Modulus(int mod1,int mod2)
	{
		return mod1%mod2;
	}
	
}