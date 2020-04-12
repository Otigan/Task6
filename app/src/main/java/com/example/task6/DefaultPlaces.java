package com.example.task6;


import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class DefaultPlaces {

    //Sample places
    private String[] mLikelyPlaceNames = {"KFC", "Театр имени Мухтара Ауэзова"};
    private String[] mLikelyPlaceAddresses = {"улица Гоголя 44-51, Алматы 050000, Казахстан", "просп. Абая, Алматы 050000, Казахстан"};
    private List[] mLikelyPlaceAttributions;
    private LatLng[] mLikelyPlaceLatLngs = {new LatLng(43.260713, 76.953293),
    new LatLng(43.241487, 76.918108)};



    public String[] getmLikelyPlaceNames() {
        return mLikelyPlaceNames;
    }

    public void setmLikelyPlaceNames(String[] mLikelyPlaceNames) {
        this.mLikelyPlaceNames = mLikelyPlaceNames;
    }

    public String[] getmLikelyPlaceAddresses() {
        return mLikelyPlaceAddresses;
    }

    public void setmLikelyPlaceAddresses(String[] mLikelyPlaceAddresses) {
        this.mLikelyPlaceAddresses = mLikelyPlaceAddresses;
    }

    public List[] getmLikelyPlaceAttributions() {
        return mLikelyPlaceAttributions;
    }

    public void setmLikelyPlaceAttributions(List[] mLikelyPlaceAttributions) {
        this.mLikelyPlaceAttributions = mLikelyPlaceAttributions;
    }

    public LatLng[] getmLikelyPlaceLatLngs() {
        return mLikelyPlaceLatLngs;
    }

    public void setmLikelyPlaceLatLngs(LatLng[] mLikelyPlaceLatLngs) {
        this.mLikelyPlaceLatLngs = mLikelyPlaceLatLngs;
    }
}
