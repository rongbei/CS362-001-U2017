package calendar;


import java.util.Calendar;
import java.util.Random;
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

/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
    public static int getRandomNum(int smallistNum, int BiggestNum) {
        Random random = new Random();
        return (Math.abs(random.nextInt()) % (BiggestNum - smallistNum + 1))+ smallistNum;
    }   
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 try {
			 
				GregorianCalendar cal = new GregorianCalendar(0, 0, 0, 0, 0, 0);
				CalDay calDay1 = new CalDay(cal);
				
				 for(int i=0; i<10000; i++)
				 {
					int startHour1 = getRandomNum(-10, 30);
					int startMinute1 = getRandomNum(-10, 70);
					int startDay1 = getRandomNum(-10, 32);
					int startMonth1 = getRandomNum(0, 11);
					int startYear1 = getRandomNum(-1000, 5000);
					String title1 = "";
					String description1 = "";				
								
					 Appt appt1 = new Appt(startHour1,
					          startMinute1,
					          startDay1,
					          startMonth1,
					          startYear1,
					          title1,
					          description1);
					
					

					calDay1.addAppt(appt1);
					
					
				 }
				
				

				
				

		 }catch(Exception e) {
			 
		 }
		 
		 
		 



	 }
		 
		 




	
}
