package lesson;

public class Sample35 {
	public static void main(String[] args) {
		char chr = 'あ';
		int num1 = 111;
		double num2 = 111.11;
				
		String str1 = String.valueOf(chr);
		String str2 = String.valueOf(num1);
		String str3 = String.valueOf(num2);
		
		System.out.println("キャスト後：" + str1);
		System.out.println("キャスト後：" + str2);
		System.out.println("キャスト後：" + str3);
	}
}
