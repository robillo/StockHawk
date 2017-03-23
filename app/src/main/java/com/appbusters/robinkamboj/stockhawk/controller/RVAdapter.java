package com.appbusters.robinkamboj.stockhawk.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appbusters.robinkamboj.stockhawk.model.Data;

import java.util.Collections;
import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<View_Holder>{

    private List<Data> data = Collections.emptyList();
    private int rowLayout;

    public RVAdapter(List<Data> data, int rowLayout, Context context) {
        this.data = data;
        this.rowLayout = rowLayout;
    }

    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        View_Holder holder = new View_Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(View_Holder holder, int position) {
        holder.stock_symbol.setText(data.get(position).getStock_symbol());
        holder.stock_name.setText(data.get(position).getStock_name());
        holder.seeds.setText(data.get(position).getSeeds());
        holder.percent.setText(data.get(position).getPercent());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
