class Triangle1{
	int s1,s2,s3;
	
	Triangle1(int s1,int s2,int s3)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	
	float area()
	{
		float area;
		area = s1*s2*s3;
		return area;
	}
	
	
	
	
}



public class Triangle2 {

	public static void main(String[] args) {
Triangle1 obj= new Triangle1(3,4,5);
float area=obj.area();
System.out.println("The area is "+ area);

	}

}
