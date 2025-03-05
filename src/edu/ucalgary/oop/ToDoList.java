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
        this.tasks.add(task);
    }

    @Override
    public void completeTask(String task) {
        this.taskHistory.add(tasks);

    }

    @Override
    public void deleteTask(String task) {
        this.taskHistory.add(tasks);
        this.tasks.remove(task);
    }

    @Override
    public void editTask(String task, String title, boolean isCompleted) {
        this.taskHistory.add(tasks);

    }

    @Override
    public void undo() {
        this.tasks = taskHistory.pop();
    }

    @Override
    public ArrayList<Task> list() {
        return null;
    }
}
