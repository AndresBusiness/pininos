package com.example.apprestapi.Vista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.apprestapi.Listado.Adapter;
import com.example.apprestapi.Listado.RecyclerTouchListener;
import com.example.apprestapi.R;
import com.example.apprestapi.Retrofit.MyApiAdapter;
import com.example.apprestapi.Modelo.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity implements Callback<users[]> {

    public Adapter adapter;
    public List<users> listItems = new ArrayList<>();
    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView       = (RecyclerView) findViewById(R.id.recycler_view);

        Call<users[]> callUpdate = MyApiAdapter.getApiService().getUsers();
        callUpdate.enqueue(this);
    }


    @Override
    public void onResponse(Call<users[]> call, Response<users[]> response) {
        if(response.isSuccessful()){
            users[] data = response.body();
            listItems = Arrays.asList(data);
            recyclerView.setHasFixedSize(true);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            adapter = new Adapter(listItems, this);
            recyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();

            // EVENTO QUE ESCUCHA EL CLIC DE CADA ITEM DE LA LISTA AL SER PRECIONADO
            recyclerView.addOnItemTouchListener(new RecyclerTouchListener(this,
                    recyclerView, new RecyclerTouchListener.ClickListener() {
                @Override
                public void onClick(View view, int position) {
                    users user = listItems.get(position);
                    Toast.makeText(getApplicationContext(), "Nombre: "+ user.getNombre() , Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onLongClick(View view, int position) {

                }
            }));
        } else {
        }
    }

    @Override
    public void onFailure(Call<users[]> call, Throwable t) {

    }
}
