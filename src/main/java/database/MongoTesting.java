package database;

import com.mongodb.*;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.List;

public class MongoTesting {

//    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
//
//    DB database = mongoClient.getDB("TheDatabaseName");
//
//    DBCollection collection = database.getCollection("TheCollectionName");

    public static void main(String[] args) {
        List<Integer> books = Arrays.asList(27464, 747854);
        DBObject person = new BasicDBObject("_id", "jo")
                .append("name", "Joe Mama")
                .append("address", new BasicDBObject("street", "123 Fake St")
                        .append("city", "Faketon")
                        .append("state", "MA")
                        .append("zip", 12345))
                .append("books", books);

        MongoClient mongoClient = new MongoClient();
        DB database = mongoClient.getDB("Examples");
        DBCollection collection = database.getCollection("people");
        collection.insert(person);
    }
}

