package com.example.androidsamples.recyclerview.thingstodo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.androidsamples.R;
import com.example.androidsamples.recyclerview.data.pojo.ActivityData;
import com.example.androidsamples.recyclerview.data.source.ThingTodoRepository;
import com.example.androidsamples.recyclerview.data.source.remote.ThingTodoRemoteDataSource;

public class ThingsTodoActivity extends AppCompatActivity implements ThingsTodoContract.View{

    private ThingsTodoContract.Presenter presenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thingstodo);
        initViews();

        // create presenter
        new ThingsTodoPresenter(this,
                new ThingTodoRepository(null, new ThingTodoRemoteDataSource()));
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.getNearbyActivities("178276", "2019-03-18", "2019-03-30");
    }

    @Override
    public void showNearbyActivities(ActivityData activityData) {
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this,
                activityData.getActivities());
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    @Override
    public void showErrorMsg(String error) {
    }

    @Override
    public void setPresenter(ThingsTodoContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
