import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what to convert?\n(1) celsius |(2) fahrenheit");
        int choice = input.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("enter a valid choice");
            choice = input.nextInt();
        }
        String type = (choice == 1) ? "fahrenheit" : "celsius"; // :)
        System.out.printf("enter the temperature in %s\n", type);
        double temperature = input.nextDouble();
        String result = (choice == 1) ? "The result is " + ((5.0 / 9) * (temperature - 32)) : "The result is " + ((temperature * 9.0 / 5) + 32);
        System.out.println(result);
    }
}
