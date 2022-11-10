package useCases;

import java.time.LocalDate;
import java.time.LocalTime;

public class ScheduleItemInputData {

    private String title;

    private LocalDate date;

    private LocalTime time;

    public ScheduleItemInputData(String title, LocalDate date, LocalTime time) {
        this.title = title;
        this.date = date;
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