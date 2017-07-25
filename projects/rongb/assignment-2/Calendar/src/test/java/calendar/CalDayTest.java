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

import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;



@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 

public class CalDayTest {

	  @Test (timeout = 4000)
	  public void test01()  throws Throwable  {
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(2, 2, 2, 2, 2, 2);
	      CalDay calDay0 = new CalDay(GregorianCalendar0);
	      Appt appt0 = new Appt(2, 2, 2, 2, 2, "", "");
	      Appt appt1 = new Appt(1, 1, 5, 2, 0, " ,", "");
	      calDay0.addAppt(appt1);
	      calDay0.addAppt(appt0);
	      assertEquals(1, calDay0.getSizeAppts());	      
	  }

	  @Test (timeout = 4000)
	  public void test02()  throws Throwable  {
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, (-1), 0, (-261), 0, (-1854));
	      CalDay calDay0 = new CalDay(GregorianCalendar0);
	      assertNotNull(calDay0.iterator());
	  }

	  @Test (timeout = 4000)
	  public void test03()  throws Throwable  {
	      CalDay calDay0 = new CalDay();
	      assertFalse(calDay0.isValid());
	      calDay0.year = 0;
	      assertEquals(0, calDay0.getYear());
	      calDay0.month = 1;
	      assertEquals(1, calDay0.getMonth());
	      calDay0.day = 2;
	      assertEquals(1, calDay0.getDay());
	  }

	  @Test (timeout = 4000)
	  public void test04()  throws Throwable  {
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, 0, (-220));
	      CalDay calDay0 = new CalDay(GregorianCalendar0);
	      assertTrue(calDay0.isValid());
	      calDay0.year = 3000;
	      assertEquals(3000, calDay0.getYear());
	      calDay0.month = 0;
	      assertEquals(0, calDay0.getMonth());
	      calDay0.day = 0;
	      assertEquals(0, calDay0.getDay());
	  }

	  @Test (timeout = 4000)
	  public void test05()  throws Throwable  {
	      CalDay calDay0 = new CalDay();
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      calDay0.appts = linkedList0;
	      Appt appt0 = new Appt((-74), 0, (-938), 0, 24, "", "vtTj-2b|n)x@S^a");
	      assertFalse(appt0.getValid());
	      linkedList0.addFirst(appt0);
	      assertEquals(0, calDay0.getSizeAppts());
	  }

	  @Test (timeout = 4000)
	  public void test06()  throws Throwable  {
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, (-1), 0, (-261), 0, (-1854));
	      CalDay calDay0 = new CalDay(GregorianCalendar0);
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      calDay0.appts = linkedList0;
	      Appt appt0 = new Appt((-1), 2, 1, 1, (-1), "\t --- 0/0/1 --- \n --- -------- Appointments ------------ --- \n\n", "Pvj'_Lax;!");
	      assertFalse(appt0.getValid());
	      linkedList0.add(appt0);
	      linkedList0.offerFirst((Appt) null);
	      assertEquals(1, calDay0.getSizeAppts());
	  }

	  @Test (timeout = 4000)
	  public void test07()  throws Throwable  {
	      TimeZone timeZone0 = TimeZone.getTimeZone("calendar.Appt");
	      Locale locale0 = Locale.GERMAN;
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(timeZone0, locale0);
	      CalDay calDay0 = new CalDay(GregorianCalendar0);
	      calDay0.year = 3500;
	      assertEquals(3500, calDay0.getYear());
	      calDay0.month = 0;
	      assertEquals(0, calDay0.getMonth());
	      calDay0.day = 0;
	      assertEquals(0, calDay0.getDay());	      
	  }

	  @Test (timeout = 4000)
	  public void test08()  throws Throwable  {
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, (-1), 0, (-261), 0, (-1854));
	      CalDay calDay0 = new CalDay(GregorianCalendar0);
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      calDay0.appts = linkedList0;
	      Appt appt0 = new Appt((-1), 2, 1, 1, (-1), "\t --- 0/0/1 --- \n --- -------- Appointments ------------ --- \n\n", "Pvj'_Lax;!");
	      linkedList0.add(appt0);
	      assertNotNull(calDay0.getAppts());
	      assertEquals(0, calDay0.getSizeAppts());
	      String string0 = calDay0.toString();
	      assertEquals("\t --- 10/10/2 --- \n --- -------- Appointments ------------ --- \nnull \n", string0);
	  }

	  @Test (timeout = 4000)
	  public void test09()  throws Throwable  {
	      CalDay calDay0 = new CalDay();
	      // Undeclared exception!
	      try { 
	        calDay0.addAppt((Appt) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("calendar.CalDay", e);
	      }
	  }

	  @Test (timeout = 4000)
	  public void test10()  throws Throwable  {
	      CalDay calDay0 = null;
	      try {
	        calDay0 = new CalDay((GregorianCalendar) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("calendar.CalDay", e);
	      }
	  }

	  @Test (timeout = 4000)
	  public void test11()  throws Throwable  {
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, 0, 0, (-2383), 0);
	      GregorianCalendar0.set(0, (-2383));
	      CalDay calDay0 = null;
	      try {
	        calDay0 = new CalDay(GregorianCalendar0);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // Invalid era
	         //
	         verifyException("java.util.GregorianCalendar", e);
	      }
	  }
	  
	  @Test (timeout = 4000)
	  public void test12()  throws Throwable  {
	      CalDay calDay0 = new CalDay();
	      String string0 = calDay0.toString();
	      assertEquals("", string0);
	  }	  

	  @Test (timeout = 4000)
	  public void test13()  throws Throwable  {
	      CalDay calDay0 = new CalDay();
	      calDay0.valid = true;
	      // Undeclared exception!
	      try { 
	        calDay0.iterator();
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("calendar.CalDay", e);
	      }
	  }

	  @Test (timeout = 4000)
	  public void test14()  throws Throwable  {
	      CalDay calDay0 = new CalDay();
	      Iterator<?> iterator0 = calDay0.iterator();
	      assertNull(iterator0);
	  }
	  
	  @Test (timeout = 4000)
	  public void test15()  throws Throwable  {
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(2, 2, 2, 2, 2, 2);
	      CalDay calDay0 = new CalDay(GregorianCalendar0);
	      Appt appt0 = new Appt(2, 2, 2, 4, 5, "", "");
	      calDay0.addAppt(appt0);
	      Appt appt1 = new Appt(1, 1, 5, 3, 0, " ,", "");
	      calDay0.addAppt(appt1);
	      assertEquals(2, calDay0.getMonth());
	      assertTrue(calDay0.isValid());
	      assertEquals(2, calDay0.getYear());
	  }

	  @Test (timeout = 4000)
	  public void test16()  throws Throwable  {
	      CalDay calDay0 = new CalDay();
	      Appt appt0 = new Appt((-74), 0, (-938), 0, 24, "", "vtTj-2b|n)x@S^a");
	      calDay0.addAppt(appt0);
	      assertFalse(calDay0.isValid());
	  }

	  @Test (timeout = 4000)
	  public void test17()  throws Throwable  {
	      CalDay calDay0 = new CalDay();
	      calDay0.valid = true;
	      // Undeclared exception!
	      try { 
	        calDay0.toString();
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("calendar.CalDay", e);
	      }
	  }

	  @Test (timeout = 4000)
	  public void test18()  throws Throwable  {
	      CalDay calDay0 = new CalDay();
	      // Undeclared exception!
	      try { 
	        calDay0.getSizeAppts();
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("calendar.CalDay", e);
	      }
	  }



}



