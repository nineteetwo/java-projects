import java.util.Scanner;

public class shopping_cart_program {
    public static void main(String[] args) {
        boolean add = true;
        double total = 0.0;
        Scanner input = new Scanner(System.in);
        while (add == true) {
            System.out.println("What would you like to buy?");
            String item = input.nextLine();
            System.out.printf("What's the price of the %s\n", item);
            double price = input.nextDouble();
            System.out.printf("how many %s's are you going to buy?\n", item);
            int quantity = input.nextInt();
            total += price * quantity;
            System.out.println("Would you like to buy something else? \n (1) Yes | (0) No");
            int choice = input.nextInt();
            while (choice != 1 && choice != 0) {
                System.out.println("invalid choice. Enter again");
                choice = input.nextInt();
            }
            if (choice == 0) {
                add = false;
            }
        }
        System.out.printf("The total price is %f", total);
        input.close();
    }
}
