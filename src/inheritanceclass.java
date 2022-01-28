class triangle{
	
	int a,b,c;
	float perimeter;
	
	triangle()
	{
		
	}
	triangle(int a,int b, int c)
	{
		
		this.a=a;
		this.b=b;
		this.c=c;
		
	}

	
	float perimeter()
	
	{
		
		perimeter=a+b+c;
		return perimeter;	
	}
	}

class equilateral extends triangle{
	         
	
	equilateral(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	
	}
	          
	          float perimeter()
	          {
	        	  
	        	  perimeter= 2*(a+b+c);
	        	  return perimeter;
	          }
	         
	
}
	

class right extends triangle{
		float perimeter(int a,int b,int c)
		{
			
			perimeter=a+b+c;
			return perimeter;	
		}	
}
	
public class inheritanceclass{
	public static void main(String[] args) {

                 triangle obj= new triangle(1,2,3);
                float triperi=obj.perimeter();
                 System.out.println("The perimeter of triangle is" + triperi);
		
					right obj1= new right();
                     float rttriperi=obj1.perimeter(2,3,5);
                  	System.out.println("The perimeter of right angle triangle is" + rttriperi);
                  	
                  	equilateral obj2= new equilateral(1,2,3);
                   float equiperi= obj2.perimeter();
                  	System.out.println("The perimeter of equilateral triangle is" + equiperi);
                	
	}

}
