import java.util.ArrayList;
public class Player {
    private String name;
    public String strategy;
    private static ArrayList<Integer> otherScores = new ArrayList<Integer>();
    private static int winningScore = 0;

    public int getScore() {
        return score;
    }
    public int getHandScore() {
        return handScore;
    }
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        return true;
    }
    public Player(String name, String strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public String getStrategy() {
        return strategy;
    }
    public ArrayList<Integer> getOtherScores() {
        return otherScores;
    }
    public int getWinningScore() {
        return winningScore;
    }
}