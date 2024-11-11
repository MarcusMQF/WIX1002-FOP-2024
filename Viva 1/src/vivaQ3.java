import java.util.Scanner;

public class vivaQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while(true){
            System.out.print("Enter a positive number greater than 1: ");
            num = scanner.nextInt();

            if(num > 1){
                break;
            }else{
                System.out.println("The input should be a positive integer greater than 1.");
            }
        }

        boolean result = isPrime(num);

        if(result){
            System.out.println(num + " is a prime number.");
        }else{
            System.out.println(num + " is not a prime number.");
            long factorSum = calculate(num);
            Perfect(num, factorSum);
            DisplayPrime(num);
        }

        scanner.close();
    }

    public static boolean isPrime(int num){
        boolean isPrime = true;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
            
        }
        
        return isPrime;
    }

    public static long calculate(int num){
        int factorCount = 0;
        long factorSum = 0;
        long factorProduct = 1;
        boolean overflow = false;

        System.out.print("The factors of this integer are: ");
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                factorCount++;
                factorSum += i;
                if(factorProduct <= Long.MAX_VALUE / i){
                    factorProduct *= i;
                }else{
                    overflow = true;
                }
                    System.out.print(i + " ");
                }
            }

            System.out.println();
            System.out.println("The number of factors is " + factorCount);
            System.out.println("The sum of the factors is " + factorSum);

            if(overflow){
                System.out.println("The product of the factors is too large to display");
            }else{
                System.out.println("The product of the factors is " + factorProduct);
            }

        return factorSum;
    }

    public static void Perfect(int num, long factorSum){
        if(factorSum - num == num){
            System.out.println(num + " is a perfect number.");
        }else{
            System.out.println(num + " is not a perfect number.");
        }
    }

    public static void DisplayPrime(int num){
        System.out.print("The prime number between 2 and " + num + " are: ");
        for(int i = 2; i <= num; i++){
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}