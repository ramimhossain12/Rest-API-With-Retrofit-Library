package com.example.restapiwithretrofitlibrary;

import com.google.gson.annotations.SerializedName;

public class Comment {

    private  int postID;
    private int id;
    private String name;
    private  String email;

    @SerializedName("body")
    private  String text;

    public int getPostID() {
        return postID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }
}
