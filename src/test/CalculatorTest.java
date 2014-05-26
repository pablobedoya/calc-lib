package test;
import static org.junit.Assert.assertEquals;
import main.resources.com.ufrn.gcm.resources.CalculatorSumResource;

import org.junit.Test;


public class CalculatorTest {
	
	@Test
	public void testMultiply() {
		CalculatorSumResource test = new CalculatorSumResource();
		assertEquals("15.0", test.sum(10, 5));
	}
}
