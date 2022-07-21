/**
  @author  : Jagadheeshwaran
**/

class C
{
	public static void main(String[] args)
	{		
		C obj  = new C();
		System.out.println("from main");
		String myfruites  = obj.apple();
		System.out.println(myfruites);
	}	
	public String apple()
	{		
		System.out.println("From String Apple");
		return "Orrange is given";
	}
}