import java.util.Scanner;

public class examplearray {

	public static void main(String[] args) {
		int arr[]= new int[5];
		
		
		System.out.println("Enter the password for google account " );
		Scanner sc= new Scanner(System.in);
		 arr[0]= sc.nextInt();
		
		System.out.println("Enter the password for facebook account " );
		 arr[1]=sc.nextInt();
			
			System.out.println("Enter the password for linkedIn account " );
		     arr[2]=sc.nextInt();
		     
		   
		     
		   while(true)
		   {
		     double choice= Math.random();
		    if(choice<0.33)
		    {
		    	System.out.println("Enter the password for google account " );	
		    	int temp =sc.nextInt();
		    	if (temp==arr[0])
		    			System.out.println("Well done");
		    	else break;
		    	
		    }else if(choice<0.66)
		    {
		    	System.out.println("Enter the password for facebook account " );	
		    	int temp =sc.nextInt();
		    	if (temp==arr[1])
		    			System.out.println("Well done");
		    	else break;	
		    	
		    }else {
		    	System.out.println("Enter the password for LinkedIn account " );	
		    	int temp =sc.nextInt();
		    	if (temp==arr[2])
		    			System.out.println("Well done");
		    	else break;
		    	
		    	
		    	
		    }
		    	
		    	
		    	
		   }sc.close();
		    
		    
		    
		    
		    
	}

}
