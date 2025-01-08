import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class L7Q2 {
    public static void main(String[] args) {
        try {
            // Create a URL object for the web page
            URL url = new URL("http://www.fsktm.um.edu.my/");

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Get the input stream from the connection
            InputStream inputStream = connection.getInputStream();

            // Create a BufferedReader to read the input stream
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

            // Create a FileWriter to write the contents to a file
            FileWriter writer = new FileWriter("index.htm");
            String line;

            // Read the contents of the web page and write them to the file
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }

            // Close the input stream, connection, and file writer
            reader.close();
            connection.disconnect();
            writer.close();

            System.out.println("Web page contents written to 'index.htm'.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
