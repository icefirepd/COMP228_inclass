package WeekFour;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class TimeCalculator {
    public void getCurrentLocalTime() {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
    public void getCurrentZoneDateTime() {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
    }
    public static void main(String[] args) {

        TimeCalculator tc = new TimeCalculator();
        tc.getCurrentLocalTime();
        tc.getCurrentZoneDateTime();
    }
}