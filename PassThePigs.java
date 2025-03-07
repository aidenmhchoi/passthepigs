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
                boolean rolling = true;
                while(rolling) {
                    if(player.wantsToRoll(player.getScore(), player.getHandScore(), player.getOtherScores(), player.getWinningScore())) {
                        System.out.println(player.getName() + " rolls a " + dealer.pig1Roll() + " and a " + dealer.pig2Roll());
                        player.updateHandScore(dealer.getRolls());
                        if(player.getScore() + player.getHandScore() >= 100) {
                            System.out.println(players.get(i).getName() + " wins!!!");
                            game = false;
                            rolling = false;
                        }
                        if(dealer.getRolls()[0].equals("Dot") && dealer.getRolls()[1].equals("No Dot") || dealer.getRolls()[0].equals("No Dot") && dealer.getRolls()[1].equals("Dot")) {
                            rolling = false;
                        }
                    }
                    else {
                        System.out.println(players.get(i).getName() + " passes.");
                        rolling = false;
                    }
                }
                player.updateScore();
            }
            for(int i=0; i<players.size(); i++) {
                Player player = players.get(i);
                System.out.print(player.getName() + ": " + player.getScore() + " | ");
            }
            System.out.println("");    
        }
    }
}