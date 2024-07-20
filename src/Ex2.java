public class Ex2 {

	public static void main(String[] args) {

		int[] myArray = { 10, 20, 30, 40, 50 };

		System.out.println(myArray[3]);
		
		int i = 0;
		for (;;) {
			if (myArray.length == i)
				break;
			System.out.print(myArray[i]);
			i++;
		}

		int j = 0;
		while (true) {
			if (myArray.length == j)
				break;
			System.out.print(myArray[j]);
			j++;
		}
	}

}
