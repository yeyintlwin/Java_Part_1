import java.util.Scanner;

public class Training122_1 {

	public static final int jpCurrency[] = { 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

	public static void main(String[] args) {
		try {
			System.out.print("金額を入力してください　> ");
			Scanner sc = new Scanner(System.in);
			int money = sc.nextInt();

			for (int i = 0; i <= jpCurrency.length; i++) {
				int rem = money / jpCurrency[i];
				System.out.println(jpCurrency[i] + "円紙幣 ： " + rem + "枚");
				money = money % jpCurrency[i];
			}
			sc.close();
		} catch (Exception e) {
			// System.out.println("エラーが発生しました！");
			e.printStackTrace();
		}
	}
}
