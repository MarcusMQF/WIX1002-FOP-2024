package L4;
import java.util.Random;

public class L4Q6 {
    public static void main(String[] args) {
        Random random = new Random();
        
        //int GeneratedNum = random.nextInt(Integer.MAX_VALUE);
        //System.out.println("Generated Number: " + GeneratedNum);

        // Generate a number with a varying number of digits (1 to 10 digits)
        int numDigits = random.nextInt(10) + 1;
        int GeneratedNum = random.nextInt((int) Math.pow(10, numDigits));

        System.out.println("Generated Number: " + GeneratedNum);

        // Randomly decide if the number should be positive or negative
        if (random.nextBoolean()) {
            GeneratedNum = -GeneratedNum;
        }

        int countDigit = CountDigits(GeneratedNum);
        System.out.println("Number of Digits: " + countDigit);
    }

    // Count how many digits it have 
    public static int CountDigits(int num){
        if (num == 0) {
            return 1;
        }
        return (int) Math.log10(num) + 1;
        // If num is 123, Math.log10(123) is 2.09,
        // and (int)(Math.log10(123) + 1) is 3 (the number of digits in 123).
    }
}
