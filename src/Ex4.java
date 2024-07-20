import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		while (true) {

			try {
				System.out.print("好きな整数を入力: ");
				var scanner = new Scanner(System.in);

				int value = scanner.nextInt();

				System.out.println(value % 2 == 0 ? value + "は偶数" : value + "は奇数");

				scanner.close();

				break;
			} catch (Exception e) {
				System.out.println("整数を入力して");
			}
		}

	}

}
