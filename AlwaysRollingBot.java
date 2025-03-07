import java.util.ArrayList;
public class AlwaysRollingBot extends Player {

    private int score = 0;
    private int handScore = 0;
    
    public AlwaysRollingBot(String name) {
        super(name, "I just keep rolling.");
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        return true;
    }

    public int getScore() {
        return score;
    }
    public int getHandScore() {
        return handScore;
    }

}