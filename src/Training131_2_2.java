
import java.util.Scanner;

public class Training131_2_2 {

	public static void main(String[] args) {

		try {
			System.out.println("<丼人気投票>");
			System.out.println("1 : 海鮮丼, 2 : カツ丼, 3 : 牛丼");

			Scanner scanner = new Scanner(System.in);

			String[] donburi = new String[] { "海鮮丼", "カツ丼", "牛丼" };
			int[] votes = new int[donburi.length];

			System.out.print(" 何人投票しますか？　> ");
			int numOfPersons = scanner.nextInt();

			for (int i = 1; i <= numOfPersons; i++) {
				System.out.print("番号で投票 " + i + " > ");
				int vote = scanner.nextInt();

				votes[vote - 1] += 1;

			}

			for (int i = 0; i < donburi.length; i++) {

				System.out.println(donburi[i] + " : " + votes[i] + "票");
			}

			scanner.close();

		} catch (Exception e) {
			System.out.println("エラーが発生しました。");
		}

	}

}
