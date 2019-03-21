package com.example.androidsamples.recyclerview.thingstodo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidsamples.R;
import com.example.androidsamples.recyclerview.data.pojo.NearbyActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int CATEGORY = 1;
    private List<NearbyActivity> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<NearbyActivity> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ActivityViewHolder holder = null;
        switch (viewType){
            case CATEGORY:
                break;
            default:
                View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_list, null);
                holder = new ActivityViewHolder(layoutView);
        }

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()){
            case CATEGORY:
                break;
            default:
                ActivityViewHolder holder = (ActivityViewHolder) viewHolder;
                holder.activityDuration.setText(itemList.get(position).getDuration());
                holder.activityName.setText(itemList.get(position).getTitle());
                holder.activityPrice.setText(itemList.get(position).getFromPrice());
                holder.activityPriceLabel.setText(itemList.get(position).getFromPriceLabel());
                Picasso.get().setIndicatorsEnabled(true);
                Picasso.get()
                        .load(itemList.get(position).getImageUrl())
                        .fit()
                        .centerCrop()
                        .into(holder.activityPhoto);
        }
    }


    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
