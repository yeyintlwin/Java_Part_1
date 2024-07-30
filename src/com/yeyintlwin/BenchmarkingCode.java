package com.yeyintlwin;

public class BenchmarkingCode {

	public final int SIZE_OF_ARRAY = 1000000000;
	public int[] numbersList = new int[SIZE_OF_ARRAY];

	public BenchmarkingCode() {
		init();
	}

	private void init() {
		// Insert the random values into an array.
		for (int i = 0; i < SIZE_OF_ARRAY; i++) {
			int randomValue = (int) (Math.random() * SIZE_OF_ARRAY * 2);
			numbersList[i] = randomValue;
		}

		// Testing performance of methods

		// For second method.
		long startTime1 = System.currentTimeMillis();
		secondMethod();
		long endTime1 = System.currentTimeMillis();

		System.out.println("time1 : " + (endTime1 - startTime1));

		// For second method.
		long startTime2 = System.currentTimeMillis();
		firstMethod();
		long endTime2 = System.currentTimeMillis();

		System.out.println("time2 : " + (endTime2 - startTime2));

	}

	public static void main(String... args) {
		new BenchmarkingCode();

	}

	private void firstMethod() {

		int max = numbersList[0];
		for (int i = 0; i < numbersList.length; i++) {
			if (max < numbersList[i]) {
				max = numbersList[i];
			}
		}

		System.out.println("max : " + max);
	}

	private void secondMethod() {
		int max = numbersList[0];
		for (int i = 0; i < numbersList.length; i++) {
			int num = numbersList[i];
			if (max < num) {
				max = num;
			}
		}
		System.out.println("max : " + max);
	}
}
