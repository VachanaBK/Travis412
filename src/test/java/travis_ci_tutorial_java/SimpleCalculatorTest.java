package travis_ci_tutorial_java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	@Test
	public void testnegativeMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(3, 5), -2);
	}

	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 3), 15);
	}
	@Test
	public void testnegativeMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, -3), -15);
	}

	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(5, 3), 2);
	}

	 @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        SimpleCalculator calc = new SimpleCalculator();
        calc.divide(10, 0);
}
}