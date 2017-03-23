package com.appbusters.robinkamboj.stockhawk.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appbusters.robinkamboj.stockhawk.model.Data;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<View_Holder>{

    private List<Data> data;
    private int rowLayout;
    private Context context;

    public RVAdapter(List<Data> data, int rowLayout, Context context) {
        this.data = data;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new View_Holder(v);
    }

    @Override
    public void onBindViewHolder(View_Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
