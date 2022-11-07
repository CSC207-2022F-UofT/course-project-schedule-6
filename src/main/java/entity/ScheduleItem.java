package entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class ScheduleItem {

    private String title;

    private LocalDate date;

    private LocalTime time;

//    /**
//     * Constructor for a ScheduleItem
//     *
//     * @param title the title set for ScheduleItem
//     * @param date  the date set for ScheduleItem
//     * @param time  the time set for ScheduleItem
//     */
//    public ScheduleItem(String title, LocalDate date, LocalTime time) {
//        this.title = title;
//        this.date = date;
//        this.time = time;
//    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getTitle() {
        return this.title;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public LocalTime getTime() {
        return this.time;
    }
}