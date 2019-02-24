import java.util.ArrayList;
import java.util.List;

public class TwoNumbersRunner {
	
	
	
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(9);
		numbers.add(11);
		numbers.add(4);
		numbers.add(8);
		
		TwoNumbers test = new TwoNumbers(numbers, 17);
		System.out.println(test.TwoNums());
	}
}
