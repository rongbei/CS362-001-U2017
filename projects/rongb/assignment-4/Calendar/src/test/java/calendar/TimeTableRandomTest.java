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
import calendar.ValuesGenerator;

/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
    public static int getRandomNum(int smallistNum, int BiggestNum) {
        Random random = new Random();
        return (Math.abs(random.nextInt()) % (BiggestNum - smallistNum + 1))+ smallistNum;
    }
    
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
    
  
	 @Test
	  public void radnomtest1()  throws Throwable  {
		 
		 for(int q=0; q<50; q++)
		 {
			 int j=0;
			 
			 try {
				 TimeTable timeTable = new TimeTable();
				 LinkedList<Appt> linkedList = new LinkedList<Appt>();
				 
				 for(int i=0; i<1000; i++)
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
					
					
					linkedList.add(appt1);
					
				 }
				 
				 // System.out.println(linkedList.size());
				 
				 for(j=0; j<1000; j++)
				 {
					 if(getRandomNum(0,5) == 0)
					 {
						 timeTable.deleteAppt(null, null);
					 }
					 else if(getRandomNum(0,5) == 3)
					 {
						 timeTable.deleteAppt(linkedList, null);
					 }
					 else
					 {
						 Appt appt = linkedList.get(j);
						 timeTable.deleteAppt(linkedList, appt);
					 }

				 }
				 
				 // System.out.println(linkedList.size()); 
				 
				 
				 
				 
				 
			 }catch(Exception e) {
				 
			 }
		 }

		 
		 
		 



	 }

		 
	 @Test
	  public void radnomtest2()  throws Throwable  {
		 
		 for(int q=0; q<50; q++)
		 {
			 try {
				 TimeTable timeTable = new TimeTable();
				 LinkedList<Appt> linkedList = new LinkedList<Appt>();
				 
				 for(int i=0; i<10000; i++)
				 {
					 if(getRandomNum(0,5) == 0)
					 {
						 linkedList.add(null);
					 }
					 else
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
						 
						 linkedList.add(appt1);
						 
						 Random random = new Random();
						 int n = getRandomNum(0, 100);
						 int[] recurDays1 = ValuesGenerator.generateRandomArray(random, n);
						 int recurBy1 = getRandomNum(0, 100);
						 int recurIncrement1 = getRandomNum(0, 100);
						 int recurNumber1 = getRandomNum(0, 100);
						 appt1.setRecurrence(recurDays1, recurBy1, recurIncrement1, recurNumber1);
						 
					 }
					 
					 

					
				 }
				 
				 // System.out.println(linkedList.size());
				 
				 
				 
				 GregorianCalendar cal0 = new GregorianCalendar(3285, 0, 3685, 2, 1);
				 
				 Locale locale1 = Locale.CANADA;
				 Locale locale2 = Locale.FRENCH;
				 Locale locale3 = Locale.JAPAN;

				 
				 for(int i=0; i<10000; i++)
				 {	
					
					if(getRandomNum(0,5) == 0 || getRandomNum(0,5) == 2 || getRandomNum(0,5) == 4)
					{
						GregorianCalendar cal1 = new GregorianCalendar(locale1);
						timeTable.getApptRange(linkedList, cal1, cal0);
					}
					else if(getRandomNum(0,5) == 1 || getRandomNum(0,5) == 3)
					{
						GregorianCalendar cal2 = new GregorianCalendar(locale2);
						timeTable.getApptRange(linkedList, cal0, cal2);
					}
					else
					{
						GregorianCalendar cal3 = new GregorianCalendar(locale3);
						timeTable.getApptRange(linkedList, cal3, cal0);
					}
					
				 }
				 
				 
				 
				 
			 }catch(Exception e) {
				 
			 }
		 }

		 
		 
		 



	 }


		 
	
}
