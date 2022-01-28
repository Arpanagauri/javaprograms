package selenium;

class triangle{
	int a,b,c,base,height;
	float area,perimeter;
	
	triangle()
	{
		System.out.println("This is 0 arg triangle constructor");
	}
	
	triangle(int a,int b, int c)
	{
		this();
		this.a=a;
		this.b=b;
		this.c=c;
		
	}

	float area(int base, int height)
	{
		area=(base*height)/2;
		return area;
	}
	
	float perimeter()
	
	{
		
		perimeter=a+b+c;
		return perimeter;	
	}
	}

class equilateral extends triangle{
	         
	equilateral()
	{
		System.out.println("equilateral 0 arg constructor");
	}
	equilateral(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	
	}
	
	          float area() 
	          {
	          area=(float)(1.73*a*a)/4;
	          return area;
	          }
	          
	          float perimeter()
	          {
	        	  
	        	  perimeter= 2*(a+b+c);
	        	  return perimeter;
	          }
	         
	         void resultperimeter() {
	        	  float perimeter =super.perimeter();
	        	  System.out.println("The perimeter is " + perimeter);
	         }    
	          
}
	

class right extends triangle{
		float perimeter(int a,int b,int c)
		{
			
			perimeter=a+b+c;
			return perimeter;	
		}	
}
	
public class homeworkinherit{
	public static void main(String[] args) {

                 triangle obj= new triangle(1,2,3);
                 float triarea=obj.area(2,3);
                 System.out.println("The area of triangle is" + triarea);
                 
                 float triperi=obj.perimeter();
                 System.out.println("The perimeter of triangle is" + triperi);
		
					right obj1= new right();
              
                  float rttriarea=obj1.area(2,5);
                  System.out.println("The area of right angle triangle is" + rttriarea);
                  
                  float rttriperi=obj1.perimeter(2,3,5);
                  	System.out.println("The perimeter of right angle triangle is" + rttriperi);
                  	
                  	equilateral obj2= new equilateral(1,2,3);
                  	
                  	float equiarea=obj2.area();
                  	 System.out.println("The area of equilteral triangle is" + equiarea);
                  	
                  	 float equiperi= obj2.perimeter();
                  	System.out.println("The perimeter of equilateral triangle is" + equiperi);
                	obj2.resultperimeter();
	}

}

