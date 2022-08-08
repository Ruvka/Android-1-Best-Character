package com.example.tvseriesinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MySeriesAdapter extends RecyclerView.Adapter<MySeriesAdapter.ViewHolder> {

    MySeriesData[] mySeriesData;
    Context context;

    public MySeriesAdapter(MySeriesData[] mySeriesData, MainActivity activity) {
        this.mySeriesData = mySeriesData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.series_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MySeriesData mySeriesDataList = mySeriesData[position];
        holder.textViewName.setText(mySeriesDataList.getSeriesName());
        holder.textViewDate.setText(mySeriesDataList.getSeriesDate());
        holder.seriesImage.setImageResource(mySeriesDataList.getSeriesImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, mySeriesDataList.getSeriesName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mySeriesData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView seriesImage;
        TextView textViewName;
        TextView textViewDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            seriesImage = itemView.findViewById(R.id.imageview);
            textViewName = itemView.findViewById(R.id.textName);
            textViewDate = itemView.findViewById(R.id.textdate);

        }
    }

}