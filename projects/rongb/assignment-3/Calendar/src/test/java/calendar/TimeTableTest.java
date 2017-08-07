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




public class TimeTableTest {
	
	private static Appt appt0 = new Appt(2, 2488, 2, 2, 1, "Lv2*_", "Lv2*_");
	private static Appt appt1 = new Appt(1, 1, 1, 1, 1, "Lv2*_", "Lv2*_");
	private static Appt appt2 = new Appt(1, 2488, 0, 1, 1, "L2*", "L2*");
	private static Appt appt3 = new Appt(1, 1, 1, 1, 0, "L2*", "L2*");
	private static Appt appt4 = new Appt(2, 1, 1, 1, 2, "L2*", "L2*");
	private static Appt appt5 = new Appt(1, 2488, 2, 2, 1, "Lv2*_", "Lv2*_");
	private static Appt appt6 = new Appt(7, 7, 7, 7, 7, "t>^Ppz%kg3", "t>^Ppz%kg3");
	private static Appt appt7 = new Appt(2, 2488, 2, 2, 1, "Lv2*_", "Lv2*_");
	
	  @Test (timeout = 4000)
	  public void test01()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
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
	      assertTrue(boolean0);
	      
	      int[] intArray0 = new int[9];
	      intArray0[2] = 2488;
	      assertArrayEquals(new int[] {0, 0, 2488, 0, 0, 0, 0, 0, 0}, intArray0);

	      appt0.setRecurrence(intArray0, 1, 0, 2);
	      
	      int startDay = 2;
	      int startHour = 2;
	      int startMinute = 2;
	      int startMonth = 2;
	      int startYear = 2;
	      
	      appt0.setStartDay(startDay);
	      appt0.setStartHour(startHour);
	      appt0.setStartMinute(startMinute);
	      appt0.setStartMonth(startMonth);
	      appt0.setStartYear(startYear);
	      appt0.setTitle("t1");
	      appt0.setDescription("t2");	      
	      
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(3285, 0, 3685, 2, 1);
	      assertTrue(GregorianCalendar0.isLenient());
	      assertNotEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=3285,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=3685,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", GregorianCalendar0.toString());
	      assertEquals(1, GregorianCalendar0.getMinimalDaysInFirstWeek());
	      assertEquals(1, GregorianCalendar0.getFirstDayOfWeek());
	      assertNotNull(GregorianCalendar0);	      
	      
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      assertEquals("TW", locale0.getCountry());
	      assertEquals("", locale0.getVariant());
	      assertEquals("TWN", locale0.getISO3Country());
	      assertEquals("zh", locale0.getLanguage());
	      assertEquals("zho", locale0.getISO3Language());
	      assertEquals("zh_TW", locale0.toString());
	      assertNotNull(locale0);
	      
