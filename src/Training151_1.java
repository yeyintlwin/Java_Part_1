import java.util.Scanner;

public class Training151_1 {

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);

			System.out.print("星の数を入力　>　");

			int numOfStars = scanner.nextInt();

			int i = 0;
			while (i < numOfStars) {
				i++;
				System.out.print("★");
			}

			scanner.close();

		} catch (Exception e) {
			System.out.println("入力値は不正です。");
		}
	}

}
