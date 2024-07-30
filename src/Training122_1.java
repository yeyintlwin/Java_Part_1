import java.util.Scanner;

public class Training122_1 {

	public static final int jpCurrencyDenominations[] = { 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

	public static void main(String[] args) {
		try {
			System.out.print("金額を入力してください　> ");
			Scanner sc = new Scanner(System.in);
			int amount = sc.nextInt();

			for (int i = 0; i < jpCurrencyDenominations.length; i++) {
				int numberOfCurrencyDenominations = amount / jpCurrencyDenominations[i]; // quotient
				System.out.println(jpCurrencyDenominations[i] + "円紙幣 ： " + numberOfCurrencyDenominations + "枚");
				amount = amount % jpCurrencyDenominations[i]; // money <- remainder
			}
			sc.close();
		} catch (Exception e) {
			// System.out.println("エラーが発生しました！");
			e.printStackTrace();
		}
	}
}
