import java.util.Scanner;

public class Training141_1 {

	public static void main(String[] args) {

		System.out.println("<偶数or奇数>");
		Scanner scanner = new Scanner(System.in);

		System.out.print("整数入力　> ");
		int value = scanner.nextInt();
		/*
				if (value % 2 == 0) {
					System.out.println("入力値は偶数");
				} else {
					System.out.println("入力値は奇数");
				}
			*/

		System.out.println(value % 2 == 0 ? "入力値は偶数" : "入力値は奇数");

		scanner.close();

	}

}
