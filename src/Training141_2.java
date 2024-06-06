import java.util.Scanner;

public class Training141_2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("パスワード");
			Scanner scanner = new Scanner(System.in);
			System.out.print("入力　> ");
			String password = scanner.next().toString();
			if (password.equals("p@ssW0rd")) {
				System.out.println("ログインしました。");
			} else {
				System.out.println("パスワードが違います。");
			}
			scanner.close();
			
		} catch (Exception e) {
			System.err.print("エラーが発生しました。");
		}
	}

}
