package com.example.adrien.musicmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private  RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button[] p = new Button[50];

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(new SoundsBoardAdapter(p));
    }


}
