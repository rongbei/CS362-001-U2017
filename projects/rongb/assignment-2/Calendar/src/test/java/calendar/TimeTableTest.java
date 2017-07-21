package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.GregorianCalendar;



public class TimeTableTest {
	

	 @Test
	  public void test01()  throws Throwable  {
		 
		 TimeTable timeTable1 = new TimeTable();
		 assertNotNull(timeTable1);
		 LinkedList<Appt> linkedList1 = new LinkedList<Appt>();
		 assertEquals(0, linkedList1.size());
		 assertNotNull(linkedList1);
		 
		 boolean boolean1 = linkedList1.add((Appt) null);
		 assertEquals(1, linkedList1.size());
		 assertTrue(boolean1);
		 
		 Appt appt1 = new Appt(24, 60, 31, 11, 2000, "First", "Second");
		 assertEquals(24, appt1.getStartHour());
		 assertEquals(60, appt1.getStartMinute());
		 assertEquals(31, appt1.getStartDay());
		 assertEquals(11, appt1.getStartMonth());
		 assertEquals(2000, appt1.getStartYear());
		 assertEquals("First", appt1.getTitle());
		 assertEquals("Second", appt1.getDescription());
		 assertTrue(appt1.getValid());
		 assertNotNull(appt1);
		 
		 
		 int[] recurDays1 = new int[10];
		 appt1.setRecurrence(recurDays1, 1, 2, 3);
		 assertEquals(1, appt1.getRecurBy());
		 assertEquals(2, appt1.getRecurIncrement());
		 assertEquals(3, appt1.getRecurNumber());
		 assertTrue(appt1.isRecurring());
		 
		 
		 assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
		 assertEquals(0, Appt.RECUR_NUMBER_NEVER);
		 assertEquals(1, Appt.RECUR_BY_WEEKLY);
		 assertEquals(2, Appt.RECUR_BY_MONTHLY);
		 assertEquals(3, Appt.RECUR_BY_YEARLY);
		 
		 
		 boolean boolean2 = linkedList1.add(appt1);
		 assertTrue(boolean2 == boolean1);
		 assertEquals(2, linkedList1.size());
		 int[] intArray1 = new int[1];
		 LinkedList<Appt> linkedList2 = timeTable1.permute(linkedList1, intArray1);
		 assertTrue(linkedList2.equals((Object)linkedList1));
		 assertEquals(2, linkedList1.size());
		 assertEquals(2, linkedList2.size());
		 
		 assertArrayEquals(new int[] {0}, intArray1);
		 assertNotNull(linkedList2);
		 assertNotSame(linkedList1, linkedList2);
		 assertNotSame(linkedList2, linkedList1);


		 
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
		 GregorianCalendar firstDay = new GregorianCalendar(2000, 10, 1, 2, 2, 2);
		 GregorianCalendar nextDay = (GregorianCalendar) firstDay.clone();
		 assertFalse(firstDay == nextDay);
		 		 
		 LinkedList<GregorianCalendar> result = new LinkedList<GregorianCalendar>();
		 assertNotNull(result);
		 	 
		 
		 
	 }
//add more unit tests as you needed
}
