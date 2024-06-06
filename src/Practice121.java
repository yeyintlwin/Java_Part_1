public class Practice121 {

	public static void main(String[] args) {

		int price = 1800;
		int total = 0;
		int count = 0;

		count++;
		total = price * count;
		System.out.println(count + "人分料金：" + total + "円");
		
		count++;
		total = price * count;
		System.out.println(count + "人分料金：" + total + "円");

		count++;
		total = price * count;
		System.out.println(count + "人分料金：" + total + "円");

	}

}
