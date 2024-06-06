import java.util.Scanner;

public class Training142_2 {

	public static void main(String[] args) {
		System.out.println("季節表示");

		Scanner scanner = new Scanner(System.in);
		System.out.print("誕生月を入力してください　> ");

		int month = scanner.nextInt();

		if (month >= 3 && month <= 5) {
			System.out.println(month + "月は春です。");
		} else if (month >= 6 && month <= 8) {
			System.out.println(month + "月は夏です。");
		} else if (month >= 9 && month <= 11) {
			System.out.println(month + "月は秋です。");
		} else if (month == 12 || month == 1 || month == 2 ) {
			System.out.println(month + "月は冬です。");
		}

		scanner.close();
	}

}
