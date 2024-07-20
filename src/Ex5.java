import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter user id : ");
		String userId = scanner.next().toString();

		System.out.print("Enter password : ");
		String password = scanner.next().toString();

		if (userId.equals("java") && password.equals("1234")) {
			System.out.println("ログイン成功");
		} else {
			System.out.println("ログイン失敗");
		}
		scanner.close();
	}

}
