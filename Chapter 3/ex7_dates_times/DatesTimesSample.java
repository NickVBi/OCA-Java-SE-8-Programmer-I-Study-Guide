import java.time.*;          // import time classes
import java.time.format.* ;
public class DatesTimesSample {
    public static void main(String[] args) {
        System.out.println(LocalDate.now()); // Local Date
        System.out.println(LocalTime.now()); // Local Time
        System.out.println(LocalDateTime.now());   // Local date and time
        
        System.out.println();

        // init Local date object
        LocalDate date1 = LocalDate.of(2018, Month.JUNE, 30);
        LocalDate date2 = LocalDate.of(2018, 6, 30);

        //init local time object
        LocalTime time1 =  LocalTime.of(6, 15);               // hour and minute
        LocalTime time2 =  LocalTime.of(6, 15, 30);          // + seconds
        LocalTime time3 =  LocalTime.of(6, 15, 30, 200);     // + nanoseconds
    
        //init local data and time object
        LocalDateTime dataTime1 = LocalDateTime.of(2018, Month.JUNE, 30, 6, 15, 30, 200);
        LocalDateTime dataTime2 = LocalDateTime.of(date1, time1);
        
        System.out.println(dataTime1);
        System.out.println(dataTime2);

        System.out.println();

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date);          // 2014-01-20
        date = date.plusDays(2); // adding 2 days
        System.out.println(date);          // 2014-01-22
        date = date.plusWeeks(1);// adding 1 week
        System.out.println(date);          // 2014-01-29
        date = date.plusMonths(1); // adding 1 mouth
        System.out.println(date);          // 2014-02-28
        date = date.plusYears(5); // adding 5 years
        System.out.println(date);          // 2019-02-28
    
        System.out.println();

        date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);          // 2020-01-20T05:15
        dateTime = dateTime.minusDays(1); // minus 1 day
        System.out.println(dateTime);          // 2020-01-19T05:15
        dateTime = dateTime.minusHours(10); // minus 10 hours
        System.out.println(dateTime);          // 2020-01-18T19:15
        dateTime = dateTime.minusSeconds(30); // minus 30 sec
        System.out.println(dateTime);          // 2020-01-18T19:14:30
    
        // cheined for method date and time 
        dateTime = LocalDateTime.of(date2, time).minusDays(1).minusHours(10).minusSeconds(30);
    
        System.out.println();
        
        // period class init
        Period annually = Period.ofYears(1);               // every 1 year
        Period quarterly = Period.ofMonths(3);               // every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3);          // every 3 weeks
        Period everyOtherDay = Period.ofDays(2);          // every 2 days
        Period everyYearAndAWeek = Period.of(1, 0, 7);          // every year and 7 days
        
        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period));         
        System.out.println(dateTime.plus(period));      
        //System.out.println(time.plus(period));   // UnsupportedTemporalTypeException
    
        System.out.println();      

        // formatting dates and times
        System.out.println(date.getDayOfWeek());     // MONDAY
        System.out.println(date.getMonth());          // JANUARY
        System.out.println(date.getYear());          // 2020
        System.out.println(date.getDayOfYear());     // 20
        System.out.println();   
        
        // format with java.time.format.DateTimeFormatter
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    
        DateTimeFormatter shortDateTime =
            DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime));     // 1/20/20
        System.out.println(shortDateTime.format(date));      // 1/20/20
        //System.out.println(
        //    shortDateTime.format(time)); // UnsupportedTemporalTypeException
    
        System.out.println(dateTime.format(shortDateTime));
        System.out.println(date.format(shortDateTime));
        
        System.out.println();
        DateTimeFormatter shortF = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTime));     // 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime));     // Jan 20, 2020 11:12:34 AM
    
        // create predefined formats
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f));     // January 20, 2020, 11:12
        
        System.out.println();
        // pares from dates and times in String
        f = DateTimeFormatter.ofPattern("MM dd yyyy");
        date = LocalDate.parse("01 02 2015", f);
        time = LocalTime.parse("11:22");
        System.out.println(date);          // 2015-01-02
        System.out.println(time);          // 11:22    

    }
}