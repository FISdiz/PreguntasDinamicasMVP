package cl.desafiolatam.questionapp.model.api;

import cl.desafiolatam.questionapp.model.Result;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("api.php?amount=5&category=18&difficulty=medium&type=boolean")
    Call<Result> getQuestions();
}
