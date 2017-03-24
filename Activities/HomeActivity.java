package com.goodchild.gigpig.activities.Activities;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.goodchild.gigpig.R;
import com.goodchild.gigpig.activities.Fragments.BandFragment;
import com.goodchild.gigpig.activities.Fragments.MainFragment;

public class HomeActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener, BandFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d("AUTH","HOMEACTIVITY ONCREATE STARTED");
        FragmentManager fragmentManager = getSupportFragmentManager();
        Log.d("AUTH","MAINFRAGMENT activity" + getSupportFragmentManager().toString());
        MainFragment mainFragment = (MainFragment)fragmentManager.findFragmentById(R.id.container_menu);
        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance("Blah","Blah");
            fragmentManager.beginTransaction()
                    .add(R.id.container_menu, mainFragment)
                    .commit();
        } else {
            Log.d("AUTH","MAINFRAGMENT activity FAILED");
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
