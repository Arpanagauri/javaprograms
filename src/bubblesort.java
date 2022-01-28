import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int holder;
		System.out.println("Enter the number of nos.: ");
		Scanner sc= new Scanner(System.in);
		int Len=sc.nextInt();
		int[] numbers = new int[10];
		
		for(int k=0;k<Len;k++)
		{
			int Z = k+1;
			System.out.println("Enter no "+ Z);
			numbers[k]=sc.nextInt();
			
		}	
		for(int a=0;a<Len-1;a++) {
		for(int i=0;i<Len-1;i++)
		{
			holder=numbers[i];
		if(numbers[i]>numbers[i+1])
		{
			numbers[i]=numbers[i+1];
			numbers[i+1]=holder;
		}
		}
		}
		for(int j=0;j<Len;j++)
		{
				System.out.print(numbers[j]+" ");
		}sc.close();
		
	}

}
