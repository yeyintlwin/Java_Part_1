import java.util.InputMismatchException;
import java.util.Scanner;

public class Training122_2 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("＜割り算＞");

			System.out.print("割られる数　> ");
			int dividend = sc.nextInt();

			System.out.print("割る数　> ");
			int divisor = sc.nextInt();

			//			if (divisor == 0) {
			//				//System.out.println("Dividend should not be 0.");
			//				throw new Exception("You cant divide by Zero.");
			//				//	return;
			//			}

			System.out.println("割り算の答え : " + (dividend / divisor));

			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Allow only the value from 0 to 9.");
		} catch (ArithmeticException e) {
			System.out.println("You cant divided by 0.");
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("エラーが発生しました！");
		}
	}
}
