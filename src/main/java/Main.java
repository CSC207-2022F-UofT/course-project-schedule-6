import com.mongodb.*;
import entity.CommonScheduleItem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CommonScheduleItem> commonScheduleItems = new ArrayList<>();

        DBObject user = new BasicDBObject("_id", 1)
                .append("ScheduleItems", commonScheduleItems);

        MongoClient mongoClient = new MongoClient();
        DB database = mongoClient.getDB("CSC207Project");
        DBCollection collection = database.getCollection("schedule6");
        collection.insert(user);
    }
}
