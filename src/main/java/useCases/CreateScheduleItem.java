package useCases;

//use case interactor

import entity.ScheduleItem;
import java.time.LocalDate;
import java.time.LocalTime;

public class CreateScheduleItem {

    ScheduleItem newScheduleItem = new ScheduleItem();

    public void createScheduleItem(String title, LocalDate date, LocalTime time) {
            newScheduleItem.setTitle(title);
            newScheduleItem.setDate(date);
            newScheduleItem.setTime(time);
    }
}
