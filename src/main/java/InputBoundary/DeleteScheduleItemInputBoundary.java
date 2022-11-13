package InputBoundary;

import useCases.ScheduleItemInputData;
import useCases.ScheduleItemResponseModel;

public interface DeleteScheduleItemInputBoundary {
    ScheduleItemResponseModel delete(ScheduleItemInputData inputData);
}
