public class Program1
{
public static void multiplication()
   {
     System.out.println("From Multiplication");
   }
public static void addition()
   {
     System.out.println("addition");  
   } 
public static void main(String[]args)
   {
     int i=10;
     System.out.println(i);
     addition();
     System.out.println("Hello i am from main");
     Subtraction();
   }
public static void Subtraction()
   {
     division();
     System.out.println("From Subtraction");
   }
public static void division()
   {
    System.out.println("From Division");
    multiplication();
   }
}