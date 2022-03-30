import java.util.Scanner;

public class Anagrams {
	private String first;
	private String second;

	private void isAnagram() {
		Scanner sc = new Scanner(System.in);
		int fcount = 0, scount = 0;
		System.out.println("Enter two String");
		first = sc.nextLine();
		second = sc.nextLine();
		sc.close();
		first.toLowerCase();
		second.toLowerCase();

		if (first.length() != second.length())
			System.out.println("No");
		else {
			for (int i = 0; i < first.length(); i++) {
				fcount += first.charAt(i);
				scount += second.charAt(i);
			}
		}
		System.out.println((fcount == scount) ? "Yes" : "No");

	}

	public static void main(String[] args) {
		Anagrams anagram = new Anagrams();
		anagram.isAnagram();

	}

}