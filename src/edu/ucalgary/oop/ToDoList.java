package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ToDoList implements IToDoList {
    private List<Task> tasks = new ArrayList<>();
    private Stack<List<Task>> taskHistory = new Stack<>();


    @Override
    public void add(Task task) {

    }

    @Override
    public void complete(Task task) {

    }

    @Override
    public void delete(Task task) {

    }

    @Override
    public void edit(Task task) {

    }

    @Override
    public void undo() {

    }

    @Override
    public ArrayList<Task> list() {
        return null;
    }
}
