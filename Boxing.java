/**
  @author  : Jagadheeshwaran
**/

class Boxing
{
	
	int i;
	String S2;
	public static void main(String []temp)
	{		
		Boxing obj1 = new Boxing();
		obj1.punch();
		obj1.kick();
		obj1.punch();
		obj1.kick();
		Boxing obj2 = new Boxing();
		obj2.punch();
		obj2.kick();
		Boxing obj3 = new Boxing();
		obj3.punch();
		obj3.kick();
		Boxing obj4 = new Boxing();
		obj4.punch();
		obj4.kick();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		Boxing obj5 = obj1;
		System.out.println(obj5);
		obj5.punch();
		obj5.kick();
		Boxing obj6 = null;
		System.out.println(obj6);
		obj6.kick();//Null pointer Exception
		obj6.punch();
		System.out.println(i);//
	}
	public void punch()
	{
		System.out.println("From punch");
	}
	public void kick(){
		System.out.println("from kick");
	}
}