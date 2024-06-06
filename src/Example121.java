
class Example121 {

	public static void main(String[] args) {

		int data = 2000;
		// ここで消費税 (Tax) を計算(calc)する
		double price = data * 1.1;

		System.out.print(data + "円の税込みpriceは");
		System.out.println(price + "円です。");

		// operators presidence
		// float out = 1 + 3 - 3 * 5 / 8;

		data = 2000;
		System.out.println(data);
		data += 500; //2500
		System.out.println(data);
		data -= 300; //2200
		System.out.println(data);
		data *= 2; //4400
		System.out.println(data);
		data++;//4401
		System.out.println(data);
		data--;
		System.out.println(data);

	}

}
