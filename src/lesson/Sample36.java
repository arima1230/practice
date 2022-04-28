package lesson;
public class Sample36 {
	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "12.34";
		
		int num1 = Integer.parseInt(str1);
		double num2 = Double.parseDouble(str2);
		
		System.out.println("キャスト:" + num1);
		System.out.println("キャスト:" + num2);
		System.out.println(str1 + str2);
		System.out.println(num1+num2);
		
	}

}
