package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
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




public class CalDayTest {
	
	private static Appt appt0 = new Appt(2, 2, 2, 2, 2, "", "");
	private static Appt appt1 = new Appt(0, 0, 1, 1, 0, null, null);
	private static Appt appt2 = new Appt(10, 20, 30, 0, 0, "3", "3");
	private static Appt appt3 = new Appt((-74), 0, (-938), 0, 24, "", "vtTj-2b|n)x@S^a");
	private static Appt appt4 = new Appt(4, 4, 4, 4, 4, ",", "4");


	  @Test (timeout = 4000)
	  public void test01()  throws Throwable  {			 
		  GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, 0, 0, 0, 0, 0);
		  CalDay calDay0 = new CalDay(GregorianCalendar0);		  
		  assertTrue(calDay0.isValid());
		  Iterator<?> iterator0 = calDay0.iterator();
		  assertNotNull(iterator0);
		  LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		  calDay0.appts = linkedList0;
		  linkedList0.add(appt0);
		  
		  calDay0.addAppt(appt0);
		  assertTrue(appt1.getValid());
		  calDay0.getAppts();
		  calDay0.getAppts().add(1, appt1);
		  calDay0.getSizeAppts();
		  calDay0.getYear();
		  calDay0.getMonth();
		  calDay0.getDay();
		  
		  calDay0.addAppt(appt1);
		  calDay0.getAppts().add(2, appt1);
		  calDay0.addAppt(appt4);
		  calDay0.getAppts().add(3, appt1);
		  
		  calDay0.addAppt(appt2);
		  assertFalse(appt2.getValid());
		  calDay0.getAppts();
		  calDay0.getAppts().add(4, appt2);
		  calDay0.getSizeAppts();
		  calDay0.getYear();
		  calDay0.getMonth();
		  calDay0.getDay();
		  
		  calDay0.addAppt(appt3);
		  assertFalse(appt3.getValid());
		  calDay0.getAppts();
		  calDay0.getAppts().add(5, appt3);
		  calDay0.getSizeAppts();
		  calDay0.getYear();
		  calDay0.getMonth();
		  calDay0.getDay();
		  		  
		  
		  calDay0.day = 10;
		  calDay0.month = 20;
		  calDay0.year = 30;
		  
		  
	  }
	  
	  @Test (timeout = 4000)
	  public void test02()  throws Throwable  {			 
		  GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, 0, 0, 0, 0, 0);
		  CalDay calDay0 = new CalDay(GregorianCalendar0);
		  calDay0.addAppt(appt0);
		  calDay0.addAppt(appt1);
		  
		  CalDay calDay1 = new CalDay();
		  String string1 = calDay1.toString();
		  
		  String string0 = calDay0.toString();
		  
		  assertNotEquals(string1, string0);

	  }

	  @Test (timeout = 4000)
	  public void test03()  throws Throwable  {			 
		  GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, 0, 0, 0, 0, 0);
		  CalDay calDay0 = new CalDay(GregorianCalendar0);
		  
		  int sizeAppts = calDay0.getSizeAppts();
		  int thisYear = calDay0.getYear();
		  int thisMonth = calDay0.getMonth();
		  int thisDay = calDay0.getDay();
		  
		  
		  assertNotEquals(0, sizeAppts);
		  assertNotEquals(0, thisYear);
		  assertNotEquals(0, thisMonth);
		  assertNotEquals(0, thisDay);

	  }

	  @Test (timeout = 4000)
	  public void test04()  throws Throwable  {		  		  
		  CalDay calDay0 = new CalDay();
		  assertFalse(calDay0.isValid());
		  Iterator<?> iterator0 = calDay0.iterator();
		  assertNull(iterator0);
	  }
	  
	  @Test (timeout = 4000)
	  public void test05()  throws Throwable  {
		  int year = 0;
		  int month = 0;
		  int dayofmonth = 0;
		  int hourofday = 0;
		  int minute = 0;
		  int second = 0;
		  GregorianCalendar GregorianCalendar0 = new GregorianCalendar(year, month, dayofmonth, hourofday, minute, second);
		  CalDay calDay0 = new CalDay(GregorianCalendar0);
		  calDay0.addAppt(appt0);
		  calDay0.addAppt(appt1);
		  
		  Iterator<?> iterator0 = calDay0.iterator();
		  assertNotNull(iterator0);
	  }
	  	  
	  @Test (timeout = 4000)
	  public void test06()  throws Throwable  {	      
	      LinkedList<GregorianCalendar> linkedList0 = new LinkedList<GregorianCalendar>();
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(3285, 0, 3685, 2, 1);
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      GregorianCalendar GregorianCalendar1 = new GregorianCalendar(locale0);
	      linkedList0.add(GregorianCalendar0);
	      linkedList0.add(GregorianCalendar1);
		  
		  Iterator<GregorianCalendar> iterator1 = linkedList0.iterator();
		  
	  }
	  
	  @Test (timeout = 4000)
	  public void test07()  throws Throwable  {	  
		  CalDay calDay0 = new CalDay();
		  LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		  calDay0.appts = linkedList0;
		  calDay0.getSizeAppts();
		  
		  linkedList0.addFirst(appt3);
		  calDay0.getSizeAppts();

	  }
	  
	  @Test (timeout = 4000)
	  public void test08()  throws Throwable  {	  
		  CalDay calDay0 = new CalDay();
		  LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		  calDay0.appts = linkedList0;
		  calDay0.getSizeAppts();
		  
		  linkedList0.addLast(appt3);
		  calDay0.getSizeAppts();

	  }
	  
	  
}



