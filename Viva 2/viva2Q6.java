import java.util.Scanner;

public class viva2Q6 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numTestCases = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[numTestCases];
        String[] startTimes = new String[numTestCases];
        String[] endTimes = new String[numTestCases];

        // Collect all input details
        for (int i = 0; i < numTestCases; i++) {
            names[i] = scanner.nextLine();
            startTimes[i] = scanner.nextLine();
            endTimes[i] = scanner.nextLine();
        }

        // Process and display output for each set of details
        for (int i = 0; i < numTestCases; i++) {
            String name = names[i];
            String startTime = startTimes[i];
            String endTime = endTimes[i];

            String initials = generateInitials(name);
            boolean printWelcomeMessage = isPrintingWelcomeMessage(name);
            String interval = calculateInterval(startTime, endTime);

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            if (printWelcomeMessage) {
                System.out.println("Welcome to G101, Kolej Kediaman Kinabalu, Universiti Malaya!");
            }
            System.out.println(initials);
            if (name.toLowerCase().contains("kah sing") && name.toLowerCase().contains("lee")) {
                if (name.toLowerCase().indexOf("lee") < name.toLowerCase().indexOf("kah sing")) {
                    System.out.println("WE KNOW IT'S YOU!");
                } else {
                    System.out.println("WE KNOW IT'S YOU -- LEE KAH SING!");
                }
            }
            if (interval.compareTo("06:00:00") < 0) {
                System.out.println("SLEEP NOW!!!!!!!!!!");
            }
            System.out.println(interval);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

        scanner.close();
    }

    public static String generateInitials(String name) {
        String[] parts = name.split("[\\s'-_./]"); // Split by whitespace, apostrophe, dash, underscore, dot, and slash
        StringBuilder initials = new StringBuilder();
        for (String part : parts) {
            if (!part.isEmpty() && !part.equalsIgnoreCase("a/l") && !part.equalsIgnoreCase("a/p") && !part.equalsIgnoreCase("bin") && !part.equalsIgnoreCase("binti")) {
                initials.append(part.charAt(0)); // Append the first letter of each valid part
            }
        }
        return initials.toString().toUpperCase();
    }

    public static boolean isPrintingWelcomeMessage(String name) {
        String lowerName = name.toLowerCase();
        return lowerName.contains("kah sing") || lowerName.contains("lee") || lowerName.contains("suresh") || lowerName.contains("ridwan");
    }

    public static String calculateInterval(String startTime, String endTime) {
        String[] startParts = startTime.split(":");
        String[] endParts = endTime.split(":");

        int startHours = Integer.parseInt(startParts[0]);
        int startMinutes = Integer.parseInt(startParts[1]);
        int startSeconds = Integer.parseInt(startParts[2]);

        int endHours = Integer.parseInt(endParts[0]);
        int endMinutes = Integer.parseInt(endParts[1]);
        int endSeconds = Integer.parseInt(endParts[2]);

        int startTotalSeconds = startHours * 3600 + startMinutes * 60 + startSeconds;
        int endTotalSeconds = endHours * 3600 + endMinutes * 60 + endSeconds;

        int intervalSeconds = endTotalSeconds - startTotalSeconds;
        if (intervalSeconds < 0) {
            intervalSeconds += 24 * 3600; // Add 24 hours in seconds
        }

        int intervalHours = intervalSeconds / 3600;
        int intervalMinutes = (intervalSeconds % 3600) / 60;
        int intervalRemainingSeconds = intervalSeconds % 60;

        return String.format("%02d:%02d:%02d", intervalHours, intervalMinutes, intervalRemainingSeconds);
    }
}