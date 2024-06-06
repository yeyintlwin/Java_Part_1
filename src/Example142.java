import java.util.Scanner;

public class Example142 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("誕生年（西暦4桁）　> ");
		int year = scanner.nextInt();

		if (year >= 2019) {
			System.out.println("令和生まれです。");
		} else if (year >= 1989 /*&& year<= 2018*/) {
			System.out.println("平成生まれです。");
		} else if (year >= 1927 /*&& year<= 1988*/) {
			System.out.println("昭和生まれです。");
		} else if (year >= 1913 /*&& year<= 1926*/) {
			System.out.println("大正生まれです。");
		} else if (year >= 1868 /*&& year<= 1912*/) {
			System.out.println("明治生まれです。");
		}

		scanner.close();
	}

}
