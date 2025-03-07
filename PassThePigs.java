import java.util.ArrayList;

public class PassThePigs {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new AlwaysRollingBot("Always Rolling Bot"));
        players.add(new Human("Aiden"));

        
        System.out.println("Let's play Pass the Pigs!");

        boolean game = true;

        while(game) {
            for(int i=0; i<players.size(); i++) {
                Player player = players.get(i);
                if(player.wantsToRoll(player.getScore(), player.getHandScore(), player.getOtherScores(), player.getWinningScore())) {
                    System.out.println(player.getName() + " rolls a " + dealer.pig1Roll() + " and a " + dealer.pig2Roll());
                }
                else {
                    System.out.println(players.get(i).getName() + " passes.");
                }
            }
        }
    }
}