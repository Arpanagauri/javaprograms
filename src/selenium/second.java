package selenium;

class seconddemo{
	
	int a;
	static int b;
	 void nonstatic()
	{
		System.out.println("non Static block" + ++b );
		static1();
	}
	 
	 static void static1()
	 {
		
		 System.out.println("static block"+ b);
		// new seconddemo().nonstatic();
	 }
}

public class second {

	public static void main(String[] args) {
		
		seconddemo obj= new seconddemo();
		seconddemo obj1= new seconddemo();
		obj.a=100;
		seconddemo.b=1000;
		obj1.a=200;
		seconddemo.b=500;
		obj.nonstatic();
		System.out.println("The value of a is" + obj.a);
		System.out.println("The value of b is" + obj.b);
		System.out.println("The value of a is" + obj1.a);
		System.out.println("The value of b is" + obj1.b);
		
		
	

	}
	

}
