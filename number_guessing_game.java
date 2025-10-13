import java.util.Scanner;

public class number_guessing_game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        System.out.println("Try! And guess the number!");
        int userInput = input.nextInt();
        while (userInput != number) {
            if (userInput < number) {
                System.out.println("TOO LOW! TRY AGAIN");
            } else if (userInput > number) {
                System.out.println("TOO HIGH! TRY AGAIN");
            }
            userInput = input.nextInt();
        }
        System.out.printf("YOU FOUND THE NUMBER %d! CONGRATULATIONS\n", number);
        input.close();
    }
}
