import java.util.Scanner;

public class area {

	int length, breadth;
	
void 	setDim(int l, int b)
{
	length=l;
	breadth=b;
	
}
 float getArea()
 {
	 
	 float area= length*breadth;
	 return area;
 }
	
	
	public static void main(String[] args) {
		
		while(true)
		{
			System.out.println("Enter the length ");
			Scanner sc= new Scanner(System.in);
			int one=sc.nextInt();
		
			System.out.println("Enter the breadth ");
			int two=sc.nextInt();
			
			sc.close();
			area obj=new area();
			obj.setDim(one,two);
			float valuearea= obj.getArea();
			System.out.println("The area is " + valuearea);
		     break;
			
			
			
		}
		
		
		
	}

}
