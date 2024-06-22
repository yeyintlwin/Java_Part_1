
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Training131_2_3 {
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

			// START: find the max value.
			int max = votes[0];
			for (int i = 0; i < votes.length; i++) {
				if (votes[i] > max)
					max = votes[i];
			}
			// END: find the max value.

			List<String> topList = new ArrayList<String>();

			// START : find the max indexs in votes.
			for (int i = 0; i < votes.length; i++) {

				if (votes[i] == max) {
					topList.add(donburi[i]);
					//System.out.println("1番投票が多いのは" + donburi[i] + "です。");
				}

			}
			// START : find the max indexs in votes.

			// START: make output string with "to".
			String topListString = new String();
			for (int i = 0; i < topList.size() - 1; i++) {
				String top = topList.get(i);
				topListString += top + (topList.size() > 1 ? "と" : "");
			}
			if (topList.size() > 1) {
				topListString += topList.get(topList.size() - 1);
			}
			// END: make output string with "to".

			System.out.println("1番投票が多いのは" + topListString + "です。");

			scanner.close();

		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("エラーが発生しました。");
		}

	}

}
