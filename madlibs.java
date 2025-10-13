import java.util.Scanner;

public class madlibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first adjective:");
        String adj1 = input.nextLine();
        System.out.println("Enter the first noun:");
        String noun1 = input.nextLine();
        System.out.println("Enter the second adjective");
        String adj2 = input.nextLine();
        System.out.println("Enter the verb:");
        String verb = input.nextLine();
        System.out.println("Enter the second noun");
        String noun2 = input.nextLine();
        System.out.println("Enter the third adjective");
        String adj3 = input.nextLine();
        System.out.println("Result\n ----------------------------------------");
        System.out.println("Today I went to a " + adj1 + " zoo.");
        System.out.printf("In an exhibit, I saw a %s.\n", noun1);
        System.out.printf("%s was %s and %s!\n", noun1, adj2, verb);
        System.out.printf("I was %s! \n", adj3);
        input.close();
    }
}
