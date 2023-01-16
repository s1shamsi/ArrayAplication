import java.util.Arrays;

public class thirdhighestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       
	        int[] arryNumber = { 1,1500, 200, 13, 4, 5, 6};
	        int a = arryNumber.length;
	        // sort array
	        Arrays.sort(arryNumber);
	        System.out.println("The third highest number is: " + arryNumber[a - 3]);
	       	
}}
