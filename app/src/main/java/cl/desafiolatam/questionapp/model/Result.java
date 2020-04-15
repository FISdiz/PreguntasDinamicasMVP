package cl.desafiolatam.questionapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("response_code")
    private int responseCode;
    private List<Question> results;

    //getters & setters
    public int getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
    public List<Question> getResults() {
        return results;
    }
    public void setResults(List<Question> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Result{" +
                "responseCode=" + responseCode +
                ", results=" + results +
                '}';
    }
}
