import java.util.ArrayList;
public class AlwaysRollingBot extends Player {
    public AlwaysRollingBot(String name) {
        super(name, "I just keep rolling.");
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        return true;
    }
}