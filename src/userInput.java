import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.println("Please enter first input");
		while (!sc.hasNextInt())
		{
		System.out.println("Your first input does not match, please enter a number between 0 and 100");
		sc.next();
		}
		n1 = sc.nextInt();
		while (n1 > 100 || n1 < 0)
		{
		System.out.println("Your first input does not match, please enter a number between 0 and 100");
		n1 = sc.nextInt();
		}
		System.out.println("Please enter second input");
		while (!sc.hasNextInt())
		{
		System.out.println("Your second input does not match, please enter a number between 0 and 100");
		sc.next();
		}
		n2 = sc.nextInt();
		while (n2 > 100 || n2 < 0)
		{
		System.out.println("Your second input does not match, please enter a number between 0 and 100");
		n2 = sc.nextInt();
		}
		System.out.println(" First number is :  " + n1+ "  ,and second number is :  "+ n2);
		
	}
	}


