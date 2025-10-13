import java.util.Scanner;

public class compound_interest_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double principal = input.nextDouble();
        // I purposely didn't check if it's negative. Because it can also be used as a debt interest rate calculator.
        System.out.println("Enter the interest rate:");
        double interestRate = input.nextDouble() / 100;
        System.out.println("Enter the times of compounding per year:");
        int compoundTimes = input.nextInt();
        System.out.println("How many years will the money will be in bank?");
        int year = input.nextInt();
        double helper = interestRate / compoundTimes;
        for (int i = 0; i < compoundTimes * year; i++) {
            principal += principal * helper;
        }
        System.out.println(principal);
        input.close();
    }
}
