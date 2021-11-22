import java.util.Random ; 
public class Medium implements State {

    private ArithmeticGame game;
    
    Random newRandom = new Random();
    public int getInt() {
        int min = 1;
        int max = 50;
        return newRandom.nextInt((max - min) + 1) + min;
    }

    public String getOperation() {
        
        String operations = "+-*" ; 
        int min = 0;
        int max = operations.length()- 1;
        char[] returnVal = { operations.charAt(this.newRandom.nextInt((max-min)+1)+min) }  ; 
        return returnVal.toString(); 
    }

    public void levelUp() {
        String message = "You have been transfered to hard";
        System.out.println(message);
        game.setState(game.getHardState()) ; 
    }

    public void levelDown() {
        String message = "You are struggling, you are being switched to easy";
        System.out.println(message);
        game.setState(game.getEasyState()) ; 
    }
}