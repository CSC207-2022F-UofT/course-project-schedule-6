package entity;

import java.util.ArrayList;

public class User {
    private String userName;
    private String email;
    private String name;
    public ArrayList<ScheduleItem> scheduleItems;
    public ArrayList<Task> tasks;

    public User(String name, String userName, String email) {
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.scheduleItems = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getName(){
        return this.name;
    }

}
