package entity;

import java.util.ArrayList;

public class User {
    private int itemCount;
    private ArrayList<CommonScheduleItem> commonScheduleItems;

    public User() {
        this.itemCount = 0;
        this.commonScheduleItems = new ArrayList<CommonScheduleItem>();
    }

    public void addScheduleItem(CommonScheduleItem item) {
        this.commonScheduleItems.add(this.itemCount, item);
        this.itemCount++;
    }
}