	      GregorianCalendar GregorianCalendar1 = new GregorianCalendar(locale0);
	      assertFalse(GregorianCalendar1.equals((Object)GregorianCalendar0));
	      assertNotEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", GregorianCalendar1.toString());
	      assertEquals(1, GregorianCalendar1.getFirstDayOfWeek());
	      assertEquals(1, GregorianCalendar1.getMinimalDaysInFirstWeek());
	      assertTrue(GregorianCalendar1.isLenient());
	      assertNotNull(GregorianCalendar1);
	  

	  }

	  @Test (timeout = 4000)
	  public void test02()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);	      

	      int[] intArray0 = new int[9];
	      appt0.setRecurrence(intArray0, (-2075), 0, (-2886));
	      assertEquals((-2075), appt0.getRecurBy());
	      assertEquals(0, appt0.getRecurIncrement());
	      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
	      
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(3285, 0, 3685, 2, 1);
	      
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;	  
	      
	      GregorianCalendar GregorianCalendar1 = new GregorianCalendar(locale0);	  
	      
	      LinkedList<CalDay> linkedList1 = timeTable0.getApptRange(linkedList0, GregorianCalendar1, GregorianCalendar0);
	      assertEquals(0, linkedList0.size());
	      assertNotEquals(0, linkedList1.size());
	      assertFalse(GregorianCalendar0.equals((Object)GregorianCalendar1));
	      assertFalse(GregorianCalendar1.equals((Object)GregorianCalendar0));

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
	         
	      }
	  }
	  
	  @Test (timeout = 4000)
	  public void test04()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	  	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);	  
	      
	      int[] intArray0 = new int[3];
	      intArray0[0] = 1;
	  
	      // Undeclared exception!
	      try { 
	        timeTable0.permute(linkedList0, intArray0);
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // Index: 1, Size: 1
	         //
	         
	      }
	  }
	  
	  @Test (timeout = 4000)
	  public void test05()  throws Throwable  {
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
	  	  
	  @Test (timeout = 4000)
	  public void test06()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      boolean boolean0 = linkedList0.add(appt0);
	      assertEquals(1, linkedList0.size());
	      assertTrue(boolean0);
	      
	      boolean boolean1 = linkedList0.add(appt0);
	      assertTrue(boolean1 == boolean0);
	      assertEquals(2, linkedList0.size());
	      assertTrue(boolean1);
	      
	      boolean boolean2 = linkedList0.add(appt0);
	      assertTrue(boolean2 == boolean0);
	      assertTrue(boolean2 == boolean1);
	      assertEquals(3, linkedList0.size());
	      assertTrue(boolean2);
	      
	      boolean boolean3 = linkedList0.add(appt0);
	      assertTrue(boolean3 == boolean0);
	      assertTrue(boolean3 == boolean1);
	      assertTrue(boolean3 == boolean2);
	      assertEquals(4, linkedList0.size());
	      assertTrue(boolean3);
	      
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
	         
	      }
	  }
	  
	  @Test (timeout = 4000)
	  public void test07()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(3285, 0, 3685, 2, 1);
	      assertNotNull(GregorianCalendar0);
	      
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      assertNotNull(locale0);
	      
	      GregorianCalendar0.set(0, 5);
	      
	      GregorianCalendar GregorianCalendar1 = new GregorianCalendar(locale0);
	      assertFalse(GregorianCalendar1.equals((Object)GregorianCalendar0));
	      assertNotNull(GregorianCalendar1);
	      
	      // Undeclared exception!
	      try { 
	        timeTable0.getApptRange(linkedList0, GregorianCalendar0, GregorianCalendar1);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // Invalid era
	         //
	         
	      }
	  }
	  

//add more unit tests as you needed
	  
	  @Test (timeout = 4000)
	  public void test08()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      boolean boolean0 = linkedList0.add(appt1);
	      assertTrue(boolean0);
	      
	      boolean boolean1 = linkedList0.add(appt1);
	      assertTrue(boolean1 == boolean0);
	      assertEquals(2, linkedList0.size());
	      assertTrue(boolean1);
	      
	      boolean boolean2 = linkedList0.add(appt1);
	      assertTrue(boolean2 == boolean0);
	      assertTrue(boolean2 == boolean1);
	      assertEquals(3, linkedList0.size());
	      assertTrue(boolean2);
	      
	      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt1);
