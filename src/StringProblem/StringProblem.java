package StringProblem;

public class StringProblem {

	public static float printShortestPath(String path) {

		int x = 0, y = 0;

		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == 'S') {
				y--;
			} else if (path.charAt(i) == 'N') {
				y++;
			} else if (path.charAt(i) == 'W') {
				x--;
			} else {
				x++;
			}
		}
		int x2 = x * x;
		int y2 = y * y;

		return (float) Math.sqrt(x2 + y2);
	}

	public static String printSubString(String str, int si, int ei) {
		String subString = "";
		for (int i = si; i < ei; i++) {
			subString += str.charAt(i);
		}
		return subString;
	}

	public static String compareLargest(String fruit[]) {
		String largest = fruit[0];
		for (int i = 0; i < fruit.length; i++) {
			if (largest.compareTo(fruit[i]) < 0) {
				largest = fruit[i];
			}
		}
		return largest;
	}

	public static void main(String args[]) {
		String path = "WNEENESENNN";
		System.out.println(printShortestPath(path));

		String subString = "HelloWorld";
		System.out.println(subString.substring(0, 6));
		// System.out.println(printSubString(subString, 0, 5));
		String fruit[] = { "apple", "mango", "banana" };
		System.out.println(compareLargest(fruit));
	}
}
