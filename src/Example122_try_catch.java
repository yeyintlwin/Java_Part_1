import java.util.Scanner;

public class Example122_try_catch {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("チケット枚数を入力してください > ");
			int count = sc.nextInt();
			int money = 600 * count;
			System.out.println("大人" + count + "枚の料金：" + money + "円");
			sc.close();
		} catch (Exception e) {
			System.out.println("例外発生");
		}
		System.out.println("終了");

	}

}
