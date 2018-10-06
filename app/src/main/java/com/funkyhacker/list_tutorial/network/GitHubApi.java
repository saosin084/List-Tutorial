package com.funkyhacker.list_tutorial.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GitHubApi {
    @GET("users/")
    Call<List<GitHubItem>> getUser();
}
