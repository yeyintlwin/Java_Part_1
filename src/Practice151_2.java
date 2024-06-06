import java.util.Scanner;

public class Practice151_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("カワント数　> ");

		int num = scanner.nextInt();

		int i = 1;

		while (i <= num) {
			System.out.println("カワント：" + i);
			i++;

			if (i == 10000)
				break;
		}

		scanner.close();

	}

}
