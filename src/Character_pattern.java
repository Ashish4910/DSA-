package Com.Pattern.DSA;

public class Character_pattern {
	public static void main(String[] args) {
		int n = 5;
		char ch = 'A';
		for (char i = 0; i < n; i++) {
			for (char j = 0; j < i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println("");
		}
	}
}

//A
//BC
//DEF
//GHIJ
