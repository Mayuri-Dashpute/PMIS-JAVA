import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate first = LocalDate.parse(date1);
        LocalDate second = LocalDate.parse(date2);

        return (int) Math.abs(ChronoUnit.DAYS.between(first, second));
    }
}