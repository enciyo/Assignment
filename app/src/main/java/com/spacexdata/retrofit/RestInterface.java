package com.spacexdata.retrofit;


import com.spacexdata.pojo.Repo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by egemenmede on 14/09/2017.
 */

public interface RestInterface {

    @GET("v2/launches")
    Call<List<Repo>> listRepos();

}
