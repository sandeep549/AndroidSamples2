package com.example.androidsamples.recyclerview.data.source.remote;


import com.example.androidsamples.recyclerview.data.pojo.ActivityData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {
    @GET("search/")
    Call<ActivityData> searchActivities(@Query("rid") String rid, @Query("startDate") String startDate,
                                        @Query("endDate") String endDate);
}
