import java.util.Scanner;

public class weight_converter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select what to convert");
        System.out.println("======================================================");
        System.out.println("(1) Kilogram | (2) Pound");
        int choice = input.nextInt();
        double weight;
        while (choice != 1 && choice != 2) {
            System.out.println("Enter a valid choice");
            choice = input.nextInt();
        }
        switch (choice) {
            case 1:
                System.out.println("enter weight in pounds");
                weight = input.nextDouble();
                weight = controller(weight, input);
                double temp = weight;
                weight /= 2.20452;
                System.out.printf("the weight %.2f is %.2f in kilograms.\n", temp, weight);
                break;
            case 2:
                System.out.println("enter weight in kilograms");
                weight = input.nextDouble();
                weight = controller(weight, input);
                double tempo = weight;
                weight *= 2.20452;
                System.out.printf("the weight %.2f is %.2f in pounds.\n", tempo, weight);
                break;
        }
        input.close();
    }

    public static double controller(double weight, Scanner input) {
        while (weight <= 0) {
            System.out.println("enter a calculatable thing:");
            weight = input.nextDouble();
        }
        return weight;
    }
}
