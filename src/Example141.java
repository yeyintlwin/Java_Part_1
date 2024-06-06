import java.util.Scanner;

public class Example141 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);

			System.out.print("パスワード（整数４桁）　> ");

			int password = scanner.nextInt();

			if (password == 7777) {
				System.out.println("認証　OK");
			}else {
				System.out.println("認証　NG");
			}

			scanner.close();

		} catch (Exception e) {

		}
	}

}
