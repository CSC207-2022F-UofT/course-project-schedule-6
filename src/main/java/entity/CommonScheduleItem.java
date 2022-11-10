package entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class CommonScheduleItem implements ScheduleItem {

    private String title;

    private LocalDate date;

    private LocalTime time;

    public CommonScheduleItem(String title, LocalDate date, LocalTime time) {
        this.title = title;
        this.date = date;
        this.time = time;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public LocalDate getDate() {
        return this.date;
    }

    @Override
    public LocalTime getTime() {
        return this.time;
    }
}