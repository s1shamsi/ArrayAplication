import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0 ;
		int[] arr = { 5 , 6 , 18 ,9 ,6 , 5 , 18};
		int userInput;
	boolean con = true;
	
	while(con) {
	System.out.println("Please Enter number");
	
		userInput =sc.nextInt();
		//boolean con = true;
		
		for( int i = 0 ; i<arr.length ; i++)
		{
			
			if(arr[i] == userInput)
			{
				count ++;
			}
			
		}
		
	System.out.println(" The number "+ userInput+ "  Appears "+ count+ "  times");
	System.out.println(" ");
	System.out.println("Do you want to search for another number 1 for Yes 2 for No");
	System.out.println(" ");
	int chk = sc.nextInt();
	if (chk !=  1)
	{
		con = false;
		
		System.out.println("thank you and goodbye");
	}
	}
}}
