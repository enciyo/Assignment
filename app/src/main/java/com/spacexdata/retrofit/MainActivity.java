package com.spacexdata.retrofit;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.spacexdata.adapter.RecyclerAdapter;
import com.spacexdata.pojo.Repo;
import com.spacexdata.services.API;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by egemenmede on 14/09/2017.
 */

public class MainActivity extends AppCompatActivity {

    RestInterface apiService;
    Context context;

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<Repo> repoList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setScrollingTouchSlop(5);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        apiService = API.getClient().create(RestInterface.class);

        Call<List<Repo>> call=apiService.listRepos();

        call.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                 repoList= response.body();
                recyclerAdapter=new RecyclerAdapter(getApplicationContext(),repoList);
                recyclerView.setAdapter(recyclerAdapter);

            }
            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {

            }
        });




    }
}
