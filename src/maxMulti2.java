import java.util.Arrays;

public class maxMulti2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 4, 5, 6 };
	        int a = arr.length;
	        // sort array
	        Arrays.sort(arr);
	       int num1 =arr[a - 1];
	       int num2 =arr[a - 2];
	       int num3 =arr[a - 3];
	       int num4 =arr[a - 4];

		    System.out.println("The 4 largest numbers are: { " + num1 + ", " + num2 + ", " + num3 + ", " + num4+" }");
		    System.out.println("The * pruduct of the element =  "+num1 * num2 * num3* num4);
	}

}
