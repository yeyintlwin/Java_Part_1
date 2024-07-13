import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(matrix[1][2]);
		System.out.println(matrix[2][0]);

		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

		for (int[] arr : matrix) {
			for (int num : arr) {
				System.out.print(num);
			}
		}
		System.out.println();

		int total = 0;
		for (int[] arr : matrix) {
			for (int num : arr) {
				total += num;
			}
		}
		System.out.println(total);
	}
}