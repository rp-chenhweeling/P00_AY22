import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
// Make changes
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected, actual);
				
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(expected, actual);
				
	}

	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = 4;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 40;
		assertEquals(expected, actual);
				
	}
	
	@Test
	public void testDivideWith0Denominator() {
		//fail("Not yet implemented");
		int a = 100;
		int b = 0;
		
		try {
			Calculator cal = new Calculator();
			cal.divide(a, b);
			//If operations completes, that means the test fail
			fail("Expected an IllegalArgumentException to be thrown");
			 
		}catch(IllegalArgumentException e) {
			//If the correct exception with correct message is thrown, test pass
			assertEquals("Division by zero is not allowed", e.getMessage() );
			  
		}catch(Throwable t) {
			//If other exception with some message is thrown, test failed
			assertEquals( "Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}

	@Test
	public void testDivideWithNon0Denominator() {
		//fail("Not yet implemented");
		int a = 100;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 20;
		assertEquals(expected, actual);
	}

	@Test
	public void testPower() {
		//fail("Not yet implemented");
		int a = 4;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = (int) cal.power(a, b);
		
		int expected = 16;
		assertEquals(expected, actual);
				
	}

}
