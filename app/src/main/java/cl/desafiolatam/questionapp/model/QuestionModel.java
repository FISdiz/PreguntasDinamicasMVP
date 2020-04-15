package cl.desafiolatam.questionapp.model;

import android.widget.Toast;

import java.util.List;

import cl.desafiolatam.questionapp.model.api.Api;
import cl.desafiolatam.questionapp.model.api.RetrofitClient;
import cl.desafiolatam.questionapp.view.MainActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuestionModel implements IModel{

    @Override
    public void loadQuestion() {
        Api service = RetrofitClient.getRetrofitInstance().create(Api.class);
        Call<Result> call = service.getQuestions();

        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                List<Question> questionList = response.body().getResults();
                String question1;
                //traer la primera pregunta
                question1 = questionList.get(0).getQuestion();
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });

    }
}
