package lesson;

public class Sample54 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int age = Integer.parseInt(args[0]);
		String greeting;
		
		switch(age) {
		case 60:
			greeting = "還暦";
			break;
			
		case 70:
			greeting = "古希";
			break;
			
		case 77:
			greeting = "喜寿";
			break;
			
		case 80:
			greeting = "傘寿";
			break;
		
		case 88:
			greeting = "米寿";
			break;
		
		case 90:
			greeting = "卒寿";
			break;
			
		case 99:
			greeting = "白寿";
			break;
			
		default:
			greeting = "記念年以外";
			break;
		}
			System.out.println("今年は" + greeting + "です。元気にお過ごしください");
	}

}
