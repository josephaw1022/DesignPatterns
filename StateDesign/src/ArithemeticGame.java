import java.text.MessageFormat;
import java.util.Scanner;

public class ArithemeticGame {

    State easyState;
    State mediumState;
    State hardState;
    State state;
    int score;
    Scanner reader;

    public ArithemeticGame() {
        this.easyState = new Easy();
        this.mediumState = new Medium();
        this.hardState = new Hard();
        this.state = this.easyState;
    
    }

    public void pressQuestionButton() {
        int int1 = this.state.getInt();
        int int2 = this.state.getInt();
        String operation = this.state.getOperation();
        int correctAnswer = this.getCorrectAnswer(int1, int2, operation);
        System.out.println(MessageFormat.format("\n\n{0} {2} {1}  ?", new Object[] { int1, int2, operation }));

        // get their input
        String userInput = reader.nextLine();

        if (correctAnswer == Integer.parseInt(new String(userInput))) {
            this.score++;
            if (this.score >= 3) this.handleEqualTwo(); 
            if (this.score <= -3) this.handleEqualNegativeTwo() ; 
        }

    }

    public void setState(State state) {
        this.state = state;
    }

    // public State getEasyState() {
    //     return this.easyState;
    // }

    public State getMediumState() {
        return this.mediumState;
    }

    public State getHardState() {
        return this.hardState;
    }

    public State getEasyState(){ 
        return this.easyState ; 
    }

    private int getCorrectAnswer(int int1, int int2, String operation) {
        if (operation == "+") {
            return int1 + int2;
        }
        if (operation == "-") {
            return int1 - int2;
        }
        if (operation == "*") {
            return int1 * int2;
        }
        if (operation == "/") {
            return int1 / int2;
        }
    }


    private void handleEqualTwo(){
        this.state.levelUp() ; 
        this.score = 0 ; 
    }

    private void handleEqualNegativeTwo(){
        this.state.levelDown() ; 
        this.score = 0 ; 
    }

}
