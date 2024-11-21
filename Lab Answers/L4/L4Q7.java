import java.util.Scanner;

public class L4Q7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter interest rate in %: ");
        double interestRate = scanner.nextDouble() / 100.0; // Convert to decimal

        System.out.print("Enter total number of months: ");
        int totalMonths = scanner.nextInt();

        double monthlyPayment = calculateMonthlyPayment(principal, interestRate, totalMonths);
        System.out.printf("Monthly payment: $%.2f%n", monthlyPayment);

        System.out.println("\nAmortization Table:");
        System.out.println("Month\tPrincipal\tInterest\tUnpaid Balance\tTotal Interest");
        double unpaidBalance = principal;
        double totalInterest = 0.0;

        for (int month = 1; month <= totalMonths; month++) {
            double interest = calculateInterest(unpaidBalance, interestRate);
            double principalPayment = monthlyPayment - interest;
            unpaidBalance -= principalPayment;
            totalInterest += interest;

            System.out.printf("%d\t$%.2f\t$%.2f\t$%.2f\t$%.2f%n",
                             month, principalPayment, interest, unpaidBalance, totalInterest);
        }

        scanner.close();
    }

    public static double calculateMonthlyPayment(double principal, double interestRate, int totalMonths) {
        double monthlyRate = interestRate / 12.0;
        return principal * (monthlyRate / (1 - Math.pow(1 + monthlyRate, -totalMonths)));
    }

    public static double calculateInterest(double unpaidBalance, double interestRate) {
        return unpaidBalance * (interestRate / 12.0);
    }
}
