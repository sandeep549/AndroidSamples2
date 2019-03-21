package com.example.androidsamples.recyclerview.thingstodo;

import com.example.androidsamples.recyclerview.BasePresenter;
import com.example.androidsamples.recyclerview.BaseView;
import com.example.androidsamples.recyclerview.data.pojo.ActivityData;

public interface ThingsTodoContract {
    interface View extends BaseView<Presenter> {
        void showNearbyActivities(ActivityData activityData);
        void showErrorMsg(String error);
    }

    interface Presenter extends BasePresenter {
        void getNearbyActivities(String loc, String startDate, String endDate);
    }
}
