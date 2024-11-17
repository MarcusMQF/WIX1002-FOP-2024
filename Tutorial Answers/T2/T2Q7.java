import java.util.Scanner;

public class T2Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value in inch: ");
        double inch = scanner.nextDouble();
        double cm = inch * 2.54;

        System.out.println(inch + " inch = " + (String.format("%.3f", cm)) + " cm");

        scanner.close();
    }
}

// Write  a  java  program  that  converts  inches  to  meters.  (Given  1  inch  equals  to  2.54 
// centimeters). Print the output in two decimal places. 
