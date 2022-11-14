package entity;
import java.util.ArrayList;

public class ToDo {
    private ArrayList<Task> tasks;
    private ArrayList<Category> categories;

    public ToDo(){
        this.tasks = new ArrayList<>();
        this.categories = new ArrayList<>();
    }

    public void addTask(String title, String date, String time, String description){
        Task t = new Task(title, date, time, description);
        this.tasks.add(t);
    }

    public void deleteTask(Task t){
        this.tasks.remove(t);
    }

    public void addCategory(String name, ArrayList<Task> items, boolean status, String hex){
        Category c = new Category(name, items, status, hex);
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
