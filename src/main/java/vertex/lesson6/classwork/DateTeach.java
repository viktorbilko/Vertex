package vertex.lesson6.classwork;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * Created by vertex0005 on 18.07.2017.
 */
public class DateTeach {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());

        System.out.println(LocalDateTime.now());

        System.out.println(LocalDate.now().minusDays(1));
        System.out.println(LocalDate.now().minusMonths(1));
        System.out.println(LocalDate.now().minusYears(1));
        System.out.println(LocalDate.now().plusYears(1));

        Period between = Period.between(LocalDate.now(), LocalDate.now().plusWeeks(1));
        Period between2 = Period.between(LocalDate.now(), LocalDate.of(2017,7,23));
        System.out.println(between.getDays());
        System.out.println(between.getDays());



        LocalDate date = LocalDate.of(1995, 6, 28);
        System.out.println(date);
    }
}