//	      assertNotNull(linkedList1);
	  }
	  	  
	  @Test (timeout = 4000)
	  public void test09()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);
	      
	      
	      boolean boolean0 = linkedList0.add(appt2);
	      assertEquals(1, linkedList0.size());
	      assertTrue(boolean0);
	      
	      boolean boolean1 = linkedList0.add(appt2);
	      assertTrue(boolean1 == boolean0);
	      assertEquals(2, linkedList0.size());
	      assertTrue(boolean1);
	      
	      
	      boolean boolean2 = linkedList0.add(appt2);
	      assertFalse(appt2.equals((Object)appt3));
	      assertTrue(boolean2 == boolean1);
	      assertTrue(boolean2 == boolean0);
	      assertEquals(3, linkedList0.size());
	      assertTrue(boolean2);
	      assertNotSame(appt2, appt3);
	      
	      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt3);
	      assertNull(linkedList1);
	  }
	  
	  @Test (timeout = 4000)
	  public void test10()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);	      
	      
	      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt4);
	      assertEquals(0, linkedList0.size());
	      assertNull(linkedList1);
	  }
	  
	  @Test (timeout = 4000)
	  public void test11()  throws Throwable  {
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
	  public void test12()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      assertEquals(0, linkedList0.size());
	      assertNotNull(linkedList0);	      
	      
	      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt5);
	      assertEquals(0, linkedList0.size());
	      assertNull(linkedList1);
	  }
	  
	  @Test (timeout = 4000)
	  public void test13()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      assertNotNull(timeTable0);
	      
	      LinkedList<Appt> linkedList0 = timeTable0.deleteAppt((LinkedList<Appt>) null, appt6);
	      assertNull(linkedList0);
	  }
	  
	  @Test (timeout = 4000)
	  public void test14()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      
	      linkedList0.add(appt7);
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(3285, 0, 3685, 2, 1);
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      GregorianCalendar GregorianCalendar1 = new GregorianCalendar(locale0);
	      
	      LinkedList<CalDay> linkedList1 = timeTable0.getApptRange(linkedList0, GregorianCalendar1, GregorianCalendar0);

	  }
	  
	  @Test (timeout = 4000)
	  public void test15()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
	      Locale locale0 = Locale.ROOT;
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(locale0);
	      
	      try { 
		        timeTable0.getApptRange(linkedList0, GregorianCalendar0, GregorianCalendar0);
		        fail("Expecting exception: Exception");
		      
		      } catch(Exception e) {
		         //
		         // Second date specified is not  before the first date specified.
		         //
		         
		      }	      
	  }
	  	  
	  @Test (timeout = 4000)
	  public void test16()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();

	      linkedList0.add(appt0);
	      	      
	      appt0.setStartMinute(2);
	      
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(3285, 0, 3685, 2, 1);
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      GregorianCalendar GregorianCalendar1 = new GregorianCalendar(locale0);
	      
	      LinkedList<CalDay> linkedList1 = timeTable0.getApptRange(linkedList0, GregorianCalendar1, GregorianCalendar0);
      
	  }
	  
	  @Test (timeout = 4000)
	  public void test17()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();

	      linkedList0.add(appt0);
	      	      
	      appt0.setStartMinute(2);
	      
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(3285, 0, 3685, 2, 1);
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      GregorianCalendar GregorianCalendar1 = new GregorianCalendar(locale0);
	      Locale locale1 = Locale.GERMAN;
	      GregorianCalendar GregorianCalendar2 = new GregorianCalendar(locale1);
	      
	      LinkedList<CalDay> linkedList1 = timeTable0.getApptRange(linkedList0, GregorianCalendar2, GregorianCalendar0);
      
	  }
	  	  
	  @Test (timeout = 4000)
	  public void test18()  throws Throwable  {
		  TimeTable timeTable0 = new TimeTable();
	      LinkedList<GregorianCalendar> linkedList0 = new LinkedList<GregorianCalendar>();
	      
	      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(3285, 0, 3685, 2, 1);
	      Locale locale0 = Locale.TRADITIONAL_CHINESE;
	      GregorianCalendar GregorianCalendar1 = new GregorianCalendar(locale0);
	      Locale locale1 = Locale.GERMAN;
	      GregorianCalendar GregorianCalendar2 = new GregorianCalendar(locale1);
	      
	      linkedList0.add(GregorianCalendar0);
	      linkedList0.add(GregorianCalendar1);
	      linkedList0.add(GregorianCalendar2);	      
	      
	      assertNotNull(linkedList0.iterator());
	      assertNotNull(linkedList0.element());
	      assertNotNull(linkedList0.getFirst());
	      assertNotNull(linkedList0.getLast());
		  
		  Iterator<GregorianCalendar> iterator0 = linkedList0.iterator();
	      assertTrue(iterator0.hasNext());
	      
	      
      
	  }
	  

	  

	  

}
