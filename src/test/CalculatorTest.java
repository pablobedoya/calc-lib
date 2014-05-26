package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ufrn.gcm.resources.CalculatorMultResource;
import com.ufrn.gcm.resources.CalculatorSumResource;

public class CalculatorTest {
	
	@Test
	public void testSum() {
		CalculatorSumResource test = new CalculatorSumResource();
		assertEquals("15.0", test.sum(10, 5));
	}
	
	@Test
	public void testMultiply() {
		CalculatorMultResource test = new CalculatorMultResource();
		assertEquals("50.0", test.mult(10, 5));
	}
}
