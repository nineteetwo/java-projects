import java.util.Scanner;

public class banking_app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0;
        boolean app = true;
        while(app == true){
        System.out.println("Welcome user, how can I help you");
        System.out.println("--------------------------------");
        System.out.println("1) Deposit Money");
        System.out.println("2) Withdraw Money");
        System.out.println("3) Show Balance");
        System.out.println("4) Exit");
        int choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Enter a valid choice");
            choice = input.nextInt();
        }
        switch (choice) {
            case (1):
                balance = DepositMoney(input, balance);
                break;
            case (2):
                balance = WithdrawMoney(input, balance);
                break;
            case (3):
                System.out.printf("The balance is %f \n", balance);
                break;
            case (4):
                app = false;
                break;
        }}
        input.close();
    }

    public static double DepositMoney(Scanner input, double balance) {
        System.out.println("how much money you would like to deposit");
        double money = input.nextInt();
        while (money <= 0) {
            System.out.println("you mistyped, you can't deposit a negative number");
        }
        System.out.println("Money deposited successfully");
        System.out.printf("New balance: %f\n", money + balance);
        return money + balance;
    }

    public static double WithdrawMoney(Scanner input, double balance) {
        System.out.println("how much money you would like to withdrawt");
        double money = input.nextInt();
        while (money <= 0) {
            System.out.println("you mistyped, you can't withdraw a negative number");
        }
        if (balance - money == 0) {
            System.out.println("insufficient balance");
            return balance;
        } else {
            System.out.println("Money withdrawn successfully");
            System.out.printf("New balance: %f\n", balance - money);
            return balance - money;
        }
    }
}
