import java.util.Scanner;

public class Game {

	static float Cash=10000;
	 int Status;
	 float Rand;
	public static void main(String[] args) {
	


		System.out.println("Welcome to THE BETTER *press a no then enter to begin*");
		Scanner sc = new Scanner(System.in);
		//int num=sc.nextInt();
		while(Cash>0) {
		Game gm= new Game();
		
			gm.bet();

		}
}

	private void bet() {
		float Profit;
		float percent;
		System.out.println("You have "+ Cash + " cash");
		Rand = (float)(Math.random());
		Scanner sc = new Scanner(System.in);

		
		if (Rand < 0.14) {
			System.out.println("Major decrease");
			Rand = (float)(Math.random());
			 percent=sc.nextInt();
			if (Rand <=0.07 ) {
				Status = 1;
				System.out.println("Well, The Market went up... WHAT?!?!?");
			}
		}
		else if (Rand <= 0.36) {
			Rand = (float)(Math.random());
			System.out.println("Minor decrease");
		 percent=sc.nextInt();
			if (Rand <= 0.3 ) {
				Status = 1;
				System.out.println("OK the market was lucky this time ... it went up!");		
			}
		}
		else if (Rand<= 0.69) {
			Rand = (float)(Math.random());
			System.out.println("the Market is flat");
			percent=sc.nextInt();
			if (Rand <=0.5 ) {
				Status = 1;
				System.out.println("The market ... grew");		
			}
		}
		else if (Rand <= 0.87) {
			System.out.println("The Market is going up");
			Rand = (float)(Math.random());
			percent=sc.nextInt();
			if (Rand <=0.78 ) {
				System.out.println("My prediction told yah.IT GREW!");
				Status = 1;
			}
			else {
				
			}
		}
		else{
			Rand = (float)(Math.random());
			System.out.println("WOW The market is big Buisness");
			percent=sc.nextInt();
			if (Rand <=0.97 ) {
				Status = 1;
				System.out.println("Off course it went up.");		
			}
			
			
		}
			
						percent=percent/100;
			if (Status == 1 && percent != 0 ) {
			
				Profit = (Cash *percent)/10; 	
				System.out.println("You Earned "+Profit);
				Cash=Cash+Profit;
			}	
			if(Status==0 && percent != 0 ) {
			
				Profit = Cash *percent; 	
				System.out.println("You Lost "+(Profit*10));
				Cash=Cash-(Profit*10);
				
			}	

			Status=0;
		}	}