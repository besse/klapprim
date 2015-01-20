package com.besse.klapprim;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created for klapprim
 * User: jonasbirgersson
 * Date: 2014-12-17
 * Time: 5:15 PM
 */
public class DatabaseManager {

    private MongoClient mongoClient;
    private DB db;
    private boolean auth;

    public DatabaseManager() throws UnknownHostException {
        this.mongoClient = new MongoClient("localhost", 27017);
        db = mongoClient.getDB("klapprim");
    }

    public DB getDb(){
        return db;
    }






}
