package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person ps : persons) {
            if (ps.getName().contains(key) || ps.getSurname().contains(key) || ps.getPhone().contains(key)
                    || ps.getAddress().contains(key)) {
                result.add(ps);
            }
        }
        return result;
    }
}
