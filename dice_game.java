import java.util.Scanner;

public class dice_game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many times would you like to roll the dice?");
        int diceTimes = input.nextInt();
        int result = 0;
        int temp;
        while (diceTimes <= 0) {
            System.out.println("enter a valid number");
            diceTimes = input.nextInt();
        }
        for (int i = 0; i < diceTimes; i++) {
            temp = rollTheDice();
            result += temp;
            System.out.printf("This time is %d, and the total result is %d\n", temp, result);
        }
        input.close();
    }

    public static int rollTheDice() {
        int result = (int) (Math.random() * 6) + 1;
        return result;
    }
}
