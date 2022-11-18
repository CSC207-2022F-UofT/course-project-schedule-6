package entity;
import java.time.LocalDate;
import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;
    private ArrayList<Category> categories;

    public ToDoList(){
        this.tasks = new ArrayList<>();
        this.categories = new ArrayList<>();
    }

    public void addTask(String title, LocalDate date, String privacySetting, Category category){
        Task t = new CommonTask(title, date, privacySetting, category);
        this.tasks.add(t);
    }

    public void deleteTask(Task t){
        this.tasks.remove(t);
    }

    public void addCategory(String name, ArrayList<Task> items, boolean status, String hex){
        Category c = new CommonCategory(name, status, hex);
        this.categories.add(c);
    }

    public void deleteCategory(Category category){
        this.categories.remove(category);
    }

    public ArrayList<Task> getTasks(){
        return this.tasks;
    }

    public ArrayList<Category> getCategories(){
        return this.categories;
    }

}
