package ru.job4j.pojo;

import java.util.Date;

public class Student {

    private String owner;
    private String group;
    private Date enroll;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getEnroll() {
        return enroll;
    }

    public void setEnroll(Date enroll) {
        this.enroll = enroll;
    }
}
