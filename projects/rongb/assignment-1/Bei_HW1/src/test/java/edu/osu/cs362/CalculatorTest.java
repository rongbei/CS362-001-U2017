package edu.osu.cs362;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	private static Calculator cal = new Calculator();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("*** Test Start ***");
		cal.clear();		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("*** Test End ***");
	}
	
	@Ignore("Ignore 'GetX Test', 'SetX Test', 'GetY Test', 'SetY Test'")
	@Test
	public void testGetX() {
		System.out.println("Ignoroe GetX Test");
	}
	
	@Ignore
	@Test
	public void testSetX() {
		System.out.println("Ignoroe SetX Test");
	}
	
	@Ignore
	@Test
	public void testGetY() {
		System.out.println("Ignoroe GetY Test");
	}

	@Ignore
	@Test
	public void testSetY() {
		System.out.println("Ignoroe SetY Test");
	}

	@Test
	public void testAdd1() {
		System.out.println("Add1 Test");
		Calculator test = new Calculator();
		assertEquals(10,test.add1(4, 6),0);
	}

	@Test
	public void testAdd2() {
		System.out.println("Add2 Test");
		cal.add2(2);
		cal.add2(3);
		assertEquals(5,cal.getResult());
	}

	@Test
	public void testReduction1() {
		System.out.println("Reduction1 Test");
		Calculator test = new Calculator();
		assertEquals(5,test.reduction1(6.9, 1.4),0.1);
	}

	@Test
	public void testReduction2() {
		System.out.println("Reduction2 Test");
		cal.add2(10);
		cal.reduction2(2);
		assertEquals(8,cal.getResult());
	}
	
	@Ignore("Ignore 'Multiply1 Test'")
	@Test
	public void testMultiply1() {
		System.out.println("Ignore Multiply1 Test");
		fail("Not yet implemented");
	}

	@Ignore("Ignore 'Multiply2 Test'")
	@Test
	public void testMultiply2() {
		System.out.println("Ignore Multiply2 Test");
	}

	@Test
	public void testDivision1() {
		System.out.println("Division1 Test");
		Calculator test = new Calculator();
		assertEquals(3,test.division1(10, 3), 0.5);
	}

	@Test(expected=ArithmeticException.class)
	public void testDivision2() {
		System.out.println("Division2 Test");
		cal.add2(8);
		cal.division2(0);
		assertEquals(4,cal.getResult());
	}

	@Test
	public void testSquare() {
		System.out.println("Square Test");
		cal.square();
		assertEquals(cal.getResult(),cal.getResult());
	}
	
	@Test(timeout=10)
	public void testSquareRoot() {
		System.out.println("SquareRoot Test");
		cal.squareRoot(10);
		assertEquals(5,cal.getResult());
	}

	@Test
	public void testClear() {
		System.out.println("Clear Test");
		cal.clear();
		assertEquals(0,cal.getResult());
	}

	@Test
	public void testGetResult() {
		System.out.println("GetResult Test");
		cal.getResult();
		assertEquals(cal.getResult(),cal.getResult());
	}
	
	@Ignore
	@Test
	public void testMain() {
		System.out.println("Main Test");
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testObject() {
		System.out.println("Object Test");
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testGetClass() {
		System.out.println("GetClass Test");
		fail("Not yet implemented");
	}

}
