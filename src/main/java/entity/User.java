package entity;

import java.util.ArrayList;

public class User {

    private String username;
    private String password;
    private int itemCount;
    private ArrayList<ScheduleItem> scheduleItems;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.itemCount = 0;
        this.scheduleItems = new ArrayList<ScheduleItem>();
    }

    public void addScheduleItem(ScheduleItem item) {
        this.scheduleItems.add(this.itemCount, item);
        this.itemCount++;
    }
}
