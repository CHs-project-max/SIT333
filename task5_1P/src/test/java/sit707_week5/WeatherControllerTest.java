package sit707_week5;

import org.junit.Assert;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
public class WeatherControllerTest {
	private static WeatherController wController;
	private static double[] hourlyTemperatures;
	
	@BeforeClass
	public static void setUpBeforeClass() {

	    System.out.println("+++ Arrange: setup controller once +++");

	    // Create controller once
	    wController = WeatherController.getInstance();

	    // Get total hours
	    int nHours = wController.getTotalHours();

	    // Create local array
	    hourlyTemperatures = new double[nHours];

	    // Retrieve temperatures once only
	    for (int i = 0; i < nHours; i++) {
	        hourlyTemperatures[i] = wController.getTemperatureForHour(i + 1);
	    }
	}
	
	@AfterClass
	public static void tearDownAfterClass() {

	    System.out.println("+++ After: close controller once +++");

	    wController.close();
	}
	
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
	public void testTemperatureMin() {

	    System.out.println("+++ testTemperatureMin +++");

	    // Arrange
	    double minTemperature = 1000;

	    // Act
	    for (double temperatureVal : hourlyTemperatures) {
	        if (minTemperature > temperatureVal) {
	            minTemperature = temperatureVal;
	        }
	    }

	    // Assert
	    Assert.assertEquals(
	            minTemperature,
	            wController.getTemperatureMinFromCache(),
	            0.001
	    );
	}
	
	@Test
	public void testTemperatureMax() {

	    System.out.println("+++ testTemperatureMax +++");

	    // Arrange
	    double maxTemperature = -1;

	    // Act
	    for (double temperatureVal : hourlyTemperatures) {
	        if (maxTemperature < temperatureVal) {
	            maxTemperature = temperatureVal;
	        }
	    }

	    // Assert
	    Assert.assertEquals(
	            maxTemperature,
	            wController.getTemperatureMaxFromCache(),
	            0.001
	    );
	}

	@Test
	public void testTemperatureAverage() {

	    System.out.println("+++ testTemperatureAverage +++");

	    // Arrange
	    double sumTemp = 0;

	    // Act
	    for (double temperatureVal : hourlyTemperatures) {
	        sumTemp += temperatureVal;
	    }

	    double averageTemp = sumTemp / hourlyTemperatures.length;

	    // Assert
	    Assert.assertEquals(
	            averageTemp,
	            wController.getTemperatureAverageFromCache(),
	            0.001
	    );
	}
	
	@Test
	public void testTemperaturePersist() {
		/*
		 * Remove below comments ONLY for 5.3C task.
		 */
//		System.out.println("+++ testTemperaturePersist +++");
//		
//		// Initialise controller
//		WeatherController wController = WeatherController.getInstance();
//		
//		String persistTime = wController.persistTemperature(10, 19.5);
//		String now = new SimpleDateFormat("H:m:s").format(new Date());
//		System.out.println("Persist time: " + persistTime + ", now: " + now);
//		
//		Assert.assertTrue(persistTime.equals(now));
//		
//		wController.close();
	}
}
