/*
   @author  : Jagadheeshwaran

    Title   : Printing details using interface

*/


public class Details{
    
    public void name1(){
        System.out.println("Ajay");
    }
    
    public void rollNo1(){
        System.out.println("39012");
    }
    
    public void course1(){
        System.out.println("Java");
    }   
        
    public void fees1(){
        System.out.println("Payed");
    }
    
    public void name2(){
        System.out.println("Ramesh");
    }
    
    public void rollNo2(){
        System.out.println("44312");
    }
    
    public void course2(){
        System.out.println("Python");
    }   
        
    public void fees2(){
        System.out.println("Payed");
    }
    
    public void name3(){
        System.out.println("Mani");
    }
    
    public void rollNo3(){
        System.out.println("75512");
    }
    
    public void course3(){
        System.out.println("DotNet");
    }   
        
    public void fees3(){
        System.out.println("Payed");
    }
    

    public static void main(String[] args) {
        
        Details details = new Details();
        System.out.print("Name: ");
        details.name1();
        System.out.print("Roll No: ");
        details.rollNo1();
        System.out.print("Course: ");
        details.course1();
        System.out.print("Fees Status: ");
        details.fees1();
        
        System.out.print("Name: ");
        details.name2();
        System.out.print("Roll No: ");
        details.rollNo2();
        System.out.print("Course: ");
        details.course2();
        System.out.print("Fees Status: ");
        details.fees2();
        
        System.out.print("Name: ");
        details.name3();
        System.out.print("Roll No: ");
        details.rollNo3();
        System.out.print("Course: ");
        details.course3();
        System.out.print("Fees Status: ");
        details.fees3();
        
    }

}