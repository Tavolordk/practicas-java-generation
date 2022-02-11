package pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    
	@Test
	public void addition() {
		assertEquals(8,calculator.addNumbers(5, 3));
	}
    
	@Test
	public void multiplication() {
		assertEquals(15, calculator.multiplyNumbers(5, 3));
	}
	@Test
	public void division() {
		assertEquals(5, calculator.divideNumbers(10, 2));
	}
	@Test
	public void substraction() {
		assertEquals(-3, calculator.subtractNumbers(7, 10));
	}
}
