
public class maxMulti {
	



	public static void main(String[] args) {
		
	    int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
       
	    // Initialize max numbers
	    int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE, c = Integer.MIN_VALUE, d = Integer.MIN_VALUE;

	    // Traverse through the array
	    for (int i = 0; i < n; i++) {
	        if (arr[i] > a) {
	            d = c;
	            c = b;
	            b = a;
	            a = arr[i];
	        } else if (arr[i] > b) {
	            d = c; 
	            c = b;
	            b = arr[i];
	        } else if (arr[i] > c) {
	            d = c;
	            c = arr[i];
	        } else if (arr[i] > d) {
	            d = arr[i];
	        }
	    }

	    System.out.println("The 4 largest numbers are: " + a + ", " + b + ", " + c + ", " + d);
	    System.out.println("The * pruduct of the element =  "+a*b*c*d);
	}
       

}
