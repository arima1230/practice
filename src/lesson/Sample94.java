package lesson;

public class Sample94 {

	public static void main(String[] args) {
		int sum = 0;
		
		try {
			
			for(int i = 0; i <= 3; i++) {
				System.out.println("args[" + i + "]=" + args[i]);
				sum += Integer.parseInt(args[i]);
				//sum = sum + Integer.parseInt(args[i]);
			}
			System.out.println("sum=" + sum);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("引数は四つ以上入力してください");
		} catch(Exception e) {
			System.out.println("数字を入力してください");
		}/*finally {
			System.out.println("sum=" + sum);
		}*/

	}

}
