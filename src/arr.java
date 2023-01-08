//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class arr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HashMap<String, Integer> hash = new HashMap<>();

	    // Read a list of names from the user
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter 11 names");
	    for (int i = 0; i < 11; i++) {
	      String name = sc.next();
	      // Increment the count for the name
	      hash.put(name, hash.getOrDefault(name, 0) + 1);
	    }

	    // Print the name counts
	    System.out.println("Name counts:");
	    for (String name : hash.keySet()) {
	      System.out.println(name + "  is repeated: " + hash.get(name)+ "  time");
	    }
	}

}