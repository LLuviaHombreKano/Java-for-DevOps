package first_Project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

		//Create Private Class
	private static MathUtils mathutils;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		mathutils = new MathUtils();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	void testAdd() {
		//Adds Positive Numbers
		assertEquals(113, mathutils.add(63, 50));
		//Adds Negative Numbers
		assertEquals(-593, mathutils.add(-560, -33));
		//fail("Not yet implemented"); // TODO
	}

	@Test
	void testSubtract() {
		//Subtracts Positive Numbers
		assertEquals(100, mathutils.subtract(200, 100));
		//Subtracts Negative Numbers
		assertEquals(-99, mathutils.subtract(1, 100));
		//fail("Not yet implemented"); // TODO
	}

	@Test
	void testMultiply() {
		//Multiplies Positive Numbers
		assertEquals(256, mathutils.multiply(2, 128));
		//Multiplies Negative Numbers
		assertEquals(-144, mathutils.multiply(-12, 12));
		//fail("Not yet implemented"); // TODO
	}

	@Test
	void testDivide() {
		//Divides by 0
		assertEquals(-1.0, mathutils.divide(65255, 0), 0.0001);
		//Divides Negative Numbers
		assertEquals(-14, mathutils.divide(28, -2), 0.0001);
		//Divides Positive Numbers
		assertEquals(11.0, mathutils.divide(99, 9), 0.0001);
		//fail("Not yet implemented"); // TODO
	}

}
