

 class Student1{
	
	 String name;
		int rollno;
	
}



public class Student {

	public static void main(String[] args) {
		
		
		Student1 obj= new Student1();
		obj.name = "john";
		obj.rollno=2;
		System.out.println("The name and rollno are "+ obj.name +" "+ obj.rollno);
		Student1 obj2= new Student1();
            obj2.name="Sam";
            obj2.rollno= 3;
            System.out.println("The name and rollno are "+ obj2.name +" "+ obj2.rollno);
            
	}

}
