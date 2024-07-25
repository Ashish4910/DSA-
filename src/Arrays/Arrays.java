package Arrays;

public class Arrays {

	// lecture 10
	public static void printPairs(int number[]) {
		for (int i = 0; i < number.length; i++) {

			for (int j = i + 1; j < number.length; j++) {
				System.out.print("(" + number[i] + "," + number[j] + ")");
			}
			System.out.println();
		}
	}
// output
//	(2,4)(2,6)(2,8)(2,10)
//	(4,6)(4,8)(4,10)
//	(6,8)(6,10)
//	(8,10)

//	lecture 11 
	public static void printSubarrays(int num[]) {
		int total_subarrays = 0;
		int subarray_sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				for (int k = i; k <= j; k++) {
					subarray_sum = subarray_sum + num[k];
					System.out.print(num[k]);
				}
				System.out.print("=" + subarray_sum);
				if (subarray_sum > max) {
					max = subarray_sum;
				}
				if (subarray_sum < min) {
					min = subarray_sum;
				}
				total_subarrays++;
				System.out.println();
				subarray_sum = 0;
			}
			System.out.println();
		}
		System.out.println("Total subarrays : " + total_subarrays);
		System.out.println("Max subarrays : " + max + ", Min Subarrays : " + min);
	}

//	output 
//	        2=2
//			24=6
//			246=12
//			2468=20
//			246810=30
//
//			4=4
//			46=10
//			468=18
//			46810=28
//
//			6=6
//			68=14
//			6810=24
//
//			8=8
//			810=18
//
//			10=10
//
//			Total subarrays : 15

//			Max subarrays : 30, Min Subarrays : 2

//	lecture 12 is same as lecture 11 here we only want to display max subarray value that we have find in lecture 11

//	lecture 13 Kadane's Algorithm
	public static void kadane(int number[]) {

		int cs = 0;
		int ms = Integer.MIN_VALUE;

		for (int i = 0; i < number.length; i++) {

			cs = cs + number[i];
			if (cs < 0) {
				cs = 0;
			}
			ms = Math.max(ms, cs);
		}
		System.out.println("max sum is : " + ms);

	}
//	output 
//	max sum is : 7

//	lecture 15  Trapping Rain Water
	public static int trappingWater(int nums[]) {
		int trapped = 0;
		int n = nums.length;
		int left[] = new int[n];
		int right[] = new int[n];

		// left max calculate
		left[0] = nums[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i-1], nums[i]);
		}

		// Right max calculate
		right[n-1] = nums[n-1];
		for (int i = n-2; i >=0; i--) {
			right[i] = Math.max(right[i+1], nums[i]);
		}

		for (int i = 0; i < n; i++) {
			int waterLevel = Math.min(right[i], left[i]);

			trapped += (waterLevel - nums[i]);
		}

		return trapped;
	}

// output
//	11
	
	
	
	public static void main(String args[]) {
//		lecture 10 
//		int num[] = { 2, 4, 6, 8, 10 };
//		printPairs(num);

//		lecture 11 
//		int num[] = { 2, 4, 6, 8, 10 };
//		printSubarrays(num);

//		lecture 13 
//		int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
//		kadane(number);

//		lecture 15 Traping rain water 
		int nums[] = { 4, 2, 0, 6, 3, 2, 5 };
		System.out.println(trappingWater(nums));
	}
}
