package selenium;

class parent{
	
	
	void func()
	{
		
		System.out.println("THis is another func1 parent function");
	}
}

class child extends parent{
	
	void func() {
		
		System.out.println("This is child class");
	}
	void func1()
	{
		System.out.println("This is another method of child class");
	}
}



public class parentchild {
	public static void main(String args[])
	{
		
		parent obj= new child();
		obj.func();
		//obj.func1(); gives error
		
	}

}
