import java.util.Scanner;

public class quiz_game {
    public static void main(String[] args) {
        char choice;
        int trueIncreaser = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("welcome to java quiz game");
        System.out.println("=========================================================");
        String first = "1. What does \"CPU\" stand for?\n" +
                "\n" +
                "a) Central Processing Unit\n" +
                "b) Central Programming Unit\n" +
                "c) Central Power Unit\n" +
                "d) Computer Power Unit\n";
        String second = "2. Which of these is an example of an operating system?\n" +
                "\n" +
                "a) Microsoft Word\n" +
                "b) Windows 10\n" +
                "c) Adobe Photoshop\n" +
                "d) Google Chrome\n";
        String third = "3. What does \"RAM\" stand for in a computer?\n" +
                "\n" +
                "a) Read Access Memory\n" +
                "b) Random Access Memory\n" +
                "c) Run Access Memory\n" +
                "d) Real-time Access Memory\n";
        String fourth = "4. Which of the following is used to store data permanently in a computer?\n" +
                "\n" +
                "a) RAM\n" +
                "b) CPU\n" +
                "c) Hard Drive\n" +
                "d) Monitor\n";
        String fifth = "5. What is the main function of the operating system?\n" +
                "\n" +
                "a) To process data\n" +
                "b) To run applications\n" +
                "c) To manage computer hardware and software\n" +
                "d) To store files\n";
        String[] questions = {first, second, third, fourth, fifth};
        char[] answers = {'a', 'b', 'b', 'c', 'c'};
        char[] userInput = new char[5];
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("What do you think about the answer?");
            choice = input.next().charAt(0);
            while (choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd') {
                System.out.println("Invalid answer, enter again.");
                choice = input.next().charAt(0);
            }
            userInput[i] = choice;
        }
        for (int j = 0; j < questions.length; j++) {
            if (answers[j] == userInput[j]) {
                trueIncreaser++;
            }
            if (answers[j] != userInput[j]) {
                System.out.printf("%dth question is wrong.\n", j + 1);
            }
        }
        System.out.printf("you have %d true answers.\n", trueIncreaser);
        input.close();
    }
}
