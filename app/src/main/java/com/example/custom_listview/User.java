package com.example.custom_listview;

public class User {

    String name, lastMessage, lastMsgTime,username, phoneNo, country, email;
    int imageId;

    public User(String name, String lastMessage, String lastMsgTime,String username, String phoneNo, String email, String country, int imageId) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.lastMsgTime = lastMsgTime;
        this.username = username;
        this.phoneNo = phoneNo;
        this.country = country;
        this.email = email ;
        this.imageId = imageId;

    }
}
