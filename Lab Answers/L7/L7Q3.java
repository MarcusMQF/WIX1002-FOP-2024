import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L7Q3 {
    public static void main(String[] args) {
        try {
            // Read all the lines from the input text file
            List<String> lines = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Reverse the order of the lines
            Collections.reverse(lines);

            // Write the reversed lines to the output text file
            PrintWriter writer = new PrintWriter(new FileWriter("reverse.txt"));
            for (String reversedLine : lines) {
                writer.println(reversedLine);
            }
            writer.close();

            System.out.println("Text file reversed and saved as 'reverse.txt'.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
