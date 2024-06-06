import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice141 {

	public static void main(String[] args) {

		System.out.print("入力（１～１０）　> ");

		try {
			Scanner scanner = new Scanner(System.in);
			int value = (int) scanner.nextInt();
			
//			if (value >= 1 && value <= 10) {
//				System.out.println("入力値範囲内です。");
//			} else {
//				System.out.println("入力値範囲外です。");
//			}

			System.out.println(value >= 1 && value <= 10 ? "入力値範囲内です。" : "入力値範囲外です。");
			
			scanner.close();
		} catch (InputMismatchException e) {
			System.out.println("入力値は不正です。");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
