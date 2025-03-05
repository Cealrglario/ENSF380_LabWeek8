package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ToDoList implements IToDoList {
    private ArrayList<Task> tasks;
    private Stack<ArrayList<Task>> taskHistory;

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
        this.tasks.get(Integer.parseInt(task) - 1).setIsCompleted(true);
    }

    @Override
    public void deleteTask(String task) {
        this.taskHistory.add(tasks);
        this.tasks.remove(Integer.parseInt(task) - 1);
    }

    @Override
    public void editTask(String task, String title, boolean isCompleted) {
        this.taskHistory.add(tasks);
        this.tasks.get(Integer.parseInt(task) - 1).setTitle(title);
        this.tasks.get(Integer.parseInt(task) - 1).setIsCompleted(isCompleted);
        this.tasks.get(Integer.parseInt(task) - 1).setID(task);
    }

    @Override
    public void undo() {
        this.tasks = taskHistory.pop();
    }

    @Override
    public ArrayList<Task> listTasks() {
        return this.tasks;
    }
}
