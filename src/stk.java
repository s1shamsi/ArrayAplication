import java.util.Scanner;
import java.util.Stack;

public class stk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk = new Stack<String>();
		Scanner sr = new Scanner(System.in).useDelimiter("\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Email ");
		String email = sr.next();
		;
		stk.push(email);
		System.out.println("Enter your Phone number ");
		int PhoneNumber = sc.nextInt();
		
		String PhoneNumberr = Integer.toString(PhoneNumber);
		stk.push(PhoneNumberr);
		System.out.println("Enter your name ");
		String name = sr.next();
		
		stk.push(name);
		System.out.println("your information is ");
		while(!stk.empty()) {
			System.out.print(stk.pop()+" ");
		}
		
	}

}
