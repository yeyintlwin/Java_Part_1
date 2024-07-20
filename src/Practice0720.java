
public class Practice0720 {

	public static void main(String[] args) {
		// 練習１
		printHello();
		// 練習2
		printMessage("おはいよー");
		// 練習3
		printMessage("Count", 5);
		// 練習4
		String message = getMessage();
		printMessage(message);

	}

	// 練習１
	static void printHello() {
		System.out.println("Hello, World!");
	}

	// 練習２
	static void printMessage(String message) {

		System.out.println(message);
	}

	// 練習3
	static void printMessage(String message, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

	// 練習4
	static String getMessage() {
		return "Lorem Ispum Eim";
	}

	// 練習5
	static String getRandomMessage(String name) {

		int randomValue = (int) Math.random() * 3;
		String randomMessage = "";
		if (randomValue == 1) {
			randomMessage = "";
		} else if (randomValue == 2) {
			randomMessage = "";
		} else if (randomValue == 2) {
			randomMessage = "";
		}

		return randomMessage;
	}

}
