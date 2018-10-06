package com.funkyhacker.list_tutorial.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Calendar;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class ApiManager {
    private static final String GITHUB_MEMBER_URL = "https://api.github.com/users";
    private Gson gson;
    private OkHttpClient okHttpClient;
    private Retrofit retrofit;

    private Gson provideGson() {
        if (gson != null) {
            return gson;
        }
        gson = new Gson();

        return gson;
    }

    private OkHttpClient provideOkHttpClient() {
        if (okHttpClient != null) {
            return okHttpClient;
        }

        okHttpClient = new OkHttpClient.Builder()
                .build();

        return okHttpClient;
    }

    private Retrofit provideRetrofit() {
        if (retrofit != null) {
            return retrofit;
        }
        retrofit = new Retrofit.Builder()
                .baseUrl(GITHUB_MEMBER_URL)
                .client(provideOkHttpClient())
                .build();

        return retrofit;
    }
}
