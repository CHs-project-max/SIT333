package sit707_tasks;



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

	
    // D1 M1 Y1
    @Test
    public void testD1M1Y1() {
        DateUtil date = new DateUtil(15,2,2024);
        System.out.println("D1 M1 Y1 Before : " + date);
        date.increment();
        System.out.println("D1 M1 Y1 After  : " + date);
        Assert.assertEquals(16,date.getDay());
    }

    // D1 M1 Y2
    @Test
    public void testD1M1Y2() {
        DateUtil date = new DateUtil(15,2,2023);
        System.out.println("D1 M1 Y2 Before : " + date);
        date.increment();
        System.out.println("D1 M1 Y2 After  : " + date);
        Assert.assertEquals(16,date.getDay());
    }

    // D1 M2 Y1
    @Test
    public void testD1M2Y1() {
        DateUtil date = new DateUtil(15,4,2024);
        System.out.println("D1 M2 Y1 Before : " + date);
        date.increment();
        System.out.println("D1 M2 Y1 After  : " + date);
        Assert.assertEquals(16,date.getDay());
    }

    // D1 M2 Y2
    @Test
    public void testD1M2Y2() {
        DateUtil date = new DateUtil(15,4,2023);
        System.out.println("D1 M2 Y2 Before : " + date);
        date.increment();
        System.out.println("D1 M2 Y2 After  : " + date);
        Assert.assertEquals(16,date.getDay());
    }

    // D1 M3 Y1
    @Test
    public void testD1M3Y1() {
        DateUtil date = new DateUtil(15,1,2024);
        System.out.println("D1 M3 Y1 Before : " + date);
        date.increment();
        System.out.println("D1 M3 Y1 After  : " + date);
        Assert.assertEquals(16,date.getDay());
    }

    // D1 M3 Y2
    @Test
    public void testD1M3Y2() {
        DateUtil date = new DateUtil(15,1,2023);
        System.out.println("D1 M3 Y2 Before : " + date);
        date.increment();
        System.out.println("D1 M3 Y2 After  : " + date);
        Assert.assertEquals(16,date.getDay());
    }

    // D2 M1 Y1
    @Test
    public void testD2M1Y1() {
        DateUtil date = new DateUtil(29,2,2024);
        System.out.println("D2 M1 Y1 Before : " + date);
        date.increment();
        System.out.println("D2 M1 Y1 After  : " + date);
        Assert.assertEquals(1,date.getDay());
        Assert.assertEquals(3,date.getMonth());
    }

    // D2 M1 Y2
    @Test
    public void testD2M1Y2() {
        System.out.println("D2 M1 Y2 Attempting invalid date : 29 February 2023");
        DateUtil date = new DateUtil(29,2,2023);
        date.increment();
    }

    // D2 M2 Y1
    @Test
    public void testD2M2Y1() {
        DateUtil date = new DateUtil(29,4,2024);
        System.out.println("D2 M2 Y1 Before : " + date);
        date.increment();
        System.out.println("D2 M2 Y1 After  : " + date);
        Assert.assertEquals(30,date.getDay());
    }

    // D2 M2 Y2
    @Test
    public void testD2M2Y2() {
        DateUtil date = new DateUtil(29,4,2023);
        System.out.println("D2 M2 Y2 Before : " + date);
        date.increment();
        System.out.println("D2 M2 Y2 After  : " + date);
        Assert.assertEquals(30,date.getDay());
    }

    // D2 M3 Y1
    @Test
    public void testD2M3Y1() {
        DateUtil date = new DateUtil(29,1,2024);
        System.out.println("D2 M3 Y1 Before : " + date);
        date.increment();
        System.out.println("D2 M3 Y1 After  : " + date);
        Assert.assertEquals(30,date.getDay());
    }

    // D2 M3 Y2
    @Test
    public void testD2M3Y2() {
        DateUtil date = new DateUtil(29,1,2023);
        System.out.println("D2 M3 Y2 Before : " + date);
        date.increment();
        System.out.println("D2 M3 Y2 After  : " + date);
        Assert.assertEquals(30,date.getDay());
    }

    // D3 M1 Y1
    @Test
    public void testD3M1Y1() {
        System.out.println("D3 M1 Y1 Attempting invalid date : 30 February 2024");
        DateUtil date = new DateUtil(30,2,2024);
        date.increment();
    }

    // D3 M1 Y2
    @Test
    public void testD3M1Y2() {
        System.out.println("D3 M1 Y2 Attempting invalid date : 30 February 2023");
        DateUtil date = new DateUtil(30,2,2023);
        date.increment();
    }

    // D3 M2 Y1
    @Test
    public void testD3M2Y1() {
        DateUtil date = new DateUtil(30,4,2024);
        System.out.println("D3 M2 Y1 Before : " + date);
        date.increment();
        System.out.println("D3 M2 Y1 After  : " + date);
        Assert.assertEquals(1,date.getDay());
        Assert.assertEquals(5,date.getMonth());
    }

    // D3 M2 Y2
    @Test
    public void testD3M2Y2() {
        DateUtil date = new DateUtil(30,4,2023);
        System.out.println("D3 M2 Y2 Before : " + date);
        date.increment();
        System.out.println("D3 M2 Y2 After  : " + date);
        Assert.assertEquals(1,date.getDay());
        Assert.assertEquals(5,date.getMonth());
    }

    // D3 M3 Y1
    @Test
    public void testD3M3Y1() {
        DateUtil date = new DateUtil(30,1,2024);
        System.out.println("D3 M3 Y1 Before : " + date);
        date.increment();
        System.out.println("D3 M3 Y1 After  : " + date);
        Assert.assertEquals(31,date.getDay());
    }

    // D3 M3 Y2
    @Test
    public void testD3M3Y2() {
        DateUtil date = new DateUtil(30,1,2023);
        System.out.println("D3 M3 Y2 Before : " + date);
        date.increment();
        System.out.println("D3 M3 Y2 After  : " + date);
        Assert.assertEquals(31,date.getDay());
    }

    // D4 M1 Y1
    @Test
    public void testD4M1Y1() {
        System.out.println("D4 M1 Y1 Attempting invalid date : 31 February 2024");
        DateUtil date = new DateUtil(31,2,2024);
        date.increment();
    }

    // D4 M1 Y2
    @Test
    public void testD4M1Y2() {
        System.out.println("D4 M1 Y2 Attempting invalid date : 31 February 2023");
        DateUtil date = new DateUtil(31,2,2023);
        date.increment();
    }

    // D4 M2 Y1
    @Test
    public void testD4M2Y1() {
        System.out.println("D4 M2 Y1 Attempting invalid date : 31 April 2024");
        DateUtil date = new DateUtil(31,4,2024);
        date.increment();
    }

    // D4 M2 Y2
    @Test
    public void testD4M2Y2() {
        System.out.println("D4 M2 Y2 Attempting invalid date : 31 April 2023");
        DateUtil date = new DateUtil(31,4,2023);
        date.increment();
    }

    // D4 M3 Y1
    @Test
    public void testD4M3Y1() {
        DateUtil date = new DateUtil(31,1,2024);
        System.out.println("D4 M3 Y1 Before : " + date);
        date.increment();
        System.out.println("D4 M3 Y1 After  : " + date);
        Assert.assertEquals(1,date.getDay());
        Assert.assertEquals(2,date.getMonth());
    }

    // D4 M3 Y2
    @Test
    public void testD4M3Y2() {
        DateUtil date = new DateUtil(31,1,2023);
        System.out.println("D4 M3 Y2 Before : " + date);
        date.increment();
        System.out.println("D4 M3 Y2 After  : " + date);
        Assert.assertEquals(1,date.getDay());
        Assert.assertEquals(2,date.getMonth());
    }
}
