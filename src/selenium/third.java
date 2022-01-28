package selenium;

class my{
	int a;
	static int b;
	int c;
	 my()
	{
		System.out.println("This is 0 arg constructor");
	}
	 my(int a,int b)
	{
		
		this.a=a;
		my.b=b;// static variable b so not used this
		
	}
	 my(int a,int b, int c)
	{
		this(a,b);
		this.c=c;
	}
	
	void display() {
		System.out.println("The value of a,b and c is " + a+ " " + b+ " " + c);
	}
	static void show() {
		System.out.println("The value of a,b and c is " + new my().a + " " + b + " " + new my().c);
	}
	
	
}

public class third {

	public static void main(String[] args) {
		
		my obj= new my(10,20,30);
		obj.display();
		my.show();
		
}

}
