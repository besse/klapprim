package com.besse.klapprim;

import java.util.List;

/**
 * Created for klapprim
 * User: jonasbirgersson
 * Date: 2014-12-17
 * Time: 6:14 PM
 */
public interface GiftDAO {

    public List<Gift> getAllGifts();
    public Gift getGift(String name);
    public void updateGift(Gift gift);
    public void deleteGift(Gift gift);
}
