
public class Practice0720 {

	public static final String MY_NAME = "イェ";

	public static void main(String[] args) {
		// 練習1
		printHello();

		// 練習2
		printMessage("おはいよー");

		// 練習3
		printMessage("Count", 5);

		// 練習4
		String message = getMessage();
		printMessage(message);

		// 練習5
		String randomMessage = getRandomMessage(MY_NAME);
		printMessage(randomMessage);

		// 練習6
		double minValue = getMinValue(3.0, 7.5);
		printMessage("The smallest value between the two attributes is : " + minValue);

		// 練習7
		final int[] intArray = { 100, 5, 14, 18, 200 };
		int minValueOfArray = getMinValue(intArray);
		printMessage("The smallest value in an array is : " + minValueOfArray);

		// 問題1
		printRandomMessage();

		// 問題2
		printRectangleArea(7, 4);

		// 問題3
		printMaxValue(9, 15, 4);

		// 問題4
		String weatherForecast = getWeatherForecast();
		printMessage(weatherForecast);

		// 問題5
		printRandomMessage(MY_NAME);

		// 問題6
		final double doubleValue = -3.6;
		double absoluteValue = getAbsoluteValue(doubleValue);
		printMessage(doubleValue + " の絶対値は " + absoluteValue);

		// 問題7
		final int value = 7;
		printMessage(value + " is even number : " + isEvenNumber(value));

		// 問題8
		final boolean isKid = true;
		printMessage(getMessage(MY_NAME, isKid));

		// 問題9
		final double[] doubleArray = { 100.1, 5.4, 14.0, 18.17, 200.01 };
		double average = getAverage(doubleArray);
		printMessage("The average value of the numbers in an array is : " + average);

		// 問題10
		final String[] stringsArray = { "abc", "efgh", "ijklm", "nopqr" };
		String longeString = getLongestString(stringsArray);
		printMessage("The last longest String in an array is : " + longeString);
	}

	// 練習１
	static void printHello() {
		System.out.println("Hello, Methods in Java!");
	}

	// 練習２
	static void printMessage(String message) {
		System.out.println(message);
	}

	// 練習3
	static void printMessage(String message, int count) {
		for (int i = 0; i < count; i++)
			System.out.println(message);
	}

	// 練習4
	static String getMessage() {
		return "Hello, World!";
	}

	// 練習5
	static String getRandomMessage(String name) {
		final String[] messages = { "こんばんは", "こんにちは", "おはよう" };
		int randomValue = (int) (Math.random() * messages.length);
		return messages[randomValue] + name + "さん";
	}

	// 練習6
	static double getMinValue(double a, double b) {
		return a < b ? a : b;
	}

	// 練習7
	static int getMinValue(int[] array) {
		int min = array[0];
		for (int n : array)
			min = n < min ? n : min;
		return min;
	}

	// 問題1
	static void printRandomMessage() {
		final String[] messages = { "こんばんは", "こんにちは", "おはよう" };
		int randomValue = (int) (Math.random() * messages.length);
		System.out.println(messages[randomValue]);
	}

	// 問題2
	static void printRectangleArea(double width, double height) {
		double areaOfRectangle = width * height;
		System.out.println("The area of a rectangle (w:" + width + ", h:" + height + ") is : " + areaOfRectangle);
	}

	// 問題3
	static void printMaxValue(double... abc) {
		double max = abc[0];
		for (double n : abc)
			max = max > n ? max : n;
		System.out.println("The largest value in parameters is : " + max);
	}

	// 問題4
	static String getWeatherForecast() {

		final String[] daysForecast = { "今日", "明日", "明後日" };
		final String[] weatherConditions = { "晴れ", "曇り", "雨", "雪" };

		int r1 = (int) (Math.random() * daysForecast.length);
		int r2 = (int) (Math.random() * weatherConditions.length);

		return daysForecast[r1] + "の天気は" + weatherConditions[r2] + "でしょう。";
	}

	// 問題5
	static void printRandomMessage(String name) {
		final String[] messages = { "こんばんは", "こんにちは", "おはよう" };
		int randomValue = (int) (Math.random() * messages.length);
		System.out.println(messages[randomValue] + name + "さん");
	}

	// 問題6
	static double getAbsoluteValue(double value) {
		return value <= 0.0D ? 0.0D - value : value;
	}

	// 問題7
	static boolean isEvenNumber(int value) {
		return value % 2 == 0;
	}

	// 問題8
	static String getMessage(String name, boolean isKid) {
		return "こんにちは。" + name + (isKid ? "ちゃん。" : "さん。");
	}

	// 問題9
	static double getAverage(double[] array) {
		double total = 0;
		for (double value : array)
			total += value;
		return total / array.length;
	}

	// 問題10
	static String getLongestString(String[] stringArray) {
		// The last longest string in an array.
		String longestString = stringArray[0];
		for (String str : stringArray)
			longestString = str.length() >= longestString.length() ? str : longestString;
		return longestString;
	}
}
