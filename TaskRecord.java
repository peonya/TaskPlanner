package TaskPlanner;

import java.util.ArrayList;

public class TaskRecord {

    private ArrayList<Tasks> arrayOfTasks = new ArrayList<>();

    public TaskRecord(ArrayList<Tasks> arrayOfTasks) {
        this.arrayOfTasks.addAll(arrayOfTasks);

    }

    public ArrayList<Tasks> getTaskRecord() {
        return arrayOfTasks;

    }

    public void setTaskRecord(ArrayList<Tasks> arrayOfTasks) {
        this.arrayOfTasks = arrayOfTasks;
    }

}
