import java.util.Scanner;

public class Training131_1 {

	public static void main(String[] args) {
		System.out.println("<点数集計>");
		Scanner scanner = new Scanner(System.in);

		int[] scores = new int[3];

		System.out.print("点数　" + 0 + "　入力　>　");
		scores[0] = scanner.nextInt();

		System.out.print("点数　" + 1 + "　入力　>　");
		scores[1] = scanner.nextInt();

		System.out.print("点数　" + 2 + "　入力　>　");
		scores[2] = scanner.nextInt();

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
