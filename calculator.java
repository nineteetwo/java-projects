import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("||  (1) Addition | (2) Subtraction | (3) Multiplication | (4) Division  ||");
        int choice = input.nextInt();
        while (choice > 4 || choice < 1) {
            System.out.println("Enter a valid choice");
            choice = input.nextInt();
        }
        System.out.println("enter the first number");
        double number1 = input.nextDouble();
        System.out.println("enter the second number");
        double number2 = input.nextDouble();
        double result;
        switch (choice) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                result = number1 / number2;
                break;
            default:
                result = 0;
        }
        System.out.printf("the result is %f", result);
        input.close();
    }
}
