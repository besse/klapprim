package com.besse.klapprim;

import java.net.UnknownHostException;
import java.util.List;

/**
 * Created for klapprim
 * User: jonasbirgersson
 * Date: 2014-12-17
 * Time: 6:20 PM
 */
public class Main {

    private DatabaseManager databaseManager;

    public static void main(String[] args){
        Main main = new Main();
        main.init();
    }

    private void init() {
        try {
            this.databaseManager = new DatabaseManager();
            GiftDAO giftDAO = new GiftDAOImpl(databaseManager);
            /* Gift gift1 = new Gift();
            gift1.setName("Nallebjorn");
            gift1.setDescription("En teddybjorn som barn kan leka med");

            giftDAO.updateGift(gift1);

            Gift gif2 = new Gift();
            gif2.setName("Thermos");
            gif2.setDescription("En thermos");

            giftDAO.updateGift(gif2);
*/
            List<Gift> giftList = giftDAO.getAllGifts();
            for (Gift gift : giftList) {
                System.out.println(gift);
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
