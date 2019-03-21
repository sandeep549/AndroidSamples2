package com.example.androidsamples.recyclerview.data.source;


import com.example.androidsamples.recyclerview.data.pojo.ActivityData;

public interface ThingTodoDataSource {
    interface GetThingsTodoCallback {
        void onThingsReceived(ActivityData activityData);
        void onFailure(Throwable t);
    }

    void getThingsTodo(String loc, String startDate, String endDate, GetThingsTodoCallback thingsTodoCallback);
}