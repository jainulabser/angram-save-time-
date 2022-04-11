import java.util.Scanner;

public class Anagrams {
	private String first;
	private String second;

	private void isAnagram() {
		Scanner sc = new Scanner(System.in);
		int fcount = 0, scount = 0,char1,char2;
		System.out.println("Enter two String");
		first = sc.next();
		second = sc.next();
		sc.close();

		if (first.length() != second.length())
		{
			System.out.println("No");return;
		}
		else {
			for (int i = 0; i < first.length(); i++) {
				char1=first.charAt(i);
				char2=second.charAt(i);
				if (char1 >= 'A' && char1 <= 'Z') {
					char1=char1-'A'+'a';
				} if (char2 >= 'A' && char2 <= 'Z') {
					char2=char2-'A'+'a';
				}
				fcount += char1;
				scount += char2;
			}
		}
		System.out.println((fcount == scount) ? "Yes" : "No");

	}

	public static void main(String[] args) {
		Anagrams anagram = new Anagrams();
		anagram.isAnagram();

	}

}