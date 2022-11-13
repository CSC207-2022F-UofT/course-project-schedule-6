import com.mongodb.*;
import entity.CommonUser;

public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://stevenli:stevenli@cluster0.koruj0t.mongodb.net/?retryWrites=true&w=majority"));
        DB database = mongoClient.getDB("schedule6_testDB");
        DBCollection collection = database.getCollection("schedule6_testCollection");

        CommonUser user = new CommonUser(1);
        DBObject userData = new BasicDBObject("_id", user.getID());

        collection.insert(userData);
    }
}
