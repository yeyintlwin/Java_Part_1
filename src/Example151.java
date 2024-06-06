import java.util.Scanner;

public class Example151 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("カワント数　> ");

		int num = scanner.nextInt();

		int i = 0;

		while (i < num) {
			System.out.println("カワント：" + i);
			i++;
		}

		scanner.close();

	}

}
