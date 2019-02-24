import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class TwoNumbers {

	private List<Integer> nums;
	private int sum;
	
	public TwoNumbers(List<Integer> arr, int k) {
		nums = arr;
		sum = k;
	}
	
	public String TwoNums() {
		int[] two = new int[2];
		for(int i = 0; i < nums.size() - 1; i++) {
			for(int k = i + 1; k < nums.size(); k++) {
				if(nums.get(i) + nums.get(k) == sum) {
					two[0] = nums.get(i);
					two[1] = nums.get(k);
				}
			}
		}
		
		return Arrays.toString(two);
	}
}
