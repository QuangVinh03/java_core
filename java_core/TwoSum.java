package java_core;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
        	for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) return new int[] {i , j};
			}
		}
        return new int[0];
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,4,6};
		int[]  arr = twoSum(nums,7 );
		for(int a: arr) System.out.println(a);
	}
}
