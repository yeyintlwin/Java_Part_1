import java.util.Scanner;

public class Practice142 {

	public static void main(String[] args) {

		System.out.println("<パスワード登録> ");
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("整数4桁以上8桁以下 > ");
			int password = scanner.nextInt();

			if (password >= 1000 && password <= 99999999) {
				System.out.println("パスワードを登録しました。");
			} else {
				System.out.println("もう一度やり直してください。");
			}
			scanner.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("入力値は誤りです。");
		}

	}

}
