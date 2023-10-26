package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public HashSet<String> extractNumber(List<Task> taskList) {
        HashSet<String> numbers = new HashSet<>();
        for (Task tasks : taskList) {
            numbers.add(tasks.getNumber());
        }
        return numbers;
    }
}
