package com.example.androidsamples.recyclerview.data.source.remote;

import com.example.androidsamples.BuildConfig;
import com.example.androidsamples.recyclerview.data.pojo.ActivityData;
import com.example.androidsamples.recyclerview.data.source.ThingTodoDataSource;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ThingTodoRemoteDataSource implements ThingTodoDataSource {

    public static final String BASE_URL = "https://www.expedia.com/lx/api/";
    RetrofitInterface anInterface;

    public ThingTodoRemoteDataSource(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if(BuildConfig.DEBUG){
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
            builder = builder.addInterceptor(interceptor);
        }
        OkHttpClient client = builder.connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .addNetworkInterceptor(new Interceptor() {
                    @Override
                    public okhttp3.Response intercept(Chain chain) throws IOException {
                        Request original = chain.request();

                        Request request = original.newBuilder()
                                .header("User-Agent", "SampleApp")
                                .header("Accept", "application/json")
                                .method(original.method(), original.body())
                                .build();

                        return chain.proceed(request);
                    }
                })
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build();

        anInterface = retrofit.create(RetrofitInterface.class);
    }

    @Override
    public void getThingsTodo(String loc, String startDate, String endDate, final GetThingsTodoCallback thingsTodoCallback) {
        Call<ActivityData> call = anInterface.searchActivities(loc, startDate, endDate);
        call.enqueue(new Callback<ActivityData>() {
            @Override
            public void onResponse(Call<ActivityData> call, Response<ActivityData> response) {
                thingsTodoCallback.onThingsReceived(response.body());
            }

            @Override
            public void onFailure(Call<ActivityData> call, Throwable t) {
                thingsTodoCallback.onFailure(t);
            }
        });
    }

}
