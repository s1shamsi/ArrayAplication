import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0, 0, 1, 1,15,16, 2,2, 3, 3, 4, 4, 5, 5};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i : array) {
		if (map.containsKey(i)) {
		map.put(i, map.get(i)+1 );
		
		if(map.get(i)==2)
		arr.add(i);
		} else {
		map.put(i, 1);
		}
		}
		
		System.out.println("Duplicate elements in array: " + Arrays.toString(arr.toArray()));
	}

}
