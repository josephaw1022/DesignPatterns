import java.util.Random;

public class Hard implements State {

    private ArithmeticGame game;

    private Random newRandom = new Random();

    public int getInt() {
        int min = 1;
        int max = 100;

        return this.newRandom.nextInt((max - min) + 1) + min;
    }

    public String getOperation() {
        String operations = "+-*/" ; 
        int min = 0;
        int max = operations.length() - 1;
        char[] returnVal = { operations.charAt(this.newRandom.nextInt((max-min)+1)+min) }  ; 
        return returnVal.toString(); 
    }

    public void levelUp() {
        String message = "You are doing so well ";
        System.out.println(message);

    }

    public void levelDown() {
        String message = "You are struggling, you are being switched to medium";
        System.out.println(message);
        game.setState(game.getMediumState());
    }

}
