package test.resources;

import static org.junit.Assert.assertEquals;
import main.resources.com.ufrn.gcm.resources.CalculatorMultResource;
import main.resources.com.ufrn.gcm.resources.CalculatorSumResource;

import org.junit.Test;

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
