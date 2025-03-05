package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ToDoList implements IToDoList {
    private List<Task> tasks = new ArrayList<>();
    private Stack<List<Task>> taskHistory = new Stack<>();

    public ToDoList()

    @Override
    public void addTask(Task task) {

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
