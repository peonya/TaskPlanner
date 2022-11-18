package TaskPlanner;

import java.util.Date;

public class Tasks {

    private String task;
    private Integer id;
    private String nameOfAutor;
    private Priority taskPriority;
    private Date date;

    public Tasks(String task, Integer id, String nameOfAutor, Priority taskPriority, Date date) {
        this.task = task;
        this.id = id;
        this.nameOfAutor = nameOfAutor;
        this.taskPriority = taskPriority;
        this.date = new Date();

    }

    public enum Priority {
        HIGH,
        MEDIUM,
        LOW
    }

    public void setTaskPriority(Priority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public Priority getTaskPriority() {
        return taskPriority;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNameofAutor(String nameOfAutor) {
        this.nameOfAutor = nameOfAutor;
    }

    public String getNameofAutor() {
        return nameOfAutor;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "\nTask: " + getTask() + " | ID: " + getId() + "  | Name of Author: " + getNameofAutor()
                + " | Priority: " + getTaskPriority() + "  | Date: " + getDate();
    }

}
