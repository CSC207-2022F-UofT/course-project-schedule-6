package entity;

import java.util.ArrayList;

public class CommonUser implements User {

    final private int _id;
    private int itemCount;

    private ArrayList<CommonScheduleItem> scheduleItems;

    public CommonUser(int _id) {
        this._id = _id;
        this.itemCount = 0;
        this.scheduleItems = new ArrayList<>();
    }

    @Override
    public void addScheduleItem(CommonScheduleItem item) {
        this.scheduleItems.add(this.itemCount, item);
        this.itemCount++;
    }

    @Override
    public int getID() {
        return this._id;
    }
}
