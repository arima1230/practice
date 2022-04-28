package chap84;

public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal taro = new Animal(2);
		if(taro.display(2) == true) {
			System.out.println("羽はありますが、飛べるとは限りません");
		}else {
			System.out.println("羽はありません");
		}
		//二匹目は鳥です
		Bird hanako = new Bird(2, true);
		
		if(hanako.display(2) == true) {
			System.out.println("春になると帰ってしまいます");
		}else {
			//System.out.println("羽はありません");
			hanako.display(false);
		}
		}
	}


