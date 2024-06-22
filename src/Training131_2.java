import java.util.Scanner;

public class Training131_2 {

	public static void main(String[] args) {

		try {
			System.out.println("<丼人気投票>");
			System.out.println("1 : 海鮮丼, 2 : カツ丼, 3 : 牛丼");

			Scanner scanner = new Scanner(System.in);

			int[] votes = new int[3];
			String[] donburi = new String[] { "海鮮丼", "カツ丼", "牛丼" };

			int vote = 0;
			System.out.print("番号で投票 1 > ");
			vote = scanner.nextInt();
			votes[vote - 1] += 1;
			System.out.print("番号で投票 2 > ");
			vote = scanner.nextInt();
			votes[vote - 1] += 1;
			System.out.print("番号で投票 3 > ");
			vote = scanner.nextInt();
			votes[vote - 1] += 1;
			System.out.print("番号で投票 4 > ");
			vote = scanner.nextInt();
			votes[vote - 1] += 1;
			System.out.print("番号で投票 5 > ");
			vote = scanner.nextInt();
			votes[vote - 1] += 1;

			System.out.println(donburi[0] + " : " + votes[0] + "票");
			System.out.println(donburi[1] + " : " + votes[1] + "票");
			System.out.println(donburi[2] + " : " + votes[2] + "票");

			scanner.close();

		} catch (Exception e) {
			System.out.println("エラーが発生しました。");
		}

	}

}
