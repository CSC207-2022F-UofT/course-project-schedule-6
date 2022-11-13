package InputBoundary;

import useCases.ScheduleItemInputData;
import useCases.ScheduleItemResponseModel;

public interface EditScheduleItemInputBoundary {
    ScheduleItemResponseModel edit(ScheduleItemInputData inputData);
}
