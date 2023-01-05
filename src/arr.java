import java.util.ArrayList;
import java.util.Scanner;

public class arr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 11 names");
		String k1= sc.next();
		result.add(k1);
		String k2= sc.next();
		result.add(k2);

		String k3= sc.next();
		result.add(k3);

		String k4= sc.next();
		result.add(k4);

		String k5= sc.next();
		result.add(k5);

		String k6= sc.next();
		result.add(k6);

		String k7= sc.next();
		result.add(k7);

		String k8= sc.next();
		result.add(k8);

		String k9= sc.next();
		result.add(k9);

		String k10= sc.next();
		result.add(k10);

		String k11= sc.next();
		result.add(k11);


		for (int i = 0; i < result.size(); i++) {
		    String name = result.get(i);
		    int count = 0;
		    for (int j = 0; j < result.size(); j++) {
		        if (name.equals(result.get(j))) {
		            count++;
		        }
		    }
		    System.out.println(name + " is repeated " + count + " times");
		}
	}

}