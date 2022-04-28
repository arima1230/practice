package test.exam;

import static org.junit.Assert.*;

import org.junit.Test;

import sample.Sample;

public class SampleTest {
//@Testはコメントカラーだがコメントではない
	@Test
	public void test01() {
		//fail("まだ実装されていません");
		int expected = 300;
		int actual = 0;
		Sample sam = new Sample();
		
		try {
			actual = sam.add(100, 200);			
		}catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(actual, expected);
	}
	@Test
	public void test02() {
		Sample sam =new Sample();
		try {
			sam.add(-500, 200);
			fail("ここまでくるとテスト失敗");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

