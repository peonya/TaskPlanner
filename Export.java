package TaskPlanner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Export {

    public void export(ArrayList<Tasks> arrayOfTasks) throws IOException {

        FileWriter csvWriter = new FileWriter("new.csv");
        csvWriter.append("Task");
        csvWriter.append("       | ");
        csvWriter.append("ID");
        csvWriter.append("        | ");
        csvWriter.append("Name of author");
        csvWriter.append("        | ");
        csvWriter.append("Priority");
        csvWriter.append("        | ");
        csvWriter.append("Date & Time");
        csvWriter.append("\n");

        for (Tasks data : arrayOfTasks) {
            csvWriter.append(
                    data.getTask() + "," + data.getId() + "," + data.getNameofAutor() + "," + data.getTaskPriority()
                            + "," + data.getDate());
            csvWriter.append("\n");
        }

        csvWriter.close();

    }

}
