package com.goodchild.gigpig.activities.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goodchild.gigpig.R;
import com.goodchild.gigpig.activities.Holders.EventViewHolder;
import com.goodchild.gigpig.activities.model.Gig;

import java.util.ArrayList;

/**
 * Created by User on 2017-03-19.
 */

public class EventsAdapter extends RecyclerView.Adapter<EventViewHolder> {

    //store the events

    private ArrayList<Gig> gigs;

    public EventsAdapter(ArrayList<Gig> gigs) {
        this.gigs = gigs;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View eventCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_event, parent, false);

        return new EventViewHolder(eventCard);
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {

        Gig gig = gigs.get(position);
        holder.updateUI(gig);

    }

    @Override
    public int getItemCount() {
        return gigs.size();
    }

}
