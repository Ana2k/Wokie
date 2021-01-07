package com.example.android.travelapp;

public class Word {
    private static final int NO_IMAGE_PROVIDED=0;

    private String mItemName;

    private String mItemDetail;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    public Word(String itemName, String itemDetail ){
        mItemName= itemName;
        mItemDetail = itemDetail;
    }

    /**
     * Create a new Word object.
     *
     * @param itemName           is the name of the item being detailed
     * @param itemDetail         is the details of the described item
     * @param imageResourceID    is the drawable resource ID for the image associated with the word
     */

    public Word(String itemName, String itemDetail, int imageResourceID){
        mItemName = itemName;
        mItemDetail = itemDetail;
        mImageResourceID = imageResourceID;
    }

    public String getmItemName(){
        return mItemName;
    }
    public String getmItemDetail(){
        return mItemDetail;
    }
    public int getmImageResourceID(){
        return mImageResourceID;
    }
    //gets resources from given class

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
    // returns wether image exists

}
