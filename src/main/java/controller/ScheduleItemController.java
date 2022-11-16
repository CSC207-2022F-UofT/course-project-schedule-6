package controller;

// Temporarily using "pretend inputs" as variables for implementing feature 2

import boundary.AddScheduleItemInputBoundary;
import useCaseInteractor.ScheduleItemInputData;
import useCaseInteractor.ScheduleItemResponseModel;

import java.time.LocalDate;
import java.time.LocalTime;

public class ScheduleItemController {
    final AddScheduleItemInputBoundary userInput;

    public ScheduleItemController(AddScheduleItemInputBoundary input) {
        this.userInput = input;
    }

    ScheduleItemResponseModel create(String title, LocalDate date, LocalTime startTime, LocalTime endTime) {
        ScheduleItemInputData inputData = new ScheduleItemInputData(title, date, startTime, endTime);
        return userInput.create(inputData);
    }
}