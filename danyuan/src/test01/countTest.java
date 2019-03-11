package test01;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class countTest {
count c=new count();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void AtestZhengchu10() {
	int result=c.Zhengchu10(10,10);
	assertEquals(10,result);
	}

	@Test
	public void BtestZhengchu7() {
		int result=c.Zhengchu7(70,10);
		assertEquals(7,result);
	}

}
