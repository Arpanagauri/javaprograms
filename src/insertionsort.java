import java.util.Scanner;

public class insertionsort {

	public static void main(String[] args) {
		int Len;
		
		int[] number= new int[10],length;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n= sc.nextInt();
		
		Len = n;
		
		for(int i=1;i<=Len;i++)
		{
			System.out.println("Enter the number " +i);
			number[i]=sc.nextInt();
		}

		System.out.println("The List to sort is");
		for(int i=1;i<=Len;i++)
		{														
			System.out.print( number[i] + ", ");	
		}
		
		for(int i=1;i<=Len;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				int temp;
				temp = number[j+1];
				if(number[j] > number[j+1]) {
					number[j+1] = number[j];
					number[j] = temp;
					
					System.out.println("The List is");
					for(int y=1;y<=Len-1;y++)
					{
						System.out.print( number[y] + " ");	
					}	
				
				}
			}	

		}			System.out.println("The List is");
		for(int i=1;i<=Len;i++)
		{
			System.out.print( number[i] + " ");	
		}		
	}

}
