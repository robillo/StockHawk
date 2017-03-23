package com.appbusters.robinkamboj.stockhawk.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.appbusters.robinkamboj.stockhawk.R;
import com.appbusters.robinkamboj.stockhawk.controller.RVAdapter;
import com.appbusters.robinkamboj.stockhawk.model.Data;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RVAdapter adapter;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<Data> data = fillWithData();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        layoutManager = new LinearLayoutManager(this);
        Log.e("RVA", "RVA");
        recyclerView.setLayoutManager(layoutManager);
        
        adapter = new RVAdapter(data, R.layout.row_layout, getApplicationContext());
        Log.e("RVA", "RVA");
        recyclerView.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private List<Data> fillWithData(){
        List<Data> data = new ArrayList<>();
        data.add(new Data("YHOO", "Yahoo! Inc.", "0.143", "+46%"));
        data.add(new Data("YHOO", "Yahoo! Inc.", "0.143", "+46%"));
        data.add(new Data("YHOO", "Yahoo! Inc.", "0.143", "+46%"));
        data.add(new Data("YHOO", "Yahoo! Inc.", "0.143", "+46%"));
        data.add(new Data("YHOO", "Yahoo! Inc.", "0.143", "+46%"));
        data.add(new Data("YHOO", "Yahoo! Inc.", "0.143", "+46%"));
        data.add(new Data("YHOO", "Yahoo! Inc.", "0.143", "+46%"));
        data.add(new Data("YHOO", "Yahoo! Inc.", "0.143", "+46%"));
        data.add(new Data("YHOO", "Yahoo! Inc.", "0.143", "+46%"));
        return data;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
