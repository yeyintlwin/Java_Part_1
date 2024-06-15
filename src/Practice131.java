import java.util.Scanner;

public class Practice131 {

	public static void main(String[] args) {

		try {
			final int[] ticketsList = { 1800, 1200, 600 };
			System.out.print("0 : 大人, 1 : 高校生 , 2 : 中学生 > ");
			Scanner scanner = new Scanner(System.in);
			int indexNum = scanner.nextInt();
			System.out.println("料金 ： " + ticketsList[indexNum] + "円");
			scanner.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
			// e.printStackTrace();
			//System.err.println(e.toString());
		}

	}

}
