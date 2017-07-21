package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.GregorianCalendar;



public class CalDayTest {
	
	
	 @Test
	  public void test01()  throws Throwable  {
		 
		 GregorianCalendar GregorianCalendar1 = new GregorianCalendar(2000, 10, 1, 2, 2, 2);
		 CalDay calDay1 = new CalDay(GregorianCalendar1);
		 
		 assertEquals(2000, calDay1.getYear());
		 assertEquals(10, calDay1.getMonth());
		 assertEquals(10, calDay1.getDay());         // bug
		 
		 
		 
		 Appt appt1 = new Appt(5, 5, 5, 5, 5, "", "");
		 Appt appt2 = new Appt(0, 0, 0, 0, 0, "1", "1");

		 
		 calDay1.addAppt(appt1);
		 calDay1.addAppt(appt1);
		 calDay1.addAppt(appt2);
		 
		 assertTrue(calDay1.isValid());
		 
		 assertEquals(1, calDay1.getSizeAppts());		 // bug
		 	 
		 
		 

	 }
	 
	 @Test
	  public void test02()  throws Throwable  {
		 
		 CalDay calDay2 = new CalDay();		 
		 LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		 calDay2.appts = linkedList0;
		 
		 Appt appt3 = new Appt((-74), 0, (-938), 0, 24, "", "lalala");
		 Appt appt4 = new Appt(0, 1, 0, 1, 0, ".", "");
		 
		 linkedList0.addFirst(appt3);
		 linkedList0.add(appt3);
		 linkedList0.add(appt4);
		 linkedList0.addLast(appt4);
		 
		 assertEquals(3, calDay2.getSizeAppts());
		 

		 
	 }
	 
//add more unit tests as you needed	
	 
	 @Test
	  public void test03()  throws Throwable  {
		 
		 TimeZone timeZone3 = TimeZone.getTimeZone("calendar.Appt");
		 Locale locale3 = Locale.GERMAN;
		 GregorianCalendar GregorianCalendar3 = new GregorianCalendar(timeZone3, locale3);
		 CalDay calDay3 = new CalDay(GregorianCalendar3);
		 calDay3.getYear();
		 
		 

		 
	 }
	 
	 @Test
	  public void test04()  throws Throwable  {
		 
		 CalDay calDay4 = new CalDay();
		 String string4 = calDay4.toString();
		 assertEquals("", string4);

		 Iterator<?> iterator4 = calDay4.iterator();
		 assertNull(iterator4);

		 

		 
	 }
	 
	 
}
