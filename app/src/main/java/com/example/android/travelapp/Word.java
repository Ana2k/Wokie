package com.example.android.travelapp;

public class Word {
    private static final String NO_IMAGE_PROVIDED="\0";

    private String mItemName;

    private String mItemDetail;

    private int mImageResourceID ;//for r.drawable only

    private String mImageURL;

    public Word(String itemName, String itemDetail ){
        mItemName= itemName;
        mItemDetail = itemDetail;
    }

    /**
     * Create a new Word object.
     *
     * @param itemName           is the name of the item being detailed
     * @param itemDetail         is the details of the described item
     * @param imageURL           is the nondrawable resource URL for the image associated with the word
     */

    public Word(String itemName, String itemDetail, String imageURL){
        mItemName = itemName;
        mItemDetail = itemDetail;
        mImageURL = imageURL;
        //mImageResourceID = imageResourceID;

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
    public String getmImageURL(){
        return mImageURL;
    }
    //gets resources from given class

    /*public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }*/
    // returns wether image exists

}
