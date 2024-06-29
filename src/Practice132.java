import java.util.Scanner;

public class Practice132 {

	public static void main(String[] args) {

		try {
			final int[][] price = {
					{ 6500, 7000, 8000 },
					{ 7500, 8500, 9500 },
					{ 10000, 11500, 14000 }
			};

			/*
					int[][] price = new int[3][3];
			
					price[0][0] = 6500;
					price[0][1] = 7000;
					price[0][2] = 8000;
			
					price[1][0] = 7500;
					price[1][1] = 8500;
					price[1][2] = 9500;
			
					price[2][0] = 10000;
					price[2][1] = 11500;
					price[2][2] = 14000;
			*/
			Scanner scanner = new Scanner(System.in);

			System.out.println("<レンタカー料金>");
			System.out.print("0 : コンパクト、 1 : スタンダード、 2 : プレミアム > ");
			int num = scanner.nextInt();

			System.out.print("0 : 6 時間, 1 : 12 時間, 2 : 24 時間 > ");
			int hour = scanner.nextInt();

			System.out.println("料金 : " + price[num][hour] + "円");

			scanner.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました。");
		}

	}

}
