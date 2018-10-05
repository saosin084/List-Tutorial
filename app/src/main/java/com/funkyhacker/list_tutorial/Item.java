package com.funkyhacker.list_tutorial;

public class Item{

    private String mName;
    private String mId;
    private String mComment;
    private int mImage;

    public Item(String name, String id, String comment,int image) {
        mName = name;
        mId = id;
        mComment = comment;
        mImage = image;
    }

    public String getMname() {
        return mName;
    }

    public String getMid() {
        return mId;
    }

    public String getMcomment() {
        return mComment;
    }

    public int getMimage() {
        return mImage;
    }
    }

