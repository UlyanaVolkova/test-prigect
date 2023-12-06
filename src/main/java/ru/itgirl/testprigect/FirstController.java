package ru.itgirl.testprigect;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class FirstController {

        @GetMapping("/dayOfTheWeek")
        public String dayOfTheWeek(@RequestParam(value = "day", defaultValue = "Нет данных") String day) {
            String dayInRus = null;
            if(Objects.equals(day, "MONDAY")){
                dayInRus ="Сегодня понедельник!";
            }
            if(Objects.equals(day, "TUESDAY")){
                dayInRus = " вторник!";
            }
            if(Objects.equals(day, "WEDNESDAY")){
                dayInRus = " среда!";
            }
            if(Objects.equals(day, "THURSDAY")){
                dayInRus =" четверг!";
            }
            if(Objects.equals(day, "FRIDAY")){
                dayInRus =" пятница!";
            }
            if(Objects.equals(day, "SATURDAY")){
                dayInRus =" суббота!";
            }
            if(Objects.equals(day, "SUNDAY")){
                dayInRus =" воскресенье!";
            }
            return String.format("Сегодня " + dayInRus);
        }


}
