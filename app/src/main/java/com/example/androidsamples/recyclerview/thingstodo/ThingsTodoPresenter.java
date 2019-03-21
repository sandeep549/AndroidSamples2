package com.example.androidsamples.recyclerview.thingstodo;


import com.example.androidsamples.recyclerview.data.pojo.ActivityData;
import com.example.androidsamples.recyclerview.data.source.ThingTodoDataSource;

public class ThingsTodoPresenter implements ThingsTodoContract.Presenter {

    private final ThingTodoDataSource thingTodoDataSource;
    private ThingsTodoContract.View view;


    public ThingsTodoPresenter(ThingsTodoContract.View view, ThingTodoDataSource thingTodoDataSource) {
        this.view = view;
        this.thingTodoDataSource = thingTodoDataSource;
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void getNearbyActivities(String loc, String startDate, String endDate) {
        thingTodoDataSource.getThingsTodo(loc, startDate, endDate, new ThingTodoDataSource.GetThingsTodoCallback() {
            @Override
            public void onThingsReceived(ActivityData activityData) {
                view.showNearbyActivities(activityData);
            }

            @Override
            public void onFailure(Throwable t) {
                view.showErrorMsg(t.getLocalizedMessage());
            }
        });
    }

}