import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Training131_1_3 {
	static public void main(String... args) {
		System.out.println("<点数集計>");

		List<Integer> scoresList = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("点数　" + (scoresList.size() + 1) + "　入力　>　");
			int score = scanner.nextInt();
			if (score == -1)
				break;
			scoresList.add(score);
		}

		double total = 0;
		for (int score : scoresList) {
			total += score;
		}

		System.out.println("点数会計 : " + total);

		double average = total / scoresList.size();
		System.out.println("平成点 : " + average);

		scanner.close();

	}
}
