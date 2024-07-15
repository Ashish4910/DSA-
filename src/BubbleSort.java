package Sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BubbleSort {
	// bubble sort is implemented when you want to shift arrays in assending order
	// and descending order
	// push higher value in last
	public static void bubbleSort(int nums[]) {
		// get first value using 1 for loop
		for (int i = 0; i < nums.length - 1; i++) {
			// get the all the value except first value
			for (int j = 0; j < nums.length - 1 - i; j++) {
				// change the index if current value is greater then +1 index
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;

				}
			}
		}

	}

	public static void selectionSort(int nums[]) {

		for (int i = 0; i < nums.length - 1; i++) {
			int mispos = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[mispos] > nums[j]) {
					mispos = j;
				}
			}
			int temp = nums[mispos];
			nums[mispos] = nums[i];
			nums[i] = temp;
		}

	}

	public static void insertionSort(int nums[]) {

		for (int i = 1; i < nums.length; i++) {
			int curr = nums[i];
			int prev = i - 1;
			while (prev >= 0 && nums[prev] > curr) {
				nums[prev + 1] = nums[prev];
				prev--;
			}
			nums[prev + 1] = curr;
		}
	}

	// counting sort
	// linear time complexcity i.e n
	// use in positive number
	public static void countingSort(int nums[]) {

		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			largest = Math.max(largest, nums[i]);
		}

		int count[] = new int[largest + 1];
		for (int i = 0; i < nums.length; i++) {
			count[nums[i]]++;
		}

		// sort
		int j = 0;
		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				nums[j] = i;
				j++;
				count[i]--;
			}
		}
	}

	public static void main(String args[]) {
		int nums[] = { 5, 3, 2, 4, 1 };
		// bubbleSort(nums);
		// selectionSort(nums);
		// insertionSort(nums);

//		for (int sortedValue : nums) {
//			System.out.print(sortedValue);
//		}

		// inbuild sort
		// import java.util.Arrays;
		// Ascending order
		// time complexcity => n(log n)
//		Arrays.sort(nums);
//		
//		Arrays.sort(nums, 0, 3); // 3 is non inclusive mean value at index 3 is not going to be include for sort
//	

		// decending order
		// Arrays.sort(nums, Collections.reverseOrder()); // return the arrays in
		// decending order work on premitive object
		// only like Integer

		countingSort(nums);
		for (int sortedValue : nums) {
			System.out.print(sortedValue);
		}

	}
}
