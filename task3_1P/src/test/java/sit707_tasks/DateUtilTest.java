package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s224639721";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Chhay Hout Lay";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {

	    DateUtil date =
	            new DateUtil(
	                    1,
	                    1,
	                    2024);

	    date.increment();

	    Assert.assertEquals(
	            2,
	            date.getDay());

	    Assert.assertEquals(
	            1,
	            date.getMonth());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {

	    DateUtil date =
	            new DateUtil(
	                    1,
	                    1,
	                    2024);

	    date.decrement();

	    Assert.assertEquals(
	            31,
	            date.getDay());

	    Assert.assertEquals(
	            12,
	            date.getMonth());

	    Assert.assertEquals(
	            2023,
	            date.getYear());
	}
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
	public void testMaxFebruary29ShouldIncrementToMarch1() {

	    DateUtil date = new DateUtil(29,2,2024);

	    System.out.println(
	            "February max increment test: " + date);

	    date.increment();

	    System.out.println(
	            "After increment: " + date);

	    Assert.assertEquals(1,date.getDay());
	    Assert.assertEquals(3,date.getMonth());
	    Assert.assertEquals(2024,date.getYear());
	}

	@Test
	public void testMaxFebruary29ShouldDecrementToFebruary28() {

	    DateUtil date = new DateUtil(29,2,2024);

	    System.out.println(
	            "February max decrement test: " + date);

	    date.decrement();

	    System.out.println(
	            "After decrement: " + date);

	    Assert.assertEquals(28,date.getDay());
	    Assert.assertEquals(2,date.getMonth());
	    Assert.assertEquals(2024,date.getYear());
	}
	@Test
	public void testMinFebruary1ShouldIncrementToFebruary2() {

	    DateUtil date = new DateUtil(1,2,2024);

	    System.out.println(
	            "February minimum increment test: " + date);

	    date.increment();

	    System.out.println(
	            "After increment: " + date);

	    Assert.assertEquals(2,date.getDay());
	    Assert.assertEquals(2,date.getMonth());
	}

	@Test
	public void testMinFebruary1ShouldDecrementToJanuary31() {

	    DateUtil date = new DateUtil(1,2,2024);

	    System.out.println(
	            "February minimum decrement test: " + date);

	    date.decrement();

	    System.out.println(
	            "After decrement: " + date);

	    Assert.assertEquals(31,date.getDay());
	    Assert.assertEquals(1,date.getMonth());
	    Assert.assertEquals(2024,date.getYear());
	}

	@Test
	public void testNominalFebruaryShouldIncrementByOneDay() {

	    DateUtil date = new DateUtil(15,2,2024);

	    System.out.println(
	            "February nominal test: " + date);

	    date.increment();

	    System.out.println(
	            "After increment: " + date);

	    Assert.assertEquals(16,date.getDay());
	    Assert.assertEquals(2,date.getMonth());
	}
	// ===== March =====

	@Test
	public void testMarch31Increment() {
	    DateUtil date = new DateUtil(31,3,2024);
	    System.out.println("Before: " + date);
	    date.increment();
	    System.out.println("After: " + date);

	    Assert.assertEquals(1,date.getDay());
	    Assert.assertEquals(4,date.getMonth());
	}

	@Test
	public void testMarch1Decrement() {
	    DateUtil date = new DateUtil(1,3,2024);
	    System.out.println("Before: " + date);
	    date.decrement();
	    System.out.println("After: " + date);

	    Assert.assertEquals(29,date.getDay());
	    Assert.assertEquals(2,date.getMonth());
	}

	@Test
	public void testMarchNominal() {
	    DateUtil date = new DateUtil(15,3,2024);
	    date.increment();

	    Assert.assertEquals(16,date.getDay());
	}


	// ===== April =====

	@Test
	public void testApril30Increment() {
	    DateUtil date = new DateUtil(30,4,2024);
	    System.out.println("Before: " + date);
	    date.increment();
	    System.out.println("After: " + date);

	    Assert.assertEquals(1,date.getDay());
	    Assert.assertEquals(5,date.getMonth());
	}

	@Test
	public void testApril1Decrement() {
	    DateUtil date = new DateUtil(1,4,2024);
	    date.decrement();

	    Assert.assertEquals(31,date.getDay());
	    Assert.assertEquals(3,date.getMonth());
	}

	@Test
	public void testAprilNominal() {
	    DateUtil date = new DateUtil(15,4,2024);
	    date.increment();

	    Assert.assertEquals(16,date.getDay());
	}


	// ===== May =====

	@Test
	public void testMay31Increment() {
	    DateUtil date = new DateUtil(31,5,2024);
	    date.increment();

	    Assert.assertEquals(1,date.getDay());
	    Assert.assertEquals(6,date.getMonth());
	}

	@Test
	public void testMay1Decrement() {
	    DateUtil date = new DateUtil(1,5,2024);
	    date.decrement();

	    Assert.assertEquals(30,date.getDay());
	    Assert.assertEquals(4,date.getMonth());
	}

	@Test
	public void testMayNominal() {
	    DateUtil date = new DateUtil(15,5,2024);
	    date.increment();

	    Assert.assertEquals(16,date.getDay());
	}


	// ===== June =====

	@Test
	public void testJune30Increment() {
	    DateUtil date = new DateUtil(30,6,2024);
	    date.increment();

	    Assert.assertEquals(1,date.getDay());
	    Assert.assertEquals(7,date.getMonth());
	}

	@Test
	public void testJune1Decrement() {
	    DateUtil date = new DateUtil(1,6,2024);
	    date.decrement();

	    Assert.assertEquals(31,date.getDay());
	    Assert.assertEquals(5,date.getMonth());
	}


	// ===== July =====

	@Test
	public void testJuly31Increment() {
	    DateUtil date = new DateUtil(31,7,2024);
	    date.increment();

	    Assert.assertEquals(1,date.getDay());
	    Assert.assertEquals(8,date.getMonth());
	}

	@Test
	public void testJuly1Decrement() {
	    DateUtil date = new DateUtil(1,7,2024);
	    date.decrement();

	    Assert.assertEquals(30,date.getDay());
	    Assert.assertEquals(6,date.getMonth());
	}


	// ===== August =====

	@Test
	public void testAugust31Increment() {
	    DateUtil date = new DateUtil(31,8,2024);
	    date.increment();

	    Assert.assertEquals(1,date.getDay());
	    Assert.assertEquals(9,date.getMonth());
	}

	@Test
	public void testAugust1Decrement() {
	    DateUtil date = new DateUtil(1,8,2024);
	    date.decrement();

	    Assert.assertEquals(31,date.getDay());
	    Assert.assertEquals(7,date.getMonth());
	}


	// ===== September =====

	@Test
	public void testSeptember30Increment() {
	    DateUtil date = new DateUtil(30,9,2024);
	    date.increment();

	    Assert.assertEquals(1,date.getDay());
	    Assert.assertEquals(10,date.getMonth());
	}

	@Test
	public void testSeptember1Decrement() {
	    DateUtil date = new DateUtil(1,9,2024);
	    date.decrement();

	    Assert.assertEquals(31,date.getDay());
	    Assert.assertEquals(8,date.getMonth());
	}


	// ===== October =====

	@Test
	public void testOctober31Increment() {
	    DateUtil date = new DateUtil(31,10,2024);
	    date.increment();

	    Assert.assertEquals(1,date.getDay());
	    Assert.assertEquals(11,date.getMonth());
	}

	@Test
	public void testOctober1Decrement() {
	    DateUtil date = new DateUtil(1,10,2024);
	    date.decrement();

	    Assert.assertEquals(30,date.getDay());
	    Assert.assertEquals(9,date.getMonth());
	}


	// ===== November =====

	@Test
	public void testNovember30Increment() {
	    DateUtil date = new DateUtil(30,11,2024);
	    date.increment();

	    Assert.assertEquals(1,date.getDay());
	    Assert.assertEquals(12,date.getMonth());
	}

	@Test
	public void testNovember1Decrement() {
	    DateUtil date = new DateUtil(1,11,2024);
	    date.decrement();

	    Assert.assertEquals(31,date.getDay());
	    Assert.assertEquals(10,date.getMonth());
	}


	// ===== December =====

	@Test
	public void testDecember31Increment() {
	    DateUtil date = new DateUtil(31,12,2024);

	    System.out.println("Before: " + date);

	    date.increment();

	    System.out.println("After: " + date);

	    Assert.assertEquals(1,date.getDay());
	    Assert.assertEquals(1,date.getMonth());
	    Assert.assertEquals(2025,date.getYear());
	}

	@Test
	public void testDecember1Decrement() {
	    DateUtil date = new DateUtil(1,12,2024);

	    date.decrement();

	    Assert.assertEquals(30,date.getDay());
	    Assert.assertEquals(11,date.getMonth());
	}
	
}
