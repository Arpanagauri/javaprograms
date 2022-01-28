package selenium;


class employee2{
	
	String name;
	int salary;
	String address;

	
	employee2(String name,int salary,String address)
	{
		this.name= name;
		this.salary= salary;
		this.address= address;
		
		
	}
	
	
	
}

public class employee {

	public static void main(String[] args) {
employee2 obj = new employee2("Robert ", 25000," Heaton street");
employee2 obj1 = new employee2("Sam ", 35000," 28 Heaton street");
employee2 obj2 = new employee2("John ", 40000," 40 Gladstone road");

System.out.println("Name " +  "Salary "+ "Address  ");
System.out.println(obj.name +" "+ obj.salary +" "+ obj.address);
System.out.println(obj1.name +" "+ obj1.salary +" "+ obj1.address);
System.out.println(obj2.name +" "+ obj2.salary +" "+ obj2.address);



	}

}
