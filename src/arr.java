import java.util.ArrayList;
import java.util.Scanner;

public class arr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 11 names");
		String k1= sc.next();
		String k2= sc.next();
		String k3= sc.next();
		String k4= sc.next();
		String k5= sc.next();
		String k6= sc.next();
		String k7= sc.next();
		String k8= sc.next();
		String k9= sc.next();
		String k10= sc.next();
		String k11= sc.next();
		String[] names = {k1,k2,k3,k4,k5,k6,k7,k8,k9,k10,k11};
		ArrayList<String> result = Count(names);
		for (String s : result) {
		    System.out.println(s);
		}
	}

	
	public static ArrayList<String> Count(String[] names) {
	    ArrayList<String> result = new ArrayList<>();
	    for (String name : names) {
	        int count = 0;
	        for (String n : names) {
	            if (name.equals(n)) {
	                count++;
	            }
	        }
	        result.add(name + " is repeated " + count + " times");
	    }
	    return result;
	}
}
