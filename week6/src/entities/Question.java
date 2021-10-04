package entities;

public class Question {
    String question;
    String[] answers;
    int correctAnswer;

    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        this.answers = new String[] { ans1.trim(), ans2.trim(), ans3.trim(), ans4.trim() };
        this.correctAnswer = correctAnswer;
    }

    /**
     * returns the string representation of the Question and answers
     * @return String
     */
    public String toString() {
        String response = "\n\n" + this.question + "\n\n";
        for (int i = 0; i < this.answers.length; i++) {
            response += (i + 1) + ". " + this.answers[i] + "\n";
        }

        return response;
    }

    /**
     * Returns true if the userAnswer is the correct Answer
     * @param userAnswer
     * @return boolean
     */
    public boolean isCorrect(int userAnswer) {
        return userAnswer == this.correctAnswer;
    }

    /**
     * Returns the text string of the correct answer
     * @return String
     */
    public String getCorrectAnswer() {
        return this.answers[this.correctAnswer].trim();
    }

}
