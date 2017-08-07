package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.GregorianCalendar;

import calendar.Appt;
import calendar.CalDay;
import calendar.TimeTable;
import calendar.CalendarUtil;
import calendar.DateOutOfRangeException;



public class ApptTest {
	
	private static Appt appt1 = new Appt(-1, -1, -1, 0, -1, "", "");
	private static Appt appt2 = new Appt(-1, -1, -1, 0, -1, "", "");
	
	 @Test (timeout = 4000)
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
		 	 
		 
	 }

	 @Test (timeout = 4000)
	  public void test02()  throws Throwable  {		 
		 appt1.setStartHour(-1);
		 appt1.setStartMinute(0);
		 appt1.setStartDay(1);
		 appt1.setStartMonth(1);
		 appt1.setStartYear(0);
		 appt1.setTitle("New Plan 1");
		 appt1.setDescription("For Studying 1");
		 
		 assertEquals(-1, appt1.getStartHour());
		 assertEquals(0, appt1.getStartMinute());
		 assertEquals(1, appt1.getStartDay());
		 assertEquals(1, appt1.getStartMonth());
		 assertEquals(0, appt1.getStartYear());
		 assertEquals("New Plan 1", appt1.getTitle());
		 assertEquals("For Studying 1", appt1.getDescription());
		 assertFalse(appt1.getValid());		 
		 
		 appt1.setStartHour(24);
		 appt1.setStartMinute(0);
		 appt1.setStartDay(1);
		 appt1.setStartMonth(1);
		 appt1.setStartYear(0);
		 appt1.setTitle("New Plan 1");
		 appt1.setDescription("For Studying 1");
		 
		 assertEquals(24, appt1.getStartHour());
		 assertEquals(0, appt1.getStartMinute());
		 assertEquals(1, appt1.getStartDay());
		 assertEquals(1, appt1.getStartMonth());
		 assertEquals(0, appt1.getStartYear());
		 assertEquals("New Plan 1", appt1.getTitle());
		 assertEquals("For Studying 1", appt1.getDescription());
		 assertTrue(appt1.getValid());
		 
		 appt1.setStartHour(25);
		 appt1.setStartMinute(0);
		 appt1.setStartDay(1);
		 appt1.setStartMonth(1);
		 appt1.setStartYear(0);
		 appt1.setTitle("New Plan 1");
		 appt1.setDescription("For Studying 1");
		 
		 assertEquals(25, appt1.getStartHour());
		 assertEquals(0, appt1.getStartMinute());
		 assertEquals(1, appt1.getStartDay());
		 assertEquals(1, appt1.getStartMonth());
		 assertEquals(0, appt1.getStartYear());
		 assertEquals("New Plan 1", appt1.getTitle());
		 assertEquals("For Studying 1", appt1.getDescription());
		 assertFalse(appt1.getValid());
		 
		 
		 appt1.setStartHour(0);
		 appt1.setStartMinute(61);
		 appt1.setStartDay(0);
		 appt1.setStartMonth(0);
		 appt1.setStartYear(0);
		 appt1.setTitle("New Plan 2");
		 appt1.setDescription("For Studying 2");
		 
		 assertEquals(0, appt1.getStartHour());
		 assertEquals(61, appt1.getStartMinute());
		 assertEquals(0, appt1.getStartDay());
		 assertEquals(0, appt1.getStartMonth());
		 assertEquals(0, appt1.getStartYear());
		 assertEquals("New Plan 2", appt1.getTitle());
		 assertEquals("For Studying 2", appt1.getDescription());
		 assertFalse(appt1.getValid());
		 
		 
		 appt1.setStartHour(0);
		 appt1.setStartMinute(0);
		 appt1.setStartDay(40);
		 appt1.setStartMonth(0);
		 appt1.setStartYear(0);
		 appt1.setTitle("New Plan 3");
		 appt1.setDescription("For Studying 3");
		 
		 assertEquals(0, appt1.getStartHour());
		 assertEquals(0, appt1.getStartMinute());
		 assertEquals(40, appt1.getStartDay());
		 assertEquals(0, appt1.getStartMonth());
		 assertEquals(0, appt1.getStartYear());
		 assertEquals("New Plan 3", appt1.getTitle());
		 assertEquals("For Studying 3", appt1.getDescription());
		 assertFalse(appt1.getValid());
		 
		 
		 appt1.setStartHour(0);
		 appt1.setStartMinute(0);
		 appt1.setStartDay(1);
		 appt1.setStartMonth(0);
		 appt1.setStartYear(0);
		 appt1.setTitle("New Plan 4");
		 appt1.setDescription("For Studying 4");
		 
		 assertEquals(0, appt1.getStartHour());
		 assertEquals(0, appt1.getStartMinute());
		 assertEquals(1, appt1.getStartDay());
		 assertEquals(0, appt1.getStartMonth());
		 assertEquals(0, appt1.getStartYear());
		 assertEquals("New Plan 4", appt1.getTitle());
		 assertEquals("For Studying 4", appt1.getDescription());
		 assertFalse(appt1.getValid());
		 
		 
		 appt1.setStartHour(0);
		 appt1.setStartMinute(0);
		 appt1.setStartDay(11);
		 appt1.setStartMonth(11);
		 appt1.setStartYear(0);
		 appt1.setTitle("New Plan 4");
		 appt1.setDescription("For Studying 4");
		 
		 assertEquals(0, appt1.getStartHour());
		 assertEquals(0, appt1.getStartMinute());
		 assertEquals(11, appt1.getStartDay());
		 assertEquals(11, appt1.getStartMonth());
		 assertEquals(0, appt1.getStartYear());
		 assertEquals("New Plan 4", appt1.getTitle());
		 assertEquals("For Studying 4", appt1.getDescription());
		 assertTrue(appt1.getValid());
		 		 
		 
		 appt1.setStartHour(0);
		 appt1.setStartMinute(0);
		 appt1.setStartDay(1);
		 appt1.setStartMonth(1);
		 appt1.setStartYear(0);
		 appt1.setTitle("New Plan 4");
		 appt1.setDescription("For Studying 4");
		 
		 assertEquals(0, appt1.getStartHour());
		 assertEquals(0, appt1.getStartMinute());
		 assertEquals(1, appt1.getStartDay());
		 assertEquals(1, appt1.getStartMonth());
		 assertEquals(0, appt1.getStartYear());
		 assertEquals("New Plan 4", appt1.getTitle());
		 assertEquals("For Studying 4", appt1.getDescription());
		 assertTrue(appt1.getValid());
		 
		 
		 int NumDaysInMonth = CalendarUtil.NumDaysInMonth(0, 1);
		 appt1.setStartHour(0);
		 appt1.setStartMinute(0);
		 appt1.setStartDay(NumDaysInMonth);
		 appt1.setStartMonth(1);
		 appt1.setStartYear(0);
		 appt1.setTitle("New Plan 4");
		 appt1.setDescription("For Studying 4");
		 
		 assertEquals(0, appt1.getStartHour());
		 assertEquals(0, appt1.getStartMinute());
		 assertEquals(NumDaysInMonth, appt1.getStartDay());
		 assertEquals(1, appt1.getStartMonth());
		 assertEquals(0, appt1.getStartYear());
		 assertEquals("New Plan 4", appt1.getTitle());
		 assertEquals("For Studying 4", appt1.getDescription());
		 assertTrue(appt1.getValid());
		 
		 		 		 
		 appt1.setStartHour(0);
		 appt1.setStartMinute(0);
		 appt1.setStartDay(1);
		 appt1.setStartMonth(1);
		 appt1.setStartYear(0);
		 appt1.setTitle(null);
		 appt1.setDescription(null);
		 
		 assertEquals(0, appt1.getStartHour());
		 assertEquals(0, appt1.getStartMinute());
		 assertEquals(1, appt1.getStartDay());
		 assertEquals(1, appt1.getStartMonth());
		 assertEquals(0, appt1.getStartYear());
		 assertEquals("", appt1.getTitle());
		 assertEquals("", appt1.getDescription());
		 assertTrue(appt1.getValid());
		 
		 

		 
		 
		 appt2.setStartHour(13);
		 appt2.setStartMinute(0);
		 appt2.setStartDay(NumDaysInMonth);
		 appt2.setStartMonth(1);
		 appt2.setStartYear(0);
		 appt2.setTitle(null);
		 appt2.setDescription(null);
		 
		 assertEquals(13, appt2.getStartHour());
		 assertEquals(0, appt2.getStartMinute());
		 assertEquals(NumDaysInMonth, appt2.getStartDay());
		 assertEquals(1, appt2.getStartMonth());
		 assertEquals(0, appt2.getStartYear());
		 assertEquals("", appt2.getTitle());
		 assertEquals("", appt2.getDescription());
		 assertTrue(appt2.getValid());
		 
		 String half1 = (appt2.getStartHour() > 11) ? "pm" : "am";
		 int printableHour1 = appt2.getStartHour();
		 if (printableHour1 > 12) {
			 printableHour1 -= 12;
		 }
		 if (printableHour1 == 0) {
			 printableHour1 = 12;
		 }
		 String represntationApp1 = printableHour1+":"+ appt2.getStartMinute() + half1;
		 String day1 = appt2.getStartMonth()+"/"+appt2.getStartDay()+"/"+appt2.getStartYear() + " at ";
		 assertNotSame("\t"+ day1 +  represntationApp1  + " ," +  appt2.getTitle()+ ", "+  appt2.getDescription()+"\n", appt2.toString());
		 
		 
		 
		 appt2.setStartHour(0);
		 appt2.setStartMinute(0);
		 appt2.setStartDay(NumDaysInMonth);
		 appt2.setStartMonth(1);
		 appt2.setStartYear(0);
		 appt2.setTitle(null);
		 appt2.setDescription(null);
		 
		 assertEquals(0, appt2.getStartHour());
		 assertEquals(0, appt2.getStartMinute());
		 assertEquals(NumDaysInMonth, appt2.getStartDay());
		 assertEquals(1, appt2.getStartMonth());
		 assertEquals(0, appt2.getStartYear());
		 assertEquals("", appt2.getTitle());
		 assertEquals("", appt2.getDescription());
		 assertTrue(appt2.getValid());
		 
		 String half2 = (appt2.getStartHour() > 11) ? "pm" : "am";
		 int printableHour2 = appt2.getStartHour();
		 if (printableHour2 > 12) {
			 printableHour2 -= 12;
		 }
		 if (printableHour2 == 0) {
			 printableHour2 = 12;
		 }
		 String represntationApp2 = printableHour2+":"+ appt2.getStartMinute() + half2;
		 String day2 = appt2.getStartMonth()+"/"+appt2.getStartDay()+"/"+appt2.getStartYear() + " at ";
		 assertNotSame("\t"+ day2 +  represntationApp2  + " ," +  appt2.getTitle()+ ", "+  appt2.getDescription()+"\n", appt2.toString());
		 
		 
		 
		 appt2.setStartHour(-1);
		 appt2.setStartMinute(0);
		 appt2.setStartDay(NumDaysInMonth);
		 appt2.setStartMonth(1);
		 appt2.setStartYear(0);
		 appt2.setTitle(null);
		 appt2.setDescription(null);
		 
		 assertEquals(-1, appt2.getStartHour());
		 assertEquals(0, appt2.getStartMinute());
		 assertEquals(NumDaysInMonth, appt2.getStartDay());
		 assertEquals(1, appt2.getStartMonth());
		 assertEquals(0, appt2.getStartYear());
		 assertEquals("", appt2.getTitle());
		 assertEquals("", appt2.getDescription());
		 assertFalse(appt2.getValid());
		 
		 String half22 = (appt2.getStartHour() > 11) ? "pm" : "am";
		 int printableHour22 = appt2.getStartHour();
		 if (printableHour22 > 12) {
			 printableHour22 -= 12;
		 }
		 if (printableHour22 == 0) {
			 printableHour22 = 12;
		 }
		 String represntationApp22 = printableHour22+":"+ appt2.getStartMinute() + half22;
		 String day22 = appt2.getStartMonth()+"/"+appt2.getStartDay()+"/"+appt2.getStartYear() + " at ";
		 assertNotSame("\t"+ day22 +  represntationApp22  + " ," +  appt2.getTitle()+ ", "+  appt2.getDescription()+"\n", appt2.toString());
		 
		 
		 
		 
		 
		 
		 appt2.setStartHour(7);
		 appt2.setStartMinute(0);
		 appt2.setStartDay(NumDaysInMonth);
		 appt2.setStartMonth(1);
		 appt2.setStartYear(0);
		 appt2.setTitle(null);
		 appt2.setDescription(null);
		 
		 assertEquals(7, appt2.getStartHour());
		 assertEquals(0, appt2.getStartMinute());
		 assertEquals(NumDaysInMonth, appt2.getStartDay());
		 assertEquals(1, appt2.getStartMonth());
		 assertEquals(0, appt2.getStartYear());
		 assertEquals("", appt2.getTitle());
		 assertEquals("", appt2.getDescription());
		 assertTrue(appt2.getValid());		 
		 
		 String half3 = (appt2.getStartHour() > 11) ? "pm" : "am";
		 int printableHour3 = appt2.getStartHour();
		 if (printableHour3 > 12) {
			 printableHour3 -= 12;
		 }
		 if (printableHour3 == 0) {
			 printableHour3 = 12;
		 }
		 String represntationApp3 = printableHour3+":"+ appt2.getStartMinute() + half3;
		 String day3 = appt2.getStartMonth()+"/"+appt2.getStartDay()+"/"+appt2.getStartYear() + " at ";
		 assertNotSame("\t"+ day3 +  represntationApp3  + " ," +  appt2.getTitle()+ ", "+  appt2.getDescription()+"\n", appt2.toString());
		 
		 
		 

		 
	 }
