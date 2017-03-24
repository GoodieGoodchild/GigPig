package com.goodchild.gigpig.activities.Services;

import com.goodchild.gigpig.activities.model.Band;
import com.goodchild.gigpig.activities.model.Gig;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by User on 2017-03-19.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Gig> gigs() {
        //pretend we just downloaded data
        ArrayList<Gig> gigList = new ArrayList<>();

        gigList.add(new Gig("Rock Event", "19th March", "22h00", "Pretoria", "aandklas"));
        gigList.add(new Gig("Music Fest", "20th March", "22h00", "Jozi", "zanzibar"));
        gigList.add(new Gig("Local Gig", "21th March", "22h00", "CT", "eightballguns"));
        gigList.add(new Gig("Acoustic", "22th March", "22h00", "Durbs", "gig4"));

        return gigList;
    }

    public ArrayList<Band> bands() {

        ArrayList<Band> bandList = new ArrayList<>();

        bandList.add(new Band("ISO","Alternative Rock","ISO ARE AWESOME","Riichard, Alex, Nic, Franco","gig1"));
        bandList.add(new Band("Matthew Mole","Alternative Homo","All my songs sound the same","Matthew Mole","matthewmole"));
        bandList.add(new Band("The Parlotones","Soft Cock Rock","The Parlotones are the Parlotones.","Khan, Paul, Glenn, the Drummer","theparlotones"));

        return bandList;
    }



}
