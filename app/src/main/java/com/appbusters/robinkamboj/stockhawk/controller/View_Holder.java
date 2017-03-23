package com.appbusters.robinkamboj.stockhawk.controller;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.appbusters.robinkamboj.stockhawk.R;

public class View_Holder extends RecyclerView.ViewHolder{

    public TextView stock_symbol, stock_name, seeds, percent;

    public View_Holder(View itemView) {
        super(itemView);
        stock_symbol = (TextView) itemView.findViewById(R.id.stock_symbol);
        stock_name = (TextView) itemView.findViewById(R.id.stock_name);
        seeds = (TextView) itemView.findViewById(R.id.seeds);
        percent = (TextView) itemView.findViewById(R.id.percent);
    }
}
