public class Dealer {
    private double pig1 = 0;
    private double pig2 = 0;
    private String[] rolls = new String[2];

    public Dealer(){
    }
    
    public String pig1Roll() {
        pig1 = Math.random() * 100;
        
        if(pig1 <= 34.9) {
            rolls[0] = "Dot";
            return "Dot";
        }
        else if(pig1 <= 65.1) {
            rolls[0] = "No Dot";
            return "No Dot";
        }
        else if(pig1 <= 87.5) {
            rolls[0] = "Razorback";
            return "Razorback";
        }
        else if(pig1 <= 96.3) {
            rolls[0] = "Trotter";
            return "Trotter";
        }
        else {
            rolls[0] = "Leaning Jowler";
            return "Leaning Jowler";
        }
    }
    public String pig2Roll() {
        pig2 = Math.random() * 100;
        
        if(pig2 <= 34.9) {
            rolls[1] = "Dot";
            return "Dot";
        }
        else if(pig2 <= 65.1) {
            rolls[1] = "No Dot";
            return "No Dot";
        }
        else if(pig2 <= 87.5) {
            rolls[1] = "Razorback";
            return "Razorback";
        }
        else if(pig2 <= 96.3) {
            rolls[1] = "Trotter";
            return "Trotter";
        }
        else {
            rolls[1] = "Leaning Jowler";
            return "Leaning Jowler";
        }
    }
   
    
}