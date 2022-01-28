package selenium;

 class EmployeeNew{
	
	 void func()
	 {
		 System.out.println("Inside Parent class");
	 }
}

class  triangle5 extends EmployeeNew{
	void func()
	 {
		System.out.println("Inside child class"); 
	 }
	
}

 class  EmployeePolymorphism{

   public	 static void main(String[] args) {
		
		 EmployeeNew obj= new triangle5();
		obj.func();

	}

}
