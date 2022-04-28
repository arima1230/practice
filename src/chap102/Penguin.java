package chap102;

public class Penguin implements Animal, Fish {
	public void fly() {
		System.out.println("飛べません");
	}
	
	public void sing() {
		System.out.println("ピーピー泣きます");
	}
	public void speak() {
		System.out.println("話しません");
	}
	public void move() {
		System.out.println("走り回っています");
	}
	public void swim() {
		System.out.println("泳げます");
	}
}
