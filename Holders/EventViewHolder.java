package com.goodchild.gigpig.activities.Holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.goodchild.gigpig.R;
import com.goodchild.gigpig.activities.model.Gig;

/**
 * Created by User on 2017-03-19.
 */

public class EventViewHolder extends RecyclerView.ViewHolder {

    private ImageView mainImage;
    private TextView gigTitleTextView;
    private TextView gigDateTextView;
    private TextView gigTimeTextView;
    private TextView gigLocationTextView;

    public EventViewHolder(View itemView) {
        super(itemView);

        this.mainImage = (ImageView)itemView.findViewById(R.id.location_image);
        this.gigTitleTextView = (TextView)itemView.findViewById(R.id.gig_name);
        this.gigDateTextView = (TextView)itemView.findViewById(R.id.gig_date);
        this.gigTimeTextView = (TextView)itemView.findViewById(R.id.gig_time);
        this.gigLocationTextView = (TextView)itemView.findViewById(R.id.gig_location);


    }

    public void updateUI(Gig gig) {
        String uri = gig.getImgUri();
        int resource = mainImage.getResources().getIdentifier(uri,null, mainImage.getContext().getPackageName());

        gigTitleTextView.setText(gig.getGigTitle());
        gigDateTextView.setText(gig.getGigDate());
        gigTimeTextView.setText(gig.getGigtime());
        gigLocationTextView.setText(gig.getGigLocation());
        mainImage.setImageResource(resource);
    }

}
