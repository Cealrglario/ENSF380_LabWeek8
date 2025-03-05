package edu.ucalgary.oop;

import java.util.ArrayList;

interface IToDoList {
    void addTask(Task task);
    void completeTask(String task);
    void deleteTask(String task);
    void editTask(String task, String title, boolean isCompleted);
    void undo();
    ArrayList<Task> listTasks();
}