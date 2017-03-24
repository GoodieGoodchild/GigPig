package com.goodchild.gigpig.activities.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goodchild.gigpig.R;
import com.goodchild.gigpig.activities.Holders.BandViewHolder;
import com.goodchild.gigpig.activities.model.Band;

import java.util.ArrayList;

/**
 * Created by User on 2017-03-21.
 */

public class BandsAdapter extends RecyclerView.Adapter<BandViewHolder> {

    private ArrayList<Band> bands;
    Context context;

    public BandsAdapter (ArrayList<Band> bands) {
        this.bands = bands;

    }


    @Override
    public BandViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View bandCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_band, parent,false);

        return new BandViewHolder(bandCard);
    }

    @Override
    public void onBindViewHolder(BandViewHolder holder, int position) {

        Band band = bands.get(position);
        holder.updateBandUI(band);

    }

    @Override
    public int getItemCount() {
        return bands.size();
    }
}
