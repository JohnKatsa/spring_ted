package com.example.spring_ted;
import java.util.*;

public class Info {

    private final long id;
    private final List<String> education;
    private final List<String> work;

    public Info(long id, List<String> education, List<String> work) {
        this.id = id;
        this.education = education;
        this.work = work;
    }

    public long getId() {
        return id;
    }

    public List<String> getEducation() {
        return education;
    }

    public List<String> getWork() {
        return work;
    }
}
