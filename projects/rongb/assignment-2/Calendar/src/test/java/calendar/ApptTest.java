package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */

import org.junit.Test;
import static org.junit.Assert.*;



public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	
	private static Appt appt1 = new Appt(-1, -1, -1, 0, -1, "", "");
		
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
		 
		 appt.setStartHour(25);
		 appt.setStartMinute(61);
		 appt.setStartDay(366);
		 appt.setStartMonth(11);
		 appt.setStartYear(-1);
		 appt.setTitle("New Plan");
		 appt.setDescription("For Studying");
		 
		 assertEquals(25, appt.getStartHour());
		 assertEquals(61, appt.getStartMinute());
		 assertEquals(366, appt.getStartDay());
		 assertEquals(11, appt.getStartMonth());
		 assertEquals(-1, appt.getStartYear());
		 assertEquals("New Plan", appt.getTitle());
		 assertEquals("For Studying", appt.getDescription());
		 
		 
		 
		 
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 
		 appt1.setRecurrence(null, 0, 0, 0);
		 
		 CalendarUtil.DaysInMonth = appt1.getRecurDays();
		 assertEquals(0, appt1.getRecurBy());
		 assertEquals(0, appt1.getRecurIncrement());
		 assertEquals(0, appt1.getRecurNumber());
		 assertFalse(appt1.isRecurring());
		 
		 
		 int[] recurDays1 = new int[100];
		 appt1.setRecurrence(recurDays1, 11, 12, 13);
		 assertEquals(11, appt1.getRecurBy());
		 assertEquals(12, appt1.getRecurIncrement());
		 assertEquals(13, appt1.getRecurNumber());
		 assertTrue(appt1.isRecurring());
		 
		 
	 }
//add more unit tests as you needed

	 

	 
}
