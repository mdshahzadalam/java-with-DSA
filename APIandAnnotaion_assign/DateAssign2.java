package collection.Extra;
import java.time.*;
public class DateAssign2 {

    public static void main(String[] args) {
        
        LocalDate date =LocalDate.now();
        int month=date.getMonthValue();
        int day=date.getDayOfMonth();
        int year=date.getYear();

        System.out.println(day+"/"+month+"/"+year);
    }
    
}
