import java.util.Scanner;

public class bubblesort2 {

	public static void main(String[] args) {
	int[] bubble= new int[10],length;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n= sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		System.out.println("Enter the number " +i);
		bubble[i]=sc.nextInt();
	}
	System.out.println("They list to sort is");
	for(int i=1;i<=n;i++)
	{
		System.out.print( bubble[i] + ", " );
		
	}
for(int k=1;k<n;k++) {
	for(int i=1;i<n;i++)
	{
	if(bubble[i]>bubble[i+1])
	{
	int temp= bubble[i];
		bubble[i]=bubble[i+1];
		bubble[i+1]=temp;
		
	}			
	}
}
	System.out.println("The sorted list is :");
	System.out.println("");
	for(int i=1;i<=n;i++)
	{
		System.out.print(bubble[i]+ " ");
	}
	
	
	
	
	
	
	
	
	
	
	}

}
