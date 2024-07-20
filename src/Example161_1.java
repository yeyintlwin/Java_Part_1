import java.util.Scanner;

public class Example161_1 {

	public static void main(String[] args) {

		System.out.println("BIM Calculation");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your weight in (kg): ");

		double weight = scanner.nextDouble();

		System.out.print("Enter your height in (cm): ");

		double height = scanner.nextDouble();

		height = height * 0.01; // Convert into meter

		double bmi = bmi(weight, height);

		System.out.println("Your BMI value is : " + bmi);

		System.out.println("Your BMI status is : " + bmiStatus(bmi));

	}

	public static double bmi(double weight, double height) {

		return weight / Math.pow(height, 2);
	}

	public static String bmiStatus(double bmi) {

		String status = "";
		if (bmi <= 18.4) {
			status = "Under weight";
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			status = "Normal";
		} else if (bmi >= 25.0 && bmi <= 39.9) {
			status = "Over Weight";
		} else if (bmi >= 40) {
			status = "Obese";
		}
		return status;
	}

}
