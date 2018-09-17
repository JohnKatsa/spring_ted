package com.example.spring_ted;
import java.util.*;

public class Timeline {

    class Comment{
      String name;
      String comment;
    };

    private final long id;
    private final String text;
    private final String path;  // path of photo or video shared
    private final List<Comment> comments;   // name,text
    private final List<String> likes;

    public Timeline(long id, String text, String path) {
        this.id = id;
        this.text = text;
        this.path = path;
        this.comments = new ArrayList<Comment>();
        this.likes = new ArrayList<String>();
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getPath() {
        return path;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<String> getLikes() {
        return likes;
    }
}
