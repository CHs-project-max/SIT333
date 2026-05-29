package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestMathQuestionService {

	@Test
	public void testTrueAdd() {
		Assert.assertEquals(3.0, MathQuestionService.q1Addition("1", "2"), 0);
	}

	@Test
	public void testAddNumber1Empty() {
		Assert.assertNull(MathQuestionService.q1Addition("", "2"));
	}

	@Test
	public void testAddInvalidInput() {
		Assert.assertNull(MathQuestionService.q1Addition("abc", "2"));
	}

	@Test
	public void testTrueSubtraction() {
		Assert.assertEquals(3.0, MathQuestionService.q2Subtraction("5", "2"), 0);
	}

	@Test
	public void testSubtractionEmptyInput() {
		Assert.assertNull(MathQuestionService.q2Subtraction("", "2"));
	}

	@Test
	public void testTrueMultiplication() {
		Assert.assertEquals(20.0, MathQuestionService.q3Multiplication("5", "4"), 0);
	}

	@Test
	public void testMultiplicationInvalidInput() {
		Assert.assertNull(MathQuestionService.q3Multiplication("x", "4"));
	}
	@Test
	public void testAddNumber2Empty() {
		Assert.assertNull(MathQuestionService.q1Addition("1", ""));
	}

	@Test
	public void testAddNullInput() {
		Assert.assertNull(MathQuestionService.q1Addition(null, "2"));
	}

	@Test
	public void testSubtractionInvalidInput() {
		Assert.assertNull(MathQuestionService.q2Subtraction("abc", "2"));
	}

	@Test
	public void testSubtractionNullInput() {
		Assert.assertNull(MathQuestionService.q2Subtraction("5", null));
	}

	@Test
	public void testMultiplicationEmptyInput() {
		Assert.assertNull(MathQuestionService.q3Multiplication("", "4"));
	}

	@Test
	public void testMultiplicationNullInput() {
		Assert.assertNull(MathQuestionService.q3Multiplication("5", null));
	}

	@Test
	public void testDecimalAddition() {
		Assert.assertEquals(4.5, MathQuestionService.q1Addition("2.5", "2"), 0);
	}

	@Test
	public void testNegativeSubtraction() {
		Assert.assertEquals(-3.0, MathQuestionService.q2Subtraction("2", "5"), 0);
	}
}