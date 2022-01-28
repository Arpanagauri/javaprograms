package selenium;


 abstract class triangle2{
	 
	 int a,b,c;
	  void perimeter()
	  {
		  int peri;
		  peri= a+b+c;
		  System.out.println(peri);
	  }
	 abstract void area();
}

 class equi extends triangle2{
	 
	 void area()
	 {
		double area;
		 area=3.14*super.a*super.b;
		 
	 System.out.println(area);
	 
	 }
	 
	 class iso extends triangle2{
		 void area()
		 {
			double area;
			 area=super.a*super.b;
			 
		 System.out.println(area);
		 
		 } 
		 
	 }
	 
 }



public class triangleabstraction {

	public static void main(String[] args) {
	equi obj = new equi();
	equi obj1 = new equi();
	obj.a=2;
	obj.b=3;
	obj.c=3;
	obj.perimeter();
	obj.area();
	obj1.area();
	
	

	}

}
