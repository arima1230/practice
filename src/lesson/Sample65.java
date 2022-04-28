package lesson;

public class Sample65 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][][] arr = {{{11, 12, 13}, {21, 22,23}},{{31,32,33},{41,42,43}}};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.println("arr[" + j + "][" + j +"][" + k +"}=" + arr[i][j][k]);
				}
			}
			
		}
	}

}
