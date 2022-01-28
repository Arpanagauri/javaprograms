package selenium;

class static2{
	 static2()
	{
		System.out.println("Inside constructor parent");
	}
	
	 
	
}


class static3 extends static2{
	
	static3()
	{
		
		System.out.println("Inside constructor child ");
	}
	
	
}





public class inheritstatic {
	public static void main(String args[])
	{
static3 obj = new static3();
	}
}
