package InputBoundary;

import useCases.ScheduleItemInputData;
import useCases.ScheduleItemResponseModel;

public interface AddScheduleItemInputBoundary {
    ScheduleItemResponseModel create(ScheduleItemInputData inputData);
}
