package TaskPlanner;

import TaskPlanner.Tasks.Priority;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) throws IOException {
        ArrayList<Tasks> arrayOfTasks = new ArrayList<>();
        arrayOfTasks.add(new Tasks("Type and seal the documents", 122, "Sidorov O.R.", Priority.LOW, null));
        arrayOfTasks.add(new Tasks("Prepare the contract", 124, "Petrov I.A.", Priority.MEDIUM, null));
        arrayOfTasks.add(new Tasks("Call the boss", 126, "Petrov I.A.", Priority.HIGH, null));

        System.out.println(arrayOfTasks);

        // new Export().export(arrayOfTasks);
        new Import().readFile();

    }

}
