package eight;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateFields {

	public static void main(String[] args) {
		/*Date today = new Date(954527400000l);
		System.out.println(today);
		System.out.println(today.toInstant());
		LocalDateTime ldt = LocalDateTime.ofInstant(today.toInstant(), ZoneId.systemDefault());
		System.out.println(ldt);
		
		LocalDateTime a = LocalDateTime.now();
		System.out.println(a);*/
		
		//get Calendar instance
//	    Calendar now = Calendar.getInstance();
	    
	    //get current TimeZone using getTimeZone method of Calendar class
//	    TimeZone timeZone = now.getTimeZone();
	    
	    //display current TimeZone using getDisplayName() method of TimeZone class
//	    System.out.println("Current TimeZone is : " + timeZone.getOffset(now.getTimeInMillis()) * 60000);
	    
	    /*LocalDateTime ldt = LocalDateTime.now();
	    ZoneId zone = ZoneId.of("Europe/Berlin");
	    ZoneOffset zoneOffSet = zone.getRules().getOffset(ldt);
	    System.out.println(zoneOffSet);*/
	    
//		String date = "2016-09-21T13:43:27.000";
//		LocalDateTime localdatetime = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
	    
//		LocalDateTime localdate = LocalDateTime.parse("2016-09-21", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		
//	    LocalDateTime localdatetime = LocalDateTime.parse("2018-01-04");
//	    System.out.println(localdate);
		
        LocalDate localDate = LocalDate.parse("2018-07-14", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                 
        //date to string
//        String dateStr = localDate.format(dateTimeFormatter);
         
        System.out.println(localDate);      // 2018-07-14
//        System.out.println(dateStr);        // 14/07/2018
	}

	public static LocalDateTime getOffsetLocalDateTime(long millis, int offsetInSeconds) {
		Instant instant = Instant.ofEpochMilli(millis);
		ZoneOffset zoneOffset = ZoneOffset.ofTotalSeconds(offsetInSeconds);
		LocalDateTime localDateTime = instant.atOffset(zoneOffset).toLocalDateTime();
		return localDateTime;
	}

}
