import java.util.Arrays;
import java.util.Stack;

public class greater10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,20,15,15,30,15,15};
		  Arrays.sort(arr);
		Stack<Integer> stk = new Stack<Integer>();

		System.out.println("the array =  "+ Arrays. toString(arr) );
		for(int i = 0 ; i<arr.length ; i++) {
		      
				if ( (arr[i] > 10 && arr[i] == arr[i])  ) 
				{
				 stk.push(arr[i]);
				}	
		}
		
		System.out.println(stk);
		for (int i =0; i < stk.size() ; i++)
		{
			if (stk.pop() == stk.pop())
			{
				stk.push(stk.pop());
			}
			System.out.println("val = "+stk.pop());
			System.out.println(" repeted for: "+stk.size()+" time ");
			break;
		}
		
	}

}
