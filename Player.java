import java.util.ArrayList;
public class Player {
    private String name;
    public String strategy;
    private int score = 0;
    private int handScore = 0;
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
    public void updateScore() {
        score += handScore;
        handScore = 0; 
    }
    public void updateHandScore(String[] rolls) {
        //Double dots
        if(rolls[0].equals(rolls[1]) && rolls[0].equals("Dot")) {
            handScore += 1;
        }
        //Double no dots
        else if(rolls[0].equals(rolls[1]) && rolls[0].equals("No Dot")) {
            handScore += 1;
        }
        //pig out
        else if(rolls[0].equals("Dot") && rolls[1].equals("No Dot") || rolls[1].equals("Dot") && rolls[0].equals("No Dot")) {
            handScore = 0;
        }
        //when first pig is dot and second is something else
        else if(rolls[0].equals("Dot")) {
            if(rolls[1].equals("Razorback")){
                handScore += 5;
            }
            else if(rolls[1].equals("Trotter")){
                handScore += 5;
            }
            else if(rolls[1].equals("Snouter")){
                handScore += 10;
            }
            else if(rolls[1].equals("Leaning Jowler")){
                handScore += 15;
            }
        }
        //when first pig is no dot and second is something else
        else if(rolls[0].equals("No Dot")) {
            if(rolls[1].equals("Razorback")){
                handScore += 5;
            }
            else if(rolls[1].equals("Trotter")){
                handScore += 5;
            }
            else if(rolls[1].equals("Snouter")){
                handScore += 10;
            }
            else if(rolls[1].equals("Leaning Jowler")){
                handScore += 15;
            }
        }
        //when second pig is dot and first is something else
        else if(rolls[1].equals("Dot")) {
            if(rolls[0].equals("Razorback")){
                handScore += 5;
            }
            else if(rolls[0].equals("Trotter")){
                handScore += 5;
            }
            else if(rolls[0].equals("Snouter")){
                handScore += 10;
            }
            else if(rolls[0].equals("Leaning Jowler")){
                handScore += 15;
            }
        }
        //when second pig is no dot and first is something else
        else if(rolls[1].equals("No Dot")) {
            if(rolls[0].equals("Razorback")){
                handScore += 5;
            }
            else if(rolls[0].equals("Trotter")){
                handScore += 5;
            }
            else if(rolls[0].equals("Snouter")){
                handScore += 10;
            }
            else if(rolls[0].equals("Leaning Jowler")){
                handScore += 15;
            }
        }
        //the big doubles
        else if(rolls[0].equals(rolls[1])) {
            if(rolls[0].equals("Razorback")){
                handScore += 20;
            }
            else if(rolls[0].equals("Trotter")){
                handScore += 20;
            }
            else if(rolls[0].equals("Snouter")){
                handScore += 40;
            }
            else if(rolls[0].equals("Leaning Jowler")){
                handScore += 60;
            }
        }
        else if(rolls[0].equals("Razorback")) {
            if(rolls[1].equals("Trotter")) {
                handScore += 10;
            }
            else if(rolls[1].equals("Snouter")) {
                handScore += 15;
            }
            else if(rolls[1].equals("Leaning Jowler")){
                handScore += 20;
            }
        }
        else if(rolls[0].equals("Trotter")) {
            if(rolls[1].equals("Razorback")) {
                handScore += 10;
            }
            else if(rolls[1].equals("Snouter")) {
                handScore += 15;
            }
            else if(rolls[1].equals("Leaning Jowler")){
                handScore += 20;
            }
        }
        else if(rolls[0].equals("Snouter")) {
            if(rolls[1].equals("Razorback")) {
                handScore += 15;
            }
            else if(rolls[1].equals("Trotter")) {
                handScore += 15;
            }
            else if(rolls[1].equals("Leaning Jowler")){
                handScore += 25;
            }
        }
        else if(rolls[0].equals("Leaning Jowler")) {
            if(rolls[1].equals("Razorback")) {
                handScore += 20;
            }
            else if(rolls[1].equals("Snouter")) {
                handScore += 25;
            }
            else if(rolls[1].equals("Trotter")){
                handScore += 20;
            }
        }
    }
}