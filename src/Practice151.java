import java.util.Scanner;

public class Practice151 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("整数　> ");

		int num = scanner.nextInt();

		int result = 0;

		int i = 0;
		while (i <= num) {
			result += i;
			i++;
		}

		System.out.print("１から" + num + "までの会計：" + result);
		scanner.close();

	}

}
