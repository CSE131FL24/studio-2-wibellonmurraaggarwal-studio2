package studio2;
import java.util.Scanner;
public class Ruin {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int win =0;
		int ruin =0;
		System.out.println("What is your start amount? ");
		int startAmount = in.nextInt();
		
		System.out.println("What is your win probability? ");
		double winChance = in.nextDouble();
		
		System.out.println("How much do you want to earn today? ");
		int winLimit = in.nextInt();
		
		System.out.println("How man days? ");
		int totalSimulations = in.nextInt();
		
		//int currentAmount = startAmount;
		
		for(int x = 0; x <=totalSimulations;x++) {
			
			int currentAmount = startAmount;
			

		while (currentAmount > 0 && currentAmount < winLimit) {
			double randomNumber = Math.random();
			int timesRan =0;
			if(randomNumber< winChance) {
				currentAmount++;
				timesRan++;
			}
			else if(randomNumber>winChance) {
				currentAmount--;
				timesRan++;
			}
			if(currentAmount==0) {
				System.out.println("The day ended in a loss :( ");
				ruin++;
				//=f
			}
			if(currentAmount==winLimit) {
				System.out.println("The day ended in a win");
				win++;
				
			}
		}}
		

	}

}
