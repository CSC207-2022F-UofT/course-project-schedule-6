import boundary.AddScheduleItemInputBoundary;
import com.mongodb.*;
import controller.ScheduleItemController;
import entity.CommonScheduleItemFactory;
import entity.ScheduleItemFactory;
import entity.User;
import useCaseInteractor.AddScheduleItem;

public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient();
        DB database = mongoClient.getDB("schedule6_testDB");
        DBCollection collection = database.getCollection("schedule6_testCollection");


        DBObject userData = new BasicDBObject("_id", 1);

        collection.insert(userData);
    }
}
