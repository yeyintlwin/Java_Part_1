import java.util.Scanner;

public class Training131_1_3_1 {

	public static void main(String[] args) {

		System.out.println("<点数集計>");
		Scanner scanner = new Scanner(System.in);

		// WARN! : In Java, Can't declare an Array without limit the length of array. 
		// Declared in dynamically.
		int[] scores = new int[99999];
		int actualArrayLength = 0;

		// START : Listen the user`s inputs and add to array.  
		for (int i = 0; i < scores.length; i++) {
			System.out.print("点数　" + (i + 1) + "　入力　>　");
			int score = scanner.nextInt();

			// When user enter "-1", calculate the total and average of scores.
			if (score == -1)
				break;

			scores[i] = score;
			actualArrayLength++;
		}
		// END : Listen the user`s inputs and add to array. 

		// START: Calculate the total of scores.
		double total = 0;
		for (int i = 0; i < actualArrayLength; i++) {
			total += scores[i];
		}
		System.out.println("点数会計 : " + total);
		// END: Calculate the total of scores.

		// START: Calculate the average of scores.
		double average = total / actualArrayLength;
		System.out.println("平成点 : " + average);
		// END: Calculate the average of scores.

		scanner.close();

	}

}
