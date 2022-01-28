import java.util.Scanner;

public class insertionsort2 {

	public static void main(String[] args) {
		
		int[] number= new int[10];
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int Len= sc.nextInt();
		
		
		
		for(int i=1;i<=Len;i++)
		{
			System.out.println("Enter the number " +i);
			number[i]=sc.nextInt();
		}

		System.out.println("The List to sort is");
		for(int i=1;i<=Len;i++)
		{														
			System.out.print(  number[i] + ", ");	
		}
		
		
		for(int i=1;i<=Len;i++)
		{
			int j = i-1;
			int temp= number[i];
			while (j>=0 && number[j]>temp)
			{
				
			number[j+1]=number[j];
			
			j--;
			}number[j+1]=temp;
			

		}
		
		for(int j=1;j<=Len;j++)
		{
		System.out.print("    "+ number[j]+"," );
		}
	
				
		
		
		

		
		
		
		
		
		
		
		
		
		

	}

}
