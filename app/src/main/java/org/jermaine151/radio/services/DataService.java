package org.jermaine151.radio.services;

import org.jermaine151.radio.model.Station;

import java.util.ArrayList;

/**
 * Created by jay on 1/15/17.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {

    }

    public ArrayList<Station> getFeaturedStations() {
        //Pretend that we downloaded data from the internet.

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)","flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children)","kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations() {
        ArrayList<Station> list = new ArrayList<>();
        return list;
    }

    public ArrayList<Station> getPartyStations() {
        ArrayList<Station> list = new ArrayList<>();
        return list;
    }
}
