package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		assertEquals(7, calculator.add(3, 4));
	}

	//as the source to the test the function:
	@ParameterizedTest
	@CsvSource({
		"1, 9", 
		"2, 8", 
		"3, 7",
		"4, 6",
		"5, 5"
	})
		
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		assertEquals(10, calculator.add(valueOne, valueTwo));
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		assertEquals(28, calculator.sub(38, 10));
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		assertEquals(56, calculator.multiply(7, 8));
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		assertEquals(3.0, calculator.divide(6, 2), 0.0);
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		Throwable exception = assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
		assertEquals("ZeroDivisionError", exception.getMessage());
	}
}
