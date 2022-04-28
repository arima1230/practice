package chap76;

public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal hanako = new Animal();
		//hanako = display(2);
		if(hanako.display(2) == true) {
			System.out.println("羽はありますが、飛べるとは限りません");
		}else {
			System.out.println("羽はありません");
		}
	}

}
