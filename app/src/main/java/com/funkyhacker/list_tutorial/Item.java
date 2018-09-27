package com.funkyhacker.list_tutorial;

public class Item{

    private String mName;
    private String mId;
    private String mComment;

    public Item(String name, String id, String comment) {
        mName = name;
        mId = id;
        mComment = comment;
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
}
