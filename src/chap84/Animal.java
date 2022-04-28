package chap84;

public class Animal {
	private int leg;
	
	public Animal() {
		System.out.println("動物園に新しい動物がやってきました。");
	}
	
	public Animal(int leg) {
		this();
		System.out.println("足の数が" + leg +  "本の動物です");
	}
	
	public boolean display(int leg) {
		this.leg =leg;
		if(this.leg == 2) {
			System.out.println("それは鳥です。");
			return true;
		}else {
			System.out.println("それは4本足の動物です。");
			return false;
		}
	}

}
