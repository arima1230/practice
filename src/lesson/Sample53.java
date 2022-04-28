package lesson;

public class Sample53 {
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);//
		if (age < 6) {
			System.out.println("あなたは幼児ですね");
		} else if (age < 20){
			System.out.println("あなたは未成年ですね");
		} else {
			System.out.println("あなたは成人ですね");
		}
			}


	}


