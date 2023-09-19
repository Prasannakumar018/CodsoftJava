package numberGame;

import java.util.Scanner;
import java.util.Random;   

public class Randomly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random random= new Random();
		System.out.println("Enter any guess between 1 to 100");
		int number1;
		int randomNo= random.nextInt(100);
		int count=3;
		boolean playing=true;
		
		while(playing) {
			System.out.println("TRY YOUR GUESS>>>");
   		do{
   			number1=sc.nextInt();
   			
			if(number1 > randomNo) {
				count--;
				System.out.println("Your guess is higher than the number");
				System.out.println("Your try "+count+" chances...try again!");
			}
			else if(number1 < randomNo) {
				count--;
				System.out.println("Your guess is lower than the number");
				System.out.println("Your try "+count+" chances...try again!");
			}
			if(number1==randomNo){
				System.out.println("Congratulations...");
				break;
			}
			System.out.println("Enter another number");
			
			
		}while(count!=0);
		
   		System.out.print("Wanna Continue...Enter 0 to exit...");
   		int playng= sc.nextInt();
		playing = (playng==1);
   		
		}
		System.out.println("The number is..."+randomNo);
		System.out.println("Thank you for playing...");
	}

}
