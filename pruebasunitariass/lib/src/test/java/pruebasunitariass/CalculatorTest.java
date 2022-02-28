package pruebasunitariass;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private final Calculator calculator = new Calculator ();

	@Test
	void addition() {
		assertEquals(8, calculator.addNumbers(5 , 3));
	}

	@Test
	void subtraction() {
		assertEquals(2, calculator.subtractNumbers(5 , 3));
	}

	
	@Test
	void multiplication() {
		assertEquals(15, calculator.multiplyNumbers(5 , 3));
	}
	

	@Test
	void division() {
		assertEquals(5, calculator.divideNumbers(15 , 3));
	}
	
	
}
