import java.util.Scanner;

public class Training131_1_1 {

	public static void main(String[] args) {
		System.out.println("<点数集計>");
		Scanner scanner = new Scanner(System.in);

		int[] scores = new int[3];

		for (int i = 0; i < scores.length; i++) {
			System.out.print("点数　" + (i + 1) + "　入力　>　");
			scores[i] = scanner.nextInt();
		}

		double total = 0;
		for (int score : scores) {
			total += score;
		}
		System.out.println("点数会計 : " + total);

		double average = total / scores.length;
		System.out.println("平成点 : " + average);

		scanner.close();

	}

}
