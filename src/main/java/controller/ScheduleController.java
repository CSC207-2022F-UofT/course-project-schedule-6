package controller;

import useCases.AddScheduleItem;
import useCases.ScheduleItemInputData;

import java.time.LocalDate;
import java.time.LocalTime;

public class ScheduleController {

    public void performAddScheduleItem(String title, LocalDate date, LocalTime time) {
        ScheduleItemInputData scheduleItemInputData = new ScheduleItemInputData(title, date, time);

    }
}