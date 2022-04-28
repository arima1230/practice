package chap84;

	public class Bird extends Animal {
		private boolean fly;
		
		public Bird(int leg, boolean fly){
			super(leg);
			if(fly == true) {
				System.out.println("空を飛べる鳥です");
			}else {
				System.out.println("空を飛べない鳥です");	
			}
		}
		
public void display(boolean fly) {
	if(fly == true) {
		System.out.println("空を飛べます");
	}else {
		System.out.println("空を飛べません");
	}
}

public boolean display(int mile) {
	if(mile > 1000) {
		System.out.println("長距離飛べます");
		return true;
	}else {
		System.out.println("飛べるかどうか不明です");
		return false;
	}
}


}
