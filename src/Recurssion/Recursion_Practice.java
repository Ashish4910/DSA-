package Recurssion;

public class Recursion_Practice {
	// da and type
	// d n t
	// f and u

	public static int lastOccurence(int arr[], int k, int i) {

		if (i == arr.length) {
			return -1;

		}

		int foundAt = lastOccurence(arr, k, i + 1);

		if (foundAt == -1 && arr[i] == k) {
			return i;
		}
		return foundAt;

	}

	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}

//		int xmn = power(x , n-1);
//		
//		int xn = x *xmn;
//		return xn;

		return x * (power(x, n - 1));

	}

	public static void main(String args[]) {

		System.out.println(power(2, 10));
	}
}
