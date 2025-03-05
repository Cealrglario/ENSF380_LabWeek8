package edu.ucalgary.oop;

import java.util.Objects;

public class Task implements Cloneable {
    private int id;
    private String title;
    private boolean isCompleted;

    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title ;
    }
    public void setTitile(String title) {
        this.title = title;
    }
    public boolean getIsCompleted() {
        return isCompleted ;
    }
    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }    

    public Object clone() throws CloneNotSupportedException {
        Task copy = (Task)super.clone();
        return copy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return Objects.equals(id, task.id) &&
               Objects.equals(title, task.title) &&
               isCompleted == task.isCompleted; 
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, isCompleted);
    }
}
