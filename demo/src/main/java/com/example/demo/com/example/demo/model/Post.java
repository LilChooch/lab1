package com.example.demo.com.example.demo.model;

public class Post {
    private String text;
    private Integer likes;

    public  Post(String text, Integer likes)
    {
        this.likes=likes;
        this.text = text;
    }
    public String getText()
    {
        return text;
    }
    public Integer getLikes()
    {
        return likes;
    }
    public void Add(String text){
        this.text += text;
    }

}
