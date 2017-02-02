package com.example.adrien.musicmaker;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adrien on 30/01/17.
 */

public class SoundsBoardAdapter extends RecyclerView.Adapter<SoundsBoardAdapter.ViewHolder>{

    private Button[] pads;



    public  SoundsBoardAdapter(Button[] mPads){
        pads = mPads;
    }

    @Override
    public SoundsBoardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Button v = (Button) LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final SoundsBoardAdapter.ViewHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        return pads.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public Button pad;

        public ViewHolder(Button itemView) {
            super(itemView);
            pad = itemView;
        }
    }
}
