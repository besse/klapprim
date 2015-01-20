package com.besse.klapprim;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created for klapprim
 * User: jonasbirgersson
 * Date: 2014-12-17
 * Time: 5:42 PM
 */
public class GiftDAOImpl implements GiftDAO {

    private DatabaseManager databaseManager;
    private DBCollection table;
    private static Logger logger = Logger.getLogger(GiftDAOImpl.class);

    public GiftDAOImpl(DatabaseManager databaseManager) {
        this.setDatabaseManager(databaseManager);
    }


    public void setDatabaseManager(DatabaseManager manager){
        this.databaseManager = manager;
        this.table = databaseManager.getDb().getCollection("gifts");
    }

    public void save(Gift gift){

    }



    @Override
    public List<Gift> getAllGifts() {

        List<DBObject> obj = table.getIndexInfo();
        List<Gift> giftList = new ArrayList<>();
        for (DBObject dbObject : obj) {
            Gift gift = new Gift();
            gift.setName((String) dbObject.get("name"));
            gift.setDescription((String) dbObject.get("description"));
            giftList.add(gift);

        }

        return giftList;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Gift getGift(String name) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateGift(Gift gift) {
        BasicDBObject document = new BasicDBObject();
        document.put("name", gift.getName());
        document.put("description", gift.getDescription());
        document.put("createdDate", new Date());
        table.insert(document);
        logger.info("Saved gift [" + gift.getName() + "] to database");


    }

    @Override
    public void deleteGift(Gift gift) {
        BasicDBObject document = new BasicDBObject();
        document.put("name", gift.getName());
        document.put("description", gift.getDescription());
        table.remove(document);
    }
}
