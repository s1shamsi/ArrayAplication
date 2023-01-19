import java.util.Arrays;

public class missingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5, 10, 20, 25, 30};
 		System.out.println("the  array is "+ Arrays.toString(arr));

		 for(int i = 0 ; i < 3 ; i++)	
		{
			for(int j = i+1 ; j < 2 ; j++)
			    {
			         int k =  arr[j] - arr[i]; 
			 		System.out.println("the  deffrence number is "+k);
			 		int[] arr2 = {arr[0],(arr[0]+k),(arr[0]+2*k),(arr[0]+3*k),(arr[0]+4*k),(arr[0]+5*k)};
			 		System.out.println("the array with missing number =  "+ Arrays.toString(arr2));
			 	
			     }
		}
		
	
	}

	}


