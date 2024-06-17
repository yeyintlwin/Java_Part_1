import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Training131_1_3 {
	static public void main(String... args) {
		System.out.println("<点数集計>");

		List<Integer> scoresList = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);

		// START : Listen the user inputs and add into array.
		while (true) {
			System.out.print("点数　" + (scoresList.size() + 1) + "　入力　>　");
			int score = scanner.nextInt();
			// When user enter "-1", Calculate the total and average of scores.
			if (score == -1)
				break;
			scoresList.add(score);
		}
		// END : Listen the user inputs and add into array.

		// START : Calculate the total of scores.
		double total = 0;
		for (int score : scoresList) {
			total += score;
		}
		System.out.println("点数会計 : " + total);
		// END : Calculate the total of scores.

		// START : Calculate the average of scores.
		double average = total / scoresList.size();
		System.out.println("平成点 : " + average);
		// END : Calculate the average of scores.

		scanner.close();

	}
}
