package useCases;

import entity.CommonScheduleItem;
import entity.ScheduleItem;
import entity.ScheduleItemFactory;

import java.time.LocalDate;
import java.time.LocalTime;

//A Use Case Interactor

public class AddScheduleItem implements ScheduleItemInputBoundary {

    ScheduleItemInputData inputData;

    ScheduleItemFactory scheduleItemFactory;


    public AddScheduleItem(ScheduleItemInputData inputData, ScheduleItemFactory scheduleItemFactory) {
        this.inputData = inputData;
        this.scheduleItemFactory = scheduleItemFactory;
    }

    public void addNewScheduleItem() {
        ScheduleItem scheduleItem = scheduleItemFactory.create(this.inputData.getTitle(),
                this.inputData.getDate(), this.inputData.getTime());
    }
}