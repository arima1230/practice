package lesson;

public class Sample93 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		for(int i = 0; i <= 3; i++) {
			System.out.println("args[" + i +"]=" + args[i]);
			//sum += Integer.parseInt(args[i]);
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("sum=" + sum);
	}

}
