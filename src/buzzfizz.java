import java.util.Scanner;

public class buzzfizz {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num=1;
		while(true)
		{
		System.out.println("ENTER THE NUMBER");
		 num= sc.nextInt();
		if(num==0) break;
		if (num%2==0)
		System.out.println("The number is divisible by 2: " + num);
		else if((num%3==0)&&(num%5==0))
		{
			  System.out.println("fizzBuzz");
		}
		else if(num%3==0)
		{
			System.out.println("fizz");
		}
		else if(num%5==0)
		{
			System.out.println("Buzz");
		
		}	
		else
		{
			System.out.println("number is not divisible by 2,3,5");
		}
		
	}sc.close();
	}
	}
