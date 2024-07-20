import java.util.Scanner;

public class Example161 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("金額 > ");
		int num = scanner.nextInt();

		double result = tax(num);

		System.out.println("税込金額(10%)　：　" + result + "円");

		double result8 = tax8(num);

		System.out.println("税込金額(8%)　：　" + result8 + "円");
		
		
		scanner.close();

	}

	static double tax(int data) {
		double answer = data * 1.1;
		return answer;
	}

	static double tax8(int data) {
		double answer = data * 1.08;
		return answer;
	}

}
