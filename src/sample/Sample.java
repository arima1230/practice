package sample;

public class Sample {
	public int add (int x, int y) throws Exception{
		int result = x + y;
		if(result > 0){
			return result;
		}else {
			throw new Exception();
		}
	}

}
