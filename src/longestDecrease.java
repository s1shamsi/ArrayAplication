import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class longestDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr =  new ArrayList <> (Arrays.asList(1, 2, 3, 4, 10,9,8,7,6,100,215));

		System.out.println("All Numbers  : "+ arr);

			Set<Integer>set = new LinkedHashSet<>();
			set.addAll(arr);
			arr.clear();
			arr.addAll(set);
			Collections.sort(arr,Collections.reverseOrder());
			System.out.println("Sort and decreased array  : "+ arr);

	}

}
