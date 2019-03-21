package com.example.androidsamples.recyclerview.data.source;

public class ThingTodoRepository implements ThingTodoDataSource {

    private ThingTodoDataSource localDataSource;
    private ThingTodoDataSource remoteDataSource;

    public ThingTodoRepository(ThingTodoDataSource local, ThingTodoDataSource remote){
        this.localDataSource = local;
        this.remoteDataSource = remote;
    }

    @Override
    public void getThingsTodo(String loc, String startDate, String endDate, GetThingsTodoCallback thingsTodoCallback) {
        remoteDataSource.getThingsTodo(loc, startDate, endDate, thingsTodoCallback);
    }
}
