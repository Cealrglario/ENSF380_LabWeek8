package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ToDoList implements IToDoList {
    private List<Task> tasks;
    private Stack<List<Task>> taskHistory;

    public ToDoList() {
        this.tasks = new ArrayList<>();
        this.taskHistory = new Stack<>();
    }

    @Override
    public void addTask(Task task) {
        this.taskHistory.add(tasks);
    }

    @Override
    public void completeTask(Task task) {

    }

    @Override
    public void deleteTask(Task task) {

    }

    @Override
    public void editTask(Task task) {

    }

    @Override
    public void undo() {

    }

    @Override
    public ArrayList<Task> list() {
        return null;
    }
}
