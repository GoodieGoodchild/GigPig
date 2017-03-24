package com.goodchild.gigpig.activities.Holders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.goodchild.gigpig.R;
import com.goodchild.gigpig.activities.Activities.EndorseBand;
import com.goodchild.gigpig.activities.model.Band;

import java.util.ArrayList;

/**
 * Created by User on 2017-03-21.
 */

public class BandViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ImageView bandImage;
    private TextView bandNameTextView;
    private TextView bandGenreTextView;
    private TextView bandMembersTextView;
    private TextView bandDescriptionTextView;

    public BandViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

        this.bandImage = (ImageView)itemView.findViewById(R.id.band_image);
        this.bandNameTextView = (TextView)itemView.findViewById(R.id.band_name);
        this.bandGenreTextView = (TextView)itemView.findViewById(R.id.band_genre);
        this.bandMembersTextView = (TextView)itemView.findViewById(R.id.band_members);
        this.bandDescriptionTextView = (TextView)itemView.findViewById(R.id.band_descrption);

    }

    public void updateBandUI(Band band) {
        String uri = band.getImgBandUri();
        int resource = bandImage.getResources().getIdentifier(uri,null, bandImage.getContext().getPackageName());

        bandNameTextView.setText(band.getBandName());
        bandGenreTextView.setText(band.getBandGenre());
        bandMembersTextView.setText("Band Members: " + band.getBandMembers());
        bandDescriptionTextView.setText("Band Description: " + band.getBandDescription());
        bandImage.setImageResource(resource);

    }


    @Override
    public void onClick(View view) {




    }
}
