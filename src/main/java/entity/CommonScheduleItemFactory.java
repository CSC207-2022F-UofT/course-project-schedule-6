package entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class CommonScheduleItemFactory implements ScheduleItemFactory {
    @Override
    public ScheduleItem create(String title, LocalDate date, LocalTime time) {
        return new CommonScheduleItem(title, date, time);
    }
}
