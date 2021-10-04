package entities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TriviaGame {

    TriviaGame triviaGame;
    int score;
    Random rand = new Random();
    Scanner reader = new Scanner(System.in);
    ArrayList<Question> questions = new DataLoader().getTriviaQuestions();
    private boolean notDone = true;
    private String acceptableResponse = "1234";

    /**
     * Read in all of the questions from the DataLoader to create the ArrayList of
     * questions. Here you can initialize rand, and reader, and display the welcome
     * message
     */
    private TriviaGame() {
        System.out.println("\n\n\n Welcome to the game! \n\n\n");
    }

    /**
     * @return TriviaGame
     */
    public static TriviaGame getInstance() {
        return new TriviaGame();
    }

    /**
     * if the user enters q the game is over if the user enters p, they play a round
     * of the game if they enter anything else, the program gives them an error
     * message, and asks them if they want to play or quit
     */
    public void play() {
        while (this.notDone) {
            System.out.println("\nEnter P to play a round or Enter Q to quit");

            char response = this.reader.nextLine().trim().toUpperCase().toCharArray()[0];

            if (response == 'Q' || response == 'q') {
                System.out.println("\n\nThanks for playing\n\n");
                this.notDone = false;
                System.exit(0);
            } else if (response == 'P' || response == 'p') {
                System.out.println(this.playRound() ? "\nKeep Playing!\n"
                        : "\nPlease enter a number 1-4 for your question response\n\n");
            }
        }
    }

    /**
     * 
     * Picks a random trivia question, and displays it Asks the user to enter an
     * answer if they guess the correct answer it gives them a happy message and
     * returns true otherwise it returns false if they did not enter a valid number
     * as their answer it gives them an error message.
     * 
     * @return boolean
     */
    boolean playRound() {

        Question randomQuestion = this.questions.get(this.rand.nextInt(this.questions.size()));

        System.out.println(randomQuestion.toString());

        String userResponse = this.reader.nextLine().trim();

        System.out.println(this.acceptableResponse.contains(userResponse)
                && randomQuestion.answers[Integer.parseInt(userResponse) - 1] == randomQuestion.getCorrectAnswer()
                        ? "Good job!"
                        : "WRONG!\n\nCorrectAnswer:\t" + randomQuestion.getCorrectAnswer() + "\n\n");

        return this.acceptableResponse.contains(userResponse);
    }
}
