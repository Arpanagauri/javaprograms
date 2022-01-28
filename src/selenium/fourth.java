package selenium;

import java.util.Scanner;

public class fourth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	double no_Payments,mortgage,top,bottom	;
	float InterestRate,years;
long Principal;
do {
	System.out.println("Enter the principal amount between 1000 and 100,000 ");

	 Principal= sc.nextLong();
}while ((Principal<1000) || (Principal>100_000));	


do {
System.out.println("Enter the Annual Interest Rate : ");
InterestRate= sc.nextFloat();

}while((InterestRate<=0.0)||(InterestRate>10.0));

InterestRate=InterestRate/1200;
do
{
	System.out.println("Enter the Period in years : ");
	years= sc.nextFloat();
}while((years<=0.0)||(years>30.0));

sc.close();
no_Payments=years*12;

top=InterestRate*( Math.pow((1+InterestRate),no_Payments));

bottom=Math.pow((1+InterestRate),no_Payments )-1;     

mortgage= Principal*(top/bottom);
System.out.println("The mortgage is : " + mortgage);



	}

}
