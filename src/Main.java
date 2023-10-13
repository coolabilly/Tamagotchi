import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Let user name their Tamagotchi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Tamagotchi name: ");
        String name = scanner.nextLine();

        Tamagotchi tama = new Tamagotchi(name);
        Questions question = new Questions();

        while (tama.getIsalive()) {


            tama.PrintStats();

            System.out.println("\nUser money: " + question.money);
            System.out.println("\nChoose between: ");
            System.out.println("1. Teach new word (Price 10)");
            System.out.println("2. Talking to " + name + " (Price 10)");
            System.out.println("3. Feed (Price 10)");
            System.out.println("4. Do nothing");

            while (tama.getIsalive()) {

                String userInput = scanner.nextLine();

                if (userInput.equals("1")) {
                    tama.Teach();
                    question.money -= 10;
                    break;
                }
                if (userInput.equals("2")) {
                    tama.Hi();
                    question.money -= 10;
                    break;
                }
                if (userInput.equals("3")) {
                    tama.Feed();
                    question.money -= 10;
                    break;
                }
                if (userInput.equals("4")) {
                    break;
                } else System.out.println("Wrongful input - Choose between 1, 2, 3, 4");
            }
            question.randomQuestion();

            tama.tick();
        }
    }
}