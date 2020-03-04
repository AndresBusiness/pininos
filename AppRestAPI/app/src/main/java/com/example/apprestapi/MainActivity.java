package com.example.apprestapi;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import android.os.Bundle;
import android.widget.TextView;
import com.example.apprestapi.Retrofit.MyApiAdapter;
import com.example.apprestapi.Retrofit.response.userResponse;



public class MainActivity extends AppCompatActivity implements Callback<userResponse[]> {

    TextView txtMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtMessage = findViewById(R.id.IdTxtMessage);
        this.txtMessage.setText("cargando ... ");

        Call<userResponse[]> callUpdate = MyApiAdapter.getApiService().getUsers();
        callUpdate.enqueue(this);
    }


    @Override
    public void onResponse(Call<userResponse[]> call, Response<userResponse[]> response) {
        if(response.isSuccessful()){
            userResponse[] data = response.body();

        } else {
            this.txtMessage.setText("error en el onResponse");
        }
    }

    @Override
    public void onFailure(Call<userResponse[]> call, Throwable t) {
        this.txtMessage.setText("Error onFailure: "+ t.getMessage());

    }
}
