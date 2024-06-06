import java.util.Scanner;

public class Practice122 {

	public static void main(String[] args) {

		System.out.print("金額を入力してください > ");

		try {

			Scanner sc = new Scanner(System.in);
			int money = sc.nextInt();

			int bill = money / 10000;
			int rem = money % 10000;

			System.out.println("10000円紙幣：" + bill + "枚");
			System.out.println("残り：" + rem + "円");

			sc.close();
			
			
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}

}
