package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;



import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	    
    public static int getRandomNum(int smallistNum, int BiggestNum) {
        Random random = new Random();
        return (Math.abs(random.nextInt()) % (BiggestNum - smallistNum + 1))+ smallistNum;
    }
    
    public static String[] str = null;
    public static String description = null;
    
   /**
     * Generate Random Tests that tests Appt Class.
     */
 
	 @Test
	  public void test01()  throws Throwable  {
		 try {
			 for(int i=0; i<10000; i++)
			 {
				int startHour1 = getRandomNum(-10, 30);
				int startMinute1 = getRandomNum(-10, 70);
				int startDay1 = getRandomNum(-10, 32);
				int startMonth1 = getRandomNum(0, 11);
				int startYear1 = getRandomNum(-1000, 5000);
				String title1 = "";
				String description1 = "";				
				
				
				if(getRandomNum(0,5) == 0 || getRandomNum(0,5) == 2 || getRandomNum(0,5) == 4)
				{
					description = null;
				}
				else
				{
					description = "Not Null";
				}

				 
				 Appt appt1 = new Appt(startHour1,
				          startMinute1,
				          startDay1,
				          startMonth1,
				          startYear1,
				          title1,
				          description1);
				 
				 appt1.setDescription(description);
				 appt1.getDescription();
				 				 
				 if(!appt1.getValid())
				 {
					 System.out.println("False");
				 }
				 else
				 {
					 System.out.println("True");
				 }
				 
			 }
			 
			 
			 

		 

		 }catch(Exception e) {
			 
		 }
	 }



	
}