//add more unit tests as you needed

	 @Test (timeout = 4000)
	  public void test03()  throws Throwable  {
		 
		 appt1.setRecurrence(null, 0, 0, 0);		 
		 CalendarUtil.DaysInMonth = appt1.getRecurDays();
		 assertEquals(0, appt1.getRecurBy());
		 assertEquals(0, appt1.getRecurIncrement());
		 assertEquals(0, appt1.getRecurNumber());
		 assertFalse(appt1.isRecurring());
		 
		 
		 int[] recurDays1 = new int[100];
		 appt1.setRecurrence(recurDays1, 11, 12, 13);
		 CalendarUtil.DaysInMonth = appt1.getRecurDays();
		 assertEquals(11, appt1.getRecurBy());
		 assertEquals(12, appt1.getRecurIncrement());
		 assertEquals(13, appt1.getRecurNumber());
		 assertTrue(appt1.isRecurring());
		 
		 
	 }
	 
	 @Test (timeout = 4000)
	  public void test04()  throws Throwable  {
		 
		 appt1.setRecurrence(null, 0, 0, 0);		 
		 CalendarUtil.DaysInMonth = appt1.getRecurDays();
		 assertEquals(0, appt1.getRecurBy());
		 assertEquals(0, appt1.getRecurIncrement());
		 assertEquals(0, appt1.getRecurNumber());
		 assertFalse(appt1.isRecurring());
		 
		 
		 int[] recurDays1 = new int[100];
		 appt1.setRecurrence(recurDays1, 11, 12, 13);
		 CalendarUtil.DaysInMonth = appt1.getRecurDays();
		 assertEquals(11, appt1.getRecurBy());
		 assertEquals(12, appt1.getRecurIncrement());
		 assertEquals(13, appt1.getRecurNumber());
		 assertTrue(appt1.isRecurring());
		 
		 
	 }


	 
}
