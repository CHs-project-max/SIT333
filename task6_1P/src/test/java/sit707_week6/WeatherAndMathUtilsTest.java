package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
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
	public void testFalseNumberIsEven() {
	    Assert.assertFalse(WeatherAndMathUtils.isEven(3));
	}
	@Test
	public void testTrueNumberIsEven() {
	    Assert.assertTrue(WeatherAndMathUtils.isEven(4));
	}
	
	@Test
	public void testOneIsPrime() {
	    Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
	}

	@Test
	public void testOddPrimeNumber() {
	    Assert.assertTrue(WeatherAndMathUtils.isPrime(7));
	}

	@Test
	public void testEvenNumberIsNotPrime() {
	    Assert.assertFalse(WeatherAndMathUtils.isPrime(8));
	}
	
	
	@Test
	public void testCancelWeatherAdviceByWindSpeed() {
	    Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
	}

	@Test
	public void testCancelWeatherAdviceByRainfall() {
	    Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 6.1));
	}

	@Test
	public void testCancelWeatherAdviceByWindAndRain() {
	    Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(46.0, 4.1));
	}

	@Test
	public void testWarnWeatherAdviceByWindSpeed() {
	    Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 0.0));
	}

	@Test
	public void testWarnWeatherAdviceByRainfall() {
	    Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(0.0, 4.1));
	}

	@Test
	public void testAllClearWeatherAdvice() {
	    Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 2.0));
	}
}
