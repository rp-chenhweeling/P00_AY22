import java.math.*;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		if (b != 0) {
			// check to make sure denominator is not zero
			// For decimal result, digits after decimal point is truncated
			return a / b;
		}
		else {
			// throw IllegalArgumentException with specific message
			throw new IllegalArgumentException("Division by zero is not allowed");

		}
	}
	
	public int power(int a, int b) {
		return (int) Math.pow((double)a, (double)b);
	}
	
	
}
