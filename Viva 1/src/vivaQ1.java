import java.util.Scanner;

public class vivaQ1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int digitalRoot = getDigitalRoot(num);
        System.out.println("Sum of digits until single digit: " + digitalRoot);

        scanner.close();
    }

    public static int getDigitalRoot(int num){
        while(num > 9){
            int sum = 0;

            // Using while loop to sum the digits
            while(num > 0){
                sum += num % 10; 
                num /= 10;
            }

            // Reset the number to the new sum
            num = sum;
        }

        return num;
    }
}
