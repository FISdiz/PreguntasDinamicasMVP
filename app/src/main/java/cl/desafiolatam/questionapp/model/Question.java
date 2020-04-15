package cl.desafiolatam.questionapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Question {

    //POJOS
    private String category;
    private String type;
    private String difficulty;
    private String question;
    @SerializedName("correct_answer")
    private boolean correctAnswer;
    @SerializedName("incorrect_answer")
    private boolean[] incorrectAnswer;

    public Question(String category, String type, String difficulty, String question, boolean correctAnswer, boolean[] incorrectAnswer) {
        this.category = category;
        this.type = type;
        this.difficulty = difficulty;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.incorrectAnswer = incorrectAnswer;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public boolean isCorrectAnswer() {
        return correctAnswer;
    }
    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    public boolean[] isIncorrectAnswer() {
        return incorrectAnswer;
    }
    public void setIncorrectAnswer(boolean[] incorrectAnswer) {
        this.incorrectAnswer = incorrectAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", question='" + question + '\'' +
                ", correctAnswer=" + correctAnswer +
                ", incorrectAnswer=" + Arrays.toString(incorrectAnswer) +
                '}';
    }
}
