package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
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

import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;



@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)

public class TimeTableTest {
	
	  @Test (timeout = 4000)
	  public void test01()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      Appt appt0 = new Appt(2, 2488, 2, 2, 1, "Lv2*_", "Lv2*_");
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurNumber());
	      assertFalse(appt0.isRecurring());
	      assertFalse(appt0.getValid());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertNotNull(appt0);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      boolean boolean0 = linkedList0.add(appt0);
	      assertEquals(1, linkedList0.size());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurNumber());
	      assertFalse(appt0.isRecurring());
	      assertFalse(appt0.getValid());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertTrue(boolean0);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      int[] intArray0 = new int[9];
	      intArray0[2] = 2488;
	      appt0.setRecurrence(intArray0, 1, 0, 2);
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartMonth());
	      assertTrue(appt0.isRecurring());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(1, appt0.getRecurBy());
	      assertEquals(2, appt0.getRecurNumber());
	      assertFalse(appt0.getValid());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertArrayEquals(new int[] {0, 0, 2488, 0, 0, 0, 0, 0, 0}, intArray0);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      appt0.setStartMinute(2);
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartMonth());
	      assertTrue(appt0.isRecurring());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(2, appt0.getStartDay());
	      assertTrue(appt0.getValid());
	      assertEquals(1, appt0.getRecurBy());
	      assertEquals(2, appt0.getStartMinute());
	      assertEquals(2, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3285, 0, 3685, 2, 1);
	      assertTrue(mockGregorianCalendar0.isLenient());
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=3285,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=3685,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
	      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
	      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
	      assertNotNull(mockGregorianCalendar0);
	      
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      assertEquals("TW", locale0.getCountry());
	      assertEquals("", locale0.getVariant());
	      assertEquals("TWN", locale0.getISO3Country());
	      assertEquals("zh", locale0.getLanguage());
	      assertEquals("zho", locale0.getISO3Language());
	      assertEquals("zh_TW", locale0.toString());
	      assertNotNull(locale0);
	      
	      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
	      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
	      assertEquals("TW", locale0.getCountry());
	      assertEquals("", locale0.getVariant());
	      assertEquals("TWN", locale0.getISO3Country());
	      assertEquals("zh", locale0.getLanguage());
	      assertEquals("zho", locale0.getISO3Language());
	      assertEquals("zh_TW", locale0.toString());
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
	      assertEquals(1, mockGregorianCalendar1.getFirstDayOfWeek());
	      assertEquals(1, mockGregorianCalendar1.getMinimalDaysInFirstWeek());
	      assertTrue(mockGregorianCalendar1.isLenient());
	      assertNotNull(mockGregorianCalendar1);
	      
	      // Undeclared exception!
	      try { 
	        timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }


	  @Test (timeout = 4000)
	  public void test02()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      Appt appt0 = new Appt(2, 2488, 2, 2, 1, "Lv2*_", "Lv2*_");
	      assertEquals(2, appt0.getStartHour());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertFalse(appt0.isRecurring());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertNotNull(appt0);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      
	      boolean boolean0 = linkedList0.add(appt0);
	      assertEquals(1, linkedList0.size());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertFalse(appt0.isRecurring());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertTrue(boolean0);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      
	      int[] intArray0 = new int[9];
	      appt0.setRecurrence(intArray0, (-2075), 0, (-2886));
	      assertEquals(2, appt0.getStartHour());
	      assertEquals(1, appt0.getStartYear());
	      assertFalse(appt0.getValid());
	      assertEquals((-2075), appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals((-2886), appt0.getRecurNumber());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertTrue(appt0.isRecurring());
	      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      
	      appt0.setStartMinute(2);
	      assertEquals(2, appt0.getStartHour());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals((-2075), appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(2, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartMonth());
	      assertTrue(appt0.getValid());
	      assertEquals((-2886), appt0.getRecurNumber());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertTrue(appt0.isRecurring());
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      
	      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3285, 0, 3685, 2, 1);
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=3285,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=3685,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
	      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
	      assertTrue(mockGregorianCalendar0.isLenient());
	      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
	      assertNotNull(mockGregorianCalendar0);
	      
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      assertEquals("TW", locale0.getCountry());
	      assertEquals("zh_TW", locale0.toString());
	      assertEquals("zho", locale0.getISO3Language());
	      assertEquals("", locale0.getVariant());
	      assertEquals("zh", locale0.getLanguage());
	      assertEquals("TWN", locale0.getISO3Country());
	      assertNotNull(locale0);
	      
	      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
	      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
	      assertEquals("TW", locale0.getCountry());
	      assertEquals("zh_TW", locale0.toString());
	      assertEquals("zho", locale0.getISO3Language());
	      assertEquals("", locale0.getVariant());
	      assertEquals("zh", locale0.getLanguage());
	      assertEquals("TWN", locale0.getISO3Country());
	      assertEquals(1, mockGregorianCalendar1.getFirstDayOfWeek());
	      assertEquals(1, mockGregorianCalendar1.getMinimalDaysInFirstWeek());
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
	      assertTrue(mockGregorianCalendar1.isLenient());
	      assertNotNull(mockGregorianCalendar1);
	      
	      LinkedList<CalDay> linkedList1 = timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
	      assertFalse(mockGregorianCalendar0.equals((Object)mockGregorianCalendar1));
	      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
	      assertEquals(1, linkedList0.size());
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=3285,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=3685,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
	      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
	      assertTrue(mockGregorianCalendar0.isLenient());
	      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
	      assertEquals("TW", locale0.getCountry());
	      assertEquals("zh_TW", locale0.toString());
	      assertEquals("zho", locale0.getISO3Language());
	      assertEquals("", locale0.getVariant());
	      assertEquals("zh", locale0.getLanguage());
	      assertEquals("TWN", locale0.getISO3Country());
	      assertEquals(1, mockGregorianCalendar1.getFirstDayOfWeek());
	      assertEquals(1, mockGregorianCalendar1.getMinimalDaysInFirstWeek());
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
	      assertTrue(mockGregorianCalendar1.isLenient());
	      assertEquals(1, linkedList1.size());
	      assertNotNull(linkedList1);
	      assertNotSame(mockGregorianCalendar0, mockGregorianCalendar1);
	      assertNotSame(mockGregorianCalendar1, mockGregorianCalendar0);
	  }

	  @Test (timeout = 4000)
	  public void test03()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      // Undeclared exception!
	      try { 
	        timeTable0.permute((LinkedList<Appt>) null, (int[]) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("java.util.LinkedList", e);
	      }
	  }

	  @Test (timeout = 4000)
	  public void test04()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      Appt appt0 = new Appt(3285, 2488, 2, 2, 1, "Lv2*_", "Lv2*_");
	      assertEquals(2, appt0.getStartDay());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(3285, appt0.getStartHour());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertFalse(appt0.isRecurring());
	      assertNotNull(appt0);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      
	      boolean boolean0 = linkedList0.add(appt0);
	      assertEquals(1, linkedList0.size());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(3285, appt0.getStartHour());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertFalse(appt0.isRecurring());
	      assertTrue(boolean0);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      
	      int[] intArray0 = new int[3];
	      intArray0[0] = 1;
	      // Undeclared exception!
	      try { 
	        timeTable0.permute(linkedList0, intArray0);
	        fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // Index: 1, Size: 1
	         //
	         verifyException("java.util.LinkedList", e);
	      }
	  }

	  @Test (timeout = 4000)
	  public void test05()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      Appt appt0 = new Appt(1, 2488, 2, 2, 1, "Lv2*_", "Lv2*_");
	      assertFalse(appt0.isRecurring());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertNotNull(appt0);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      boolean boolean0 = linkedList0.add(appt0);
	      assertEquals(1, linkedList0.size());
	      assertFalse(appt0.isRecurring());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertTrue(boolean0);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      boolean boolean1 = linkedList0.add(appt0);
	      assertTrue(boolean1 == boolean0);
	      assertEquals(2, linkedList0.size());
	      assertFalse(appt0.isRecurring());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertTrue(boolean1);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      boolean boolean2 = linkedList0.add(appt0);
	      assertTrue(boolean2 == boolean0);
	      assertTrue(boolean2 == boolean1);
	      assertEquals(3, linkedList0.size());
	      assertFalse(appt0.isRecurring());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertTrue(boolean2);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      boolean boolean3 = linkedList0.add(appt0);
	      assertTrue(boolean3 == boolean1);
	      assertTrue(boolean3 == boolean0);
	      assertTrue(boolean3 == boolean2);
	      assertEquals(4, linkedList0.size());
	      assertFalse(appt0.isRecurring());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertTrue(boolean3);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      int[] intArray0 = new int[3];
	      intArray0[0] = 1;
	      intArray0[1] = 3;
	      // Undeclared exception!
	      try { 
	        timeTable0.permute(linkedList0, intArray0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 3
	         //
	         verifyException("calendar.TimeTable", e);
	      }
	  }

	  @Test (timeout = 4000)
	  public void test06()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(8, 8, 1522, 1522, 1522);
	      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
	      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=8,MONTH=8,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1522,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1522,HOUR_OF_DAY=1522,MINUTE=1522,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
	      assertTrue(mockGregorianCalendar0.isLenient());
	      assertNotNull(mockGregorianCalendar0);
	      
	      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
	      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
	      assertTrue(mockGregorianCalendar1.isLenient());
	      assertEquals(1, mockGregorianCalendar1.getMinimalDaysInFirstWeek());
	      assertEquals(1, mockGregorianCalendar1.getFirstDayOfWeek());
	      assertNotNull(mockGregorianCalendar1);
	      
	      // Undeclared exception!
	      timeTable0.getApptRange((LinkedList<Appt>) null, mockGregorianCalendar0, mockGregorianCalendar1);
	      
	  }

	  @Test (timeout = 4000)
	  public void test07()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3285, 0, 3685, 2, 1);
	      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
	      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
	      assertTrue(mockGregorianCalendar0.isLenient());
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=3285,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=3685,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
	      assertNotNull(mockGregorianCalendar0);
	      
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      assertEquals("", locale0.getVariant());
	      assertEquals("zh_TW", locale0.toString());
	      assertEquals("TW", locale0.getCountry());
	      assertEquals("zho", locale0.getISO3Language());
	      assertEquals("TWN", locale0.getISO3Country());
	      assertEquals("zh", locale0.getLanguage());
	      assertNotNull(locale0);
	      
	      mockGregorianCalendar0.set(0, 5);
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=5,YEAR=3285,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=3685,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
	      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
	      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
	      assertTrue(mockGregorianCalendar0.isLenient());
	      
	      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
	      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
	      assertEquals("", locale0.getVariant());
	      assertEquals("zh_TW", locale0.toString());
	      assertEquals("TW", locale0.getCountry());
	      assertEquals("zho", locale0.getISO3Language());
	      assertEquals("TWN", locale0.getISO3Country());
	      assertEquals("zh", locale0.getLanguage());
	      assertEquals(1, mockGregorianCalendar1.getFirstDayOfWeek());
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
	      assertEquals(1, mockGregorianCalendar1.getMinimalDaysInFirstWeek());
	      assertTrue(mockGregorianCalendar1.isLenient());
	      assertNotNull(mockGregorianCalendar1);
	      
	      // Undeclared exception!
	      try { 
	        timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // Invalid era
	         //
	         verifyException("java.util.GregorianCalendar", e);
	      }
	  }

	  @Test (timeout = 4000)
	  public void test08()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      int[] intArray0 = new int[1];
	      LinkedList<Appt> linkedList1 = timeTable0.permute(linkedList0, intArray0);
	      assertTrue(linkedList1.equals((Object)linkedList0));
	      assertEquals(0, linkedList0.size());
	      assertEquals(0, linkedList1.size());
	      assertArrayEquals(new int[] {0}, intArray0);
	      assertNotNull(linkedList1);
	      assertNotSame(linkedList0, linkedList1);
	      assertNotSame(linkedList1, linkedList0);
	  }

//add more unit tests as you needed
	  
	  @Test (timeout = 4000)
	  public void test09()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      Appt appt0 = new Appt(1, 1, 1, 1, 1, "Lv2*_", "Lv2*_");
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(1, appt0.getStartDay());
	      assertFalse(appt0.isRecurring());
	      assertEquals(1, appt0.getStartMonth());
	      assertTrue(appt0.getValid());
	      assertEquals(1, appt0.getStartMinute());
	      assertNotNull(appt0);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      
	      boolean boolean0 = linkedList0.add(appt0);
	      assertEquals(1, linkedList0.size());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(1, appt0.getStartDay());
	      assertFalse(appt0.isRecurring());
	      assertEquals(1, appt0.getStartMonth());
	      assertTrue(appt0.getValid());
	      assertEquals(1, appt0.getStartMinute());
	      assertTrue(boolean0);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      
	      boolean boolean1 = linkedList0.add(appt0);
	      assertTrue(boolean1 == boolean0);
	      assertEquals(2, linkedList0.size());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(1, appt0.getStartDay());
	      assertFalse(appt0.isRecurring());
	      assertEquals(1, appt0.getStartMonth());
	      assertTrue(appt0.getValid());
	      assertEquals(1, appt0.getStartMinute());
	      assertTrue(boolean1);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      
	      boolean boolean2 = linkedList0.add(appt0);
	      assertTrue(boolean2 == boolean0);
	      assertTrue(boolean2 == boolean1);
	      assertEquals(3, linkedList0.size());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(1, appt0.getStartDay());
	      assertFalse(appt0.isRecurring());
	      assertEquals(1, appt0.getStartMonth());
	      assertTrue(appt0.getValid());
	      assertEquals(1, appt0.getStartMinute());
	      assertTrue(boolean2);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      
	      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt0);
	      assertEquals(2, linkedList0.size());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(1, appt0.getStartDay());
	      assertFalse(appt0.isRecurring());
	      assertEquals(1, appt0.getStartMonth());
	      assertTrue(appt0.getValid());
	      assertEquals(1, appt0.getStartMinute());
	      assertEquals(2, linkedList1.size());
	      assertNotNull(linkedList1);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertSame(linkedList0, linkedList1);
	      assertSame(linkedList1, linkedList0);
	  }
	  
	  @Test (timeout = 4000)
	  public void test10()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      Appt appt0 = new Appt(1, 2488, 0, 1, 1, "L2*", "L2*");
	      assertFalse(appt0.isRecurring());
	      assertEquals("L2*", appt0.getDescription());
	      assertEquals("L2*", appt0.getTitle());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(1, appt0.getStartMonth());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(1, appt0.getStartYear());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getStartDay());
	      assertNotNull(appt0);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      boolean boolean0 = linkedList0.add(appt0);
	      assertEquals(1, linkedList0.size());
	      assertFalse(appt0.isRecurring());
	      assertEquals("L2*", appt0.getDescription());
	      assertEquals("L2*", appt0.getTitle());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(1, appt0.getStartMonth());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(1, appt0.getStartYear());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getStartDay());
	      assertTrue(boolean0);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      boolean boolean1 = linkedList0.add(appt0);
	      assertTrue(boolean1 == boolean0);
	      assertEquals(2, linkedList0.size());
	      assertFalse(appt0.isRecurring());
	      assertEquals("L2*", appt0.getDescription());
	      assertEquals("L2*", appt0.getTitle());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(1, appt0.getStartMonth());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(1, appt0.getStartYear());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getStartDay());
	      assertTrue(boolean1);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      Appt appt1 = new Appt(1, 1, 1, 1, 0, "L2*", "L2*");
	      assertFalse(appt1.equals((Object)appt0));
	      assertEquals("L2*", appt1.getTitle());
	      assertTrue(appt1.getValid());
	      assertEquals(1, appt1.getStartDay());
	      assertEquals(1, appt1.getStartMonth());
	      assertEquals(1, appt1.getStartHour());
	      assertEquals(0, appt1.getRecurNumber());
	      assertEquals(0, appt1.getStartYear());
	      assertEquals(2, appt1.getRecurBy());
	      assertEquals("L2*", appt1.getDescription());
	      assertEquals(0, appt1.getRecurIncrement());
	      assertFalse(appt1.isRecurring());
	      assertEquals(1, appt1.getStartMinute());
	      assertNotNull(appt1);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      
	      boolean boolean2 = linkedList0.add(appt0);
	      assertFalse(appt0.equals((Object)appt1));
	      assertTrue(boolean2 == boolean1);
	      assertTrue(boolean2 == boolean0);
	      assertEquals(3, linkedList0.size());
	      assertFalse(appt0.isRecurring());
	      assertEquals("L2*", appt0.getDescription());
	      assertEquals("L2*", appt0.getTitle());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(1, appt0.getStartMonth());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(1, appt0.getStartYear());
	      assertFalse(appt0.getValid());
	      assertEquals(0, appt0.getStartDay());
	      assertTrue(boolean2);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertNotSame(appt0, appt1);
	      
	      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt1);
	      assertFalse(appt1.equals((Object)appt0));
	      assertEquals(3, linkedList0.size());
	      assertEquals("L2*", appt1.getTitle());
	      assertTrue(appt1.getValid());
	      assertEquals(1, appt1.getStartDay());
	      assertEquals(1, appt1.getStartMonth());
	      assertEquals(1, appt1.getStartHour());
	      assertEquals(0, appt1.getRecurNumber());
	      assertEquals(0, appt1.getStartYear());
	      assertEquals(2, appt1.getRecurBy());
	      assertEquals("L2*", appt1.getDescription());
	      assertEquals(0, appt1.getRecurIncrement());
	      assertFalse(appt1.isRecurring());
	      assertEquals(1, appt1.getStartMinute());
	      assertNull(linkedList1);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertNotSame(appt1, appt0);
	  }
	  
	  @Test (timeout = 4000)
	  public void test11()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      Appt appt0 = new Appt(2, 1, 1, 1, 2, "L2*", "L2*");
	      assertEquals(1, appt0.getStartDay());
	      assertEquals(2, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals("L2*", appt0.getDescription());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals("L2*", appt0.getTitle());
	      assertFalse(appt0.isRecurring());
	      assertEquals(1, appt0.getStartMonth());
	      assertEquals(2, appt0.getRecurBy());
	      assertTrue(appt0.getValid());
	      assertEquals(1, appt0.getStartMinute());
	      assertNotNull(appt0);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      
	      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt0);
	      assertEquals(0, linkedList0.size());
	      assertEquals(1, appt0.getStartDay());
	      assertEquals(2, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals("L2*", appt0.getDescription());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals("L2*", appt0.getTitle());
	      assertFalse(appt0.isRecurring());
	      assertEquals(1, appt0.getStartMonth());
	      assertEquals(2, appt0.getRecurBy());
	      assertTrue(appt0.getValid());
	      assertEquals(1, appt0.getStartMinute());
	      assertNull(linkedList1);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	  }
	  
	  @Test (timeout = 4000)
	  public void test12()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, (Appt) null);
	      assertEquals(0, linkedList0.size());
	      assertNull(linkedList1);
	  }
	  
	  @Test (timeout = 4000)
	  public void test13()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      Appt appt0 = new Appt(1, 2488, 2, 2, 1, "Lv2*_", "Lv2*_");
	      assertFalse(appt0.getValid());
	      assertFalse(appt0.isRecurring());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertNotNull(appt0);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      
	      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt0);
	      assertEquals(0, linkedList0.size());
	      assertFalse(appt0.getValid());
	      assertFalse(appt0.isRecurring());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(1, appt0.getStartHour());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(1, appt0.getStartYear());
	      assertNull(linkedList1);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	  }
	  
	  @Test (timeout = 4000)
	  public void test14()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      Appt appt0 = new Appt(7, 7, 7, 7, 7, "t>^Ppz%kg3", "t>^Ppz%kg3");
	      assertEquals(7, appt0.getStartDay());
	      assertEquals("t>^Ppz%kg3", appt0.getDescription());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(7, appt0.getStartMonth());
	      assertTrue(appt0.getValid());
	      assertFalse(appt0.isRecurring());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals("t>^Ppz%kg3", appt0.getTitle());
	      assertEquals(7, appt0.getStartYear());
	      assertEquals(7, appt0.getStartMinute());
	      assertEquals(7, appt0.getStartHour());
	      assertNotNull(appt0);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      
	      LinkedList<Appt> linkedList0 = timeTable0.deleteAppt((LinkedList<Appt>) null, appt0);
	      assertEquals(7, appt0.getStartDay());
	      assertEquals("t>^Ppz%kg3", appt0.getDescription());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(7, appt0.getStartMonth());
	      assertTrue(appt0.getValid());
	      assertFalse(appt0.isRecurring());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals("t>^Ppz%kg3", appt0.getTitle());
	      assertEquals(7, appt0.getStartYear());
	      assertEquals(7, appt0.getStartMinute());
	      assertEquals(7, appt0.getStartHour());
	      assertNull(linkedList0);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	  }
	  
	  @Test (timeout = 4000)
	  public void test15()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      Appt appt0 = new Appt(2, 2488, 2, 2, 1, "Lv2*_", "Lv2*_");
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2, appt0.getStartMonth());
	      assertFalse(appt0.isRecurring());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertFalse(appt0.getValid());
	      assertEquals(2488, appt0.getStartMinute());
	      assertNotNull(appt0);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      
	      boolean boolean0 = linkedList0.add(appt0);
	      assertEquals(1, linkedList0.size());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2, appt0.getStartMonth());
	      assertFalse(appt0.isRecurring());
	      assertEquals(2, appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertFalse(appt0.getValid());
	      assertEquals(2488, appt0.getStartMinute());
	      assertTrue(boolean0);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      
	      int[] intArray0 = new int[9];
	      intArray0[1] = 1;
	      appt0.setRecurrence(intArray0, 1, 0, 2);
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(1, appt0.getRecurBy());
	      assertEquals(2, appt0.getRecurNumber());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertTrue(appt0.isRecurring());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertFalse(appt0.getValid());
	      assertEquals(2488, appt0.getStartMinute());
	      assertArrayEquals(new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0}, intArray0);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      
	      appt0.setStartMinute(2);
	      assertTrue(appt0.getValid());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(1, appt0.getRecurBy());
	      assertEquals(2, appt0.getRecurNumber());
	      assertEquals(2, appt0.getStartMinute());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertTrue(appt0.isRecurring());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      
	      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3285, 0, 3685, 2, 1);
	//      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=3285,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=3685,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
	      assertTrue(mockGregorianCalendar0.isLenient());
	      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
	      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
	      assertNotNull(mockGregorianCalendar0);
	      
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      assertEquals("TWN", locale0.getISO3Country());
	      assertEquals("zh", locale0.getLanguage());
	      assertEquals("", locale0.getVariant());
	      assertEquals("TW", locale0.getCountry());
	      assertEquals("zho", locale0.getISO3Language());
	      assertEquals("zh_TW", locale0.toString());
	      assertNotNull(locale0);
	      
	      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
	      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
	      assertEquals("TWN", locale0.getISO3Country());
	      assertEquals("zh", locale0.getLanguage());
	      assertEquals("", locale0.getVariant());
	      assertEquals("TW", locale0.getCountry());
	      assertEquals("zho", locale0.getISO3Language());
	      assertEquals("zh_TW", locale0.toString());
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
	      assertEquals(1, mockGregorianCalendar1.getFirstDayOfWeek());
	      assertEquals(1, mockGregorianCalendar1.getMinimalDaysInFirstWeek());
	      assertTrue(mockGregorianCalendar1.isLenient());
	      assertNotNull(mockGregorianCalendar1);
	      
	      // Undeclared exception!
	      try { 
	        timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test (timeout = 4000)
	  public void test16()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      Appt appt0 = new Appt(2, 2488, 2, 2, 1, "Lv2*_", "Lv2*_");
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(2, appt0.getRecurBy());
	      assertFalse(appt0.isRecurring());
	      assertFalse(appt0.getValid());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(2, appt0.getStartDay());
	      assertNotNull(appt0);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      boolean boolean0 = linkedList0.add(appt0);
	      assertEquals(1, linkedList0.size());
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartMonth());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(0, appt0.getRecurNumber());
	      assertEquals(2, appt0.getRecurBy());
	      assertFalse(appt0.isRecurring());
	      assertFalse(appt0.getValid());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(2, appt0.getStartDay());
	      assertTrue(boolean0);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      int[] intArray0 = new int[9];
	      appt0.setRecurrence(intArray0, (-2075), 0, 2);
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartMonth());
	      assertTrue(appt0.isRecurring());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(2488, appt0.getStartMinute());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(2, appt0.getRecurNumber());
	      assertEquals((-2075), appt0.getRecurBy());
	      assertFalse(appt0.getValid());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(2, appt0.getStartDay());
	      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      appt0.setStartMinute(2);
	      assertEquals("Lv2*_", appt0.getDescription());
	      assertEquals(2, appt0.getStartMonth());
	      assertTrue(appt0.isRecurring());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertEquals(2, appt0.getStartHour());
	      assertEquals(1, appt0.getStartYear());
	      assertEquals(2, appt0.getRecurNumber());
	      assertTrue(appt0.getValid());
	      assertEquals(2, appt0.getStartMinute());
	      assertEquals((-2075), appt0.getRecurBy());
	      assertEquals("Lv2*_", appt0.getTitle());
	      assertEquals(2, appt0.getStartDay());
	      assertEquals(0, Appt.RECUR_NUMBER_NEVER);
	      assertEquals(3, Appt.RECUR_BY_YEARLY);
	      assertEquals(1000, Appt.RECUR_NUMBER_FOREVER);
	      assertEquals(2, Appt.RECUR_BY_MONTHLY);
	      assertEquals(1, Appt.RECUR_BY_WEEKLY);
	      
	      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3285, 0, 3685, 2, 1);
	      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
	      assertTrue(mockGregorianCalendar0.isLenient());
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=3285,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=3685,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
	      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
	      assertNotNull(mockGregorianCalendar0);
	      
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      assertEquals("zho", locale0.getISO3Language());
	      assertEquals("TW", locale0.getCountry());
	      assertEquals("zh_TW", locale0.toString());
	      assertEquals("TWN", locale0.getISO3Country());
	      assertEquals("", locale0.getVariant());
	      assertEquals("zh", locale0.getLanguage());
	      assertNotNull(locale0);
	      
	      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
	      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
	      assertEquals("zho", locale0.getISO3Language());
	      assertEquals("TW", locale0.getCountry());
	      assertEquals("zh_TW", locale0.toString());
	      assertEquals("TWN", locale0.getISO3Country());
	      assertEquals("", locale0.getVariant());
	      assertEquals("zh", locale0.getLanguage());
	      assertTrue(mockGregorianCalendar1.isLenient());
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
	      assertEquals(1, mockGregorianCalendar1.getMinimalDaysInFirstWeek());
	      assertEquals(1, mockGregorianCalendar1.getFirstDayOfWeek());
	      assertNotNull(mockGregorianCalendar1);
	      
	      // Undeclared exception!
	      try { 
	        timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test (timeout = 4000)
	  public void test17()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      Appt appt0 = new Appt(1, 2488, 1, 2, 1, "Lv2*_", "Lv2*_");
	      linkedList0.add(appt0);
	      int[] intArray0 = new int[9];
	      appt0.setRecurrence(intArray0, 2, 0, 1000);
	      appt0.setStartMinute(2);
	      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3285, 0, 3685, 2, 1);
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
	      timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=3285,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=3685,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
	  }

	  @Test (timeout = 4000)
	  public void test18()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      Appt appt0 = new Appt(2, 2488, 2, 2, 1, "Lv2*_", "Lv2*_");
	      linkedList0.add(appt0);
	      appt0.setStartMinute(2);
	      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3285, 0, 3685, 2, 1);
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
	      // Undeclared exception!
	      try { 
	        timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test (timeout = 4000)
	  public void test19()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      Appt appt0 = new Appt(2, 2488, 2, 2, 1, "Lv2*_", "Lv2*_");
	      linkedList0.add(appt0);
	      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3285, 0, 3685, 2, 1);
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
	      LinkedList<CalDay> linkedList1 = timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
//        assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
	      assertEquals(1, linkedList1.size());
//	      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=3285,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=3685,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
	  }

	  @Test (timeout = 4000)
	  public void test20()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      Locale locale0 = Locale.ROOT;
	      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
	      try { 
	        timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar0);
	        fail("Expecting exception: Exception");
	      
	      } catch(Exception e) {
	         //
	         // Second date specified is not  before the first date specified.
	         //
	         verifyException("calendar.TimeTable", e);
	      }
	  }

}
