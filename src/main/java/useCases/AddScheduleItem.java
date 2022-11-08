package useCases;

import entity.ScheduleItem;

import java.time.LocalDate;
import java.time.LocalTime;

public class AddScheduleItem {

    ScheduleItem newScheduleItem;

    public void addNewScheduleItem(String title, LocalDate date, LocalTime time) {
        this.newScheduleItem.setTitle(title);
        this.newScheduleItem.setDate(date);
        this.newScheduleItem.setTime(time);
        // User.addScheduleItem(this.newScheduleItem)
        // need to add this newScheduleItem into User
    }
}