package com.example.spring_ted;
import java.util.*;

public class User {

    private final long id;
    private final String name;
    private final String mail;
    private final String password;

    private final Info information;
    private final Timeline timeline;
    //private final Settings settings;
    //private final Friends friends;

    public User(long id, String name, String mail, String password, Info information, Timeline timeline) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.information = information;
        this.timeline = timeline;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail(){
      return mail;
    }
}
