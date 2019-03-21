package com.example.androidsamples.recyclerview.thingstodo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidsamples.R;


public class ActivityViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public ImageView activityPhoto;
    public TextView activityName;
    public TextView activityDuration;
    public TextView activityPrice;
    public TextView activityPriceLabel;

    public ActivityViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        activityPhoto = itemView.findViewById(R.id.activity_photo);
        activityName = itemView.findViewById(R.id.activity_name);
        activityDuration = itemView.findViewById(R.id.activity_duration);
        activityPrice = itemView.findViewById(R.id.activity_price);
        activityPriceLabel = itemView.findViewById(R.id.activity_price_label);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),
                String.format(view.getContext().getString(R.string.text_position_clicked),
                        getAdapterPosition()),
                Toast.LENGTH_SHORT).show();
    }
}
