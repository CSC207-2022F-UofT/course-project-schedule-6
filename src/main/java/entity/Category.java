package entity;

//import javafx.scene.paint.Color;
import java.util.List;
public class Category {

    private String name;
    //private List<todoItem> items;
    private boolean status;
    private String hex;

    public Category () {

    }

    /*
    public Category(String name, List<todoItem> items, boolean status, String hex) {
        this.name = name;
        this.items = items;
        this.status = status;
        this.hex = hex;
    }
    */

    /*public Category(String name, todoItem item, boolean status, String hex) {
        this.name = name;
        this.items.add(item);
        this.status = status;
        this.hex = hex;
    }
    */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
}
