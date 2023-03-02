package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import weekDay.Monday;
import weekDay.Sunday;
import weekDay.Tuesday;
import weekDay.WeekDay;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("entity")
public class MyConfig {

    @Bean
    public WeekDay getDay() {
       DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        return switch (dayOfWeek) {
            case MONDAY -> new Monday();
            case TUESDAY -> new Tuesday();
            default -> new Sunday();
        };
    }
}
