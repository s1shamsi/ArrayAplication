import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class nonduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0, 0, 1, 1,15,16, 2, 2,2, 3, 3, 4,25, 4, 5, 5};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> nonDupArr = new ArrayList<Integer>();

		for (int i : array) {
		    if (map.containsKey(i)) {
		        map.put(i, map.get(i) + 1);
		    } 
		    else {
		        map.put(i, 1);
		    }
		}

		
		for (int i : array) {
		    if (map.get(i) == 1) {
		        nonDupArr.add(i);
		    }
		}

		System.out.println("Non-duplicate elements in array: " + Arrays.toString(nonDupArr.toArray()));

	}

}
