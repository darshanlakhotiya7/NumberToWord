package problem3;

/*
 * To convert number to Word(only 4 letter)
 * ex 1. 9999
 * output : Nine Thousand Nine hundred Ninety Nine
 * ex 2. 8880
 * Output : Eight Thousand Eight Hundred Eighty
 * ex 3. 8008
 * Output : Eight Thousand Eight
 * ex 3. 0008
 * Output : Eight
 * ex 3. 234
 * Output : Two Hundred Thirty Four
 */
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int given_no;
		try {
			System.out.println("Enter the Number : ");
			given_no = sc.nextInt();
			NumberToWord nw = new NumberToWord(given_no);
			nw.convertToWord();
		} catch (Exception e) {
			System.out
					.println("Warning...Only Numeric & Number should be greater than zero...");
		} finally {
			sc.close();
		}
	}
}
