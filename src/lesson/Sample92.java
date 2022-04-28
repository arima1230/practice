package lesson;

public class Sample92 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			int x = 10/0;
			System.out.println("x=" + x);
		}catch(ArithmeticException e) {
			System.out.println("0で除算席ません。");
		}
	}

}
