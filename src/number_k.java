import java.util.HashSet;
import java.util.Set;

public class number_k {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = { 1, 2, 4, 6, 8, 9, 10 };
			
		 System.out.println("k = " + Sum(arr));
			}
			public static int Sum(int[] evennumber) {
		 int total = 14;
			
		 for (int i = 0; i < evennumber.length; i++) {
			 
		   for (int j = i + 1; j < evennumber.length; j++) {
			   
		    if ( evennumber[i] % 2 == 0 && evennumber[j] % 2 == 0) {
		    	
		       if ( evennumber[i] + evennumber[j] == total) {
		    	   
		    	   
		          System.out.println( + evennumber[i] + " + " + evennumber[j] + " = " + total);
		           System.out.println("<><><><><><><><><><><><>");
		              }
		             }
		            }
		           }
		 return total;

	}

}
