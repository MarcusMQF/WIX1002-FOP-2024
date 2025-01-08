import java.io.*;

public class L7Q4 {
    public static void main(String[] args) {
        try {
            // Open the text file for reading
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            int characterCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.split(" ");
                wordCount += words.length;
                characterCount += line.length();
            }

            reader.close();

            System.out.println("Number of characters: " + characterCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
