package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ufrn.gcm.resources.CalculatorSumResource;

public class CalculatorTest {
	
	@Test
	public void testMultiply() {
		CalculatorSumResource test = new CalculatorSumResource();
		assertEquals("15.0", test.sum(10, 5));
	}
}
