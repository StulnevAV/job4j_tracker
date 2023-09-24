package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setOwner("Вася Пупкин");
        student.setGroup("Информатика");
        student.setEnroll(new Date());

        System.out.println(student.getOwner() + " поступил в группу - " + student.getGroup() + " : "
                + student.getEnroll());
    }
}
