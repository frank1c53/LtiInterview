import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargest {

	public static void main(String[] args) {
		/*
		 * List<Integer> list = Arrays.asList(11, 21, 51, 121, 101, 151, 101, 201, 121,
		 * 51, 21); List<Integer> list2 =
		 * list.stream().sorted().collect(Collectors.toList());
		 * System.out.println(list2); System.out.println(list2.get(list2.size()-2));
		 */
	
		List<Integer> list = Arrays.asList(11, 22, 51, 121, 102, 150, 100, 201);
		List<Integer> oddIntegers = list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println(oddIntegers);
		






	
	
	}
}
