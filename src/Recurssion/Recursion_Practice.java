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

	public static void ankita() {
		System.out.println(" Hello ankita ");
	}

	public static void printDec(int n) {

		if (n == 1) {
			System.out.print(n);
			return;
		}
		System.out.print(n + " ");
		printDec(n - 1);
	}

	public static void printIncreasing(int n) {
		if (n == 1) {
			System.out.print(n + " ");
			return;
		}
		printIncreasing(n - 1);

		System.out.print(n + " ");

	}

	public static int printFactorial(int n) {

		if (n == 1) {
			return 1;
		}

		int fnm1 = printFactorial(n - 1);
		int fn = n * fnm1;

		return fn;
	}

	public static int sumNaturalNumber(int n) {

		if (n == 1) {
			return 1;

		}
		int fnm1 = sumNaturalNumber(n - 1);
		int fn = n + fnm1;

		return fn;
	}

	public static double printFibonacci(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		double fnm1 = printFibonacci(n - 1);
		double fnm2 = printFibonacci(n - 2);

		double fn = fnm1 + fnm2;
		return fn;
	}

	public static boolean isSorted(int arr[], int i) {

		if (i == arr.length - 1)
			return true;

		if (arr[i] > arr[i + 1])
			return false;

		return isSorted(arr, i + 1);

	}

	public static int firstOccurance(int arr[], int number, int i) {

		if (arr.length - 1 == i) {
			return -1;
		}

		if (arr[i] == number) {
			return i;
		}

		return firstOccurance(arr, number, i + 1);

	}

	public static int lastOccurence1(int arr[], int num, int i) {

		if (arr.length == i) {
			return -1;
		}

		int found = lastOccurence1(arr, num, i + 1);

		if (found == -1 && arr[i] == num) {

			return i;
		}

		return found;
	}

	public static int printPower(int x, int n, int i) {

		if (n == 1 || (n - i) == 1) {
			return x;
		}
		int lastValue = printPower(x, n, i + 1);

		int value = lastValue * x;

		return value;
	}

	public static void main(String args[]) {

		// System.out.println(power(2, 10));
//		printDec(10);
//		printIncreasing(5);
//		System.out.println(printFactorial(5));

//		System.out.println(sumNaturalNumber(5));
//		System.out.println(printFibonacci(25));

//		int arr[]= {1,2,7,4,5};
//		System.out.println(isSorted(arr,0));
//		int arr[] = { 1, 2, 7, 4, 5 };
//		System.out.println(firstOccurance(arr, 7, 0));
//		int arr[] = { 1, 2, 7, 4, 5, 7 };
//		System.out.println(lastOccurence1(arr, 7, 0));
		
		System.out.println(printPower(2, 10, 0));
	}
}
