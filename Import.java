package TaskPlanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Import {

    public void readFile() throws IOException {
        try (BufferedReader br = Files.newBufferedReader(Paths.get("new.csv"))) {

            // CSV file delimiter
            String DELIMITER = ",";

            // read the file line by line
            String line;
            while ((line = br.readLine()) != null) {

                // convert line into columns
                String[] columns = line.split(DELIMITER);

                // print all columns
                System.out.println(String.join(", ", columns));
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
