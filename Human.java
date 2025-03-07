import java.util.ArrayList;
import java.util.Scanner;

public class Human extends Player {
    Scanner sc = new Scanner(System.in);

    public Human(String name) {
        super(name, "");
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        System.out.println("Would you like to roll?");
        System.out.println("Type \"y\" for yes and \"n\" for no");
        String input = sc.nextLine();
        return input.equals("y");
    }
    
}