package edu.ucalgary.oop;

import java.util.ArrayList;

interface IToDoList {
    void add(Task task);
    void complete(Task task);
    void delete(Task task);
    void edit(Task task);
    void undo();
    ArrayList<Task> list();
}