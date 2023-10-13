import java.util.*;

//Attributes
public class Tamagotchi {
    private int hunger;
    private int boredom;
    private List<String> words = new ArrayList<String>(Arrays.asList("Cutie", "How are you?", "Friend", "Wanna play?", "Hello"));
    private List<String> wordsAdd = new ArrayList<String>(Arrays.asList("Sweet", "How are you feeling?", "Pal", "Wanna do something fun?", "Hey"));
    private boolean isAlive = true;
    private Random generator = new Random();

    Tamagotchi(String name) {

    }

    //Methods

    public void tick() {

        int randomTick = generator.nextInt(2) + 1;
        hunger = hunger + randomTick;
        boredom = boredom + randomTick;
        if (boredom >= 10 || hunger >= 10) {
            isAlive = false;
            System.out.println("Your Tamagotchi died");
        }
        System.out.println("\nHunger increased by " + randomTick + "     " + "Boredom increased by " + randomTick);

    }


    public void Feed() {
        System.out.println("You chose to feed you Tamagotchi");
        int randomHunger = generator.nextInt(2) + 1;
        hunger -= randomHunger;
        if (hunger < 0) hunger = 0;

        System.out.println("You lowered his hunger by " + randomHunger);
    }


    public void Teach() {
        System.out.println("You chose to teach your Tamagotchi a new word");
        words.add(wordsAdd.get(generator.nextInt(wordsAdd.size())));
        reduceBoredom();
    }

    public void PrintStats() {
        System.out.println("Boredom: " + boredom + "   Hunger: " + hunger + "   Alive: " + isAlive);
        System.out.println(" ");

    }

    public void reduceBoredom() {
        int randomBoredom = generator.nextInt(2) + 1;
        boredom -= randomBoredom;
        if (boredom < 0) boredom = 0;
        System.out.println("You lowered his hunger by " + randomBoredom);
    }

    public void Hi() {
        System.out.println("You chose to talk to your Tamagotchi");
        System.out.println(words.get(generator.nextInt(words.size())));
        reduceBoredom();
    }

    //Getters and Setters
    public boolean getIsalive() {
        return this.isAlive;
    }
}
