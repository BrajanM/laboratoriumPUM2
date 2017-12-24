package com.example.student.aplikacjapogodowa;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Brajan on 2017-12-24.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>{

    private ArrayList<Place>places=new ArrayList<>();
    PlaceAdapter(ArrayList<Place> places){this.places=places;}
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main2, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setPlaceName(places.get(position).getPlaceName());
        holder.setTemperature(places.get(position).getTemperature()+"");
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.place_name)
        TextView placeName;

        @BindView(R.id.temperature)
        TextView temperature;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
        private void setPlaceName(String name) {
            placeName.setText(name);
        }

        private void setTemperature(String age) {
            temperature.setText(age);
        }

    }
}
