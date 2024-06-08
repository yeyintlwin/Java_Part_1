import java.util.Scanner;

public class Training151_3 {

	public static void main(String[] args) {

		try {
			System.out.print("星の数を入力　〉　");
			Scanner scanner = new Scanner(System.in);
			final int numOfStars = scanner.nextInt();
			for (int i = 0; i < numOfStars; i++) {
				System.out.print("★");
			}
			scanner.close();
		} catch (Exception e) {
			System.out.println("入力値は不正です。");
		}

	}

}
