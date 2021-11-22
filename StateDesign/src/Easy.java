import java.util.Random ; 


public class Easy implements State {
    Random newRandom = new Random();
    private ArithmeticGame game ; 

    public int getInt() {
        int min = 1;
        int max = 10;
        return newRandom.nextInt((max - min) + 1) + min;
    }

    public String getOperation() {
        String operations = "+-"; 
        int min = 0 ; 
        int max = operations.length()-1;
        char[] returnVal = {operations.charAt(this.newRandom.nextInt((max-min)+1)+min)  } ; 
        return returnVal.toString(); 
    }

    public void levelUp() {
        String message = "You have been transfered to medium" ; 
        System.out.println(message) ;  
        game.setState(game.getMediumState()) ; 
    }

    public void levelDown() {
        String message = "You are struggling, you may want to study" ; 
        System.out.println(message) ;  
    }
}
