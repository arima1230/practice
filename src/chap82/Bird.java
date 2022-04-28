package chap82;

	public class Bird extends Animal {
		private boolean fly;
		
		public Bird(int leg, boolean fly){
			this.fly = fly;
			if(this.fly == true) {
				System.out.println("空を飛べる鳥です");
			}else {
				System.out.println("空を飛べない鳥です");	
			}
		}
public void display() {
	if(this.fly == true) {
		System.out.println("空を飛べます");
	}else {
		System.out.println("空を飛べません");
	}
}

}
