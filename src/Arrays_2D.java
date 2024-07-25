package Arrays;

import java.util.*;

public class Arrays_2D {

//	lecture 6 spiral matrix
	public static void spiralMatrix(int nums[][]) {

		int startRow = 0;
		int startCol = 0;
		int endRow = nums.length - 1;
		int endCol = nums[0].length - 1;

		while (startRow <= endRow && startCol <= endCol) {

			// top
			for (int j = startCol; j <= endCol; j++) {
				System.out.print(nums[startRow][j]);
			}

			// right
			for (int i = startRow + 1; i <= endRow; i++) {
				System.out.print(nums[i][endCol]);
			}

			// bottom
			for (int j = endCol - 1; j >= startCol; j--) {
				if (startRow == endRow) {
					break;
				}
				System.out.print(nums[endRow][j]);
			}

			// left
			for (int i = endRow - 1; i >= startRow + 1; i--) {
				if (startCol == endCol) {
					break;
				}
				System.out.print(nums[i][startCol]);
			}

			startCol++;
			startRow++;
			endCol--;
			endRow--;

		}
	}

	// demo for spiralmatrix
	public static void printDemoSpiral(int matrix[][]) {
		int colStart = 0;
		int rowStart = 0;
		int colEnd = matrix[0].length - 1;
		int rowEnd = matrix.length - 1;

		while (colStart <= colEnd && rowStart <= rowEnd) {

			// top
			for (int i = colStart; i <= colEnd; i++) {
				System.out.print(matrix[rowStart][i]);
			}

			// right
			for (int j = rowStart + 1; j <= rowEnd; j++) {
				System.out.print(matrix[j][colEnd]);
			}

			// bottom
			for (int i = colEnd - 1; i >= colStart; i--) {
				if (rowStart == rowEnd) {
					break;
				}
				System.out.print(matrix[rowEnd][i]);
			}

			// left
			for (int j = rowEnd - 1; j >= rowStart + 1; j--) {
				if (colStart == colEnd) {
					break;
				}
				System.out.print(matrix[j][colStart]);
			}
			colStart++;
			colEnd--;
			rowStart++;
			rowEnd--;

		}
	}

	// print diagonal sum
	// there are two method to solve this problem i have taken most optimize
	// aproached
	public static int printDiagonalSum(int matrix[][]) {

		int sum = 0;
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[0].length; j++) {
//
//				if (i == j) {
//					sum += matrix[i][j];
//				} else if (i + j == matrix.length - 1) {
//					sum += matrix[i][j];
//				}
//			}
//		}

		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
			if (i != matrix.length - 1 - i) {
				sum += matrix[i][matrix.length - 1 - i];
			}

		}
		return sum;
	}

//	lecture 4 
	public static boolean findKey(int matrix[][], int key) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == key) {
					System.out.println("Key founded at cells : (" + i + "," + j);
					return true;
				}
			}
		}

		System.out.println(" Key is not founded ");
		return false;
	}

	public static void main(String args[]) {

		int matrix[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		// output
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// findKey(matrix, 5);

//		spiralMatrix(matrix);
//		printDemoSpiral(matrix);

		System.out.println("Diagonal sum : " + printDiagonalSum(matrix));

	}
}
