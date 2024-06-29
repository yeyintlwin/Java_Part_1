
public class Example132 {

	public static void main(String[] args) {
		String[][] user = new String[3][2];

	+	user[0][0] = "P0111";
		user[0][1] = "鈴木晶子";
		
		user[1][0] = "G1010";
		user[1][1] = "高橋大介";

		user[2][0] = "A0010";
		user[2][1] = "大倉有貴";

		System.out.print("ID : " + user[0][0] + ", ");
		System.out.println("氏名 : " + user[0][1]);

		System.out.print("ID : " + user[１][0] + ", ");
		System.out.println("氏名 : " + user[１][1]);

		System.out.print("ID : " + user[2][0] + ", ");
		System.out.println("氏名 : " + user[2][1]);
	}

}
