package edu.ucalgary.oop;

import java.util.Objects;

public class Task implements Cloneable {
    private String id;
    private String title;
    private boolean isCompleted;

    public Task(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title ;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isCompleted() {
        return isCompleted ;
    }
    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }    

    public Object clone() throws CloneNotSupportedException {
        try {
            return (Task) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException("Clone not supported for this object.");
        }
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
