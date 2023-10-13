
import java.util.*;


public class Questions {
    //Attributes
    int money = 100;
    private Random generator = new Random();
    private List<String> questions = new ArrayList<String>(Arrays.asList("4+4?", "17+22", "2+7", "13+4", "22+2", "26-4", "7-2", "18/6", "5*5", "11-10", "7+6", "18-2?", "8/2"));
    private List<String> answers = new ArrayList<String>(Arrays.asList("8", "39", "9", "17?", "24", "22", "5", "3", "25", "1", "13", "16", "4"));

    //Methods
    public void randomQuestion() {
        int random = generator.nextInt(3);
        System.out.println("\nAnswer this easy math question for 10 dollars: " + (questions.get(random)));
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (userInput.contains(answers.get(random))) {
            System.out.println("Correct - 10 dollars gained");
            money += 10;
        } else System.out.println("\n Wrong - You gain no money");

    }

}
