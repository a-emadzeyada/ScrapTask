package com.scrap.scraptask.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

import java.util.List;

public class LocationData implements ClusterItem {
    public String image;
    public String id;
    public String name;
    public String latitude;
    public String longitude;
    public String addressOne;
    public String addressTwo;
    public String state;
    public String avgRating;
    public List<RattingValue> rattingValues;
    public String totalReview;
    public String totalRatingCount;
    public String country;
    public String userLocation;
    public String companyType;
    public String category;
    public boolean newJoined;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public String getAddressTwo() {
        return addressTwo;
    }

    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(String avgRating) {
        this.avgRating = avgRating;
    }

    public List<RattingValue> getRattingValues() {
        return rattingValues;
    }

    public void setRattingValues(List<RattingValue> rattingValues) {
        this.rattingValues = rattingValues;
    }

    public String getTotalReview() {
        return totalReview;
    }

    public void setTotalReview(String totalReview) {
        this.totalReview = totalReview;
    }

    public String getTotalRatingCount() {
        return totalRatingCount;
    }

    public void setTotalRatingCount(String totalRatingCount) {
        this.totalRatingCount = totalRatingCount;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewJoined() {
        return newJoined;
    }

    public void setNewJoined(boolean newJoined) {
        this.newJoined = newJoined;
    }

    @NonNull
    @Override
    public LatLng getPosition() {
        return new LatLng(Double.parseDouble(latitude),Double.parseDouble(longitude));
    }

    @Nullable
    @Override
    public String getTitle() {
        return name;
    }

    @Nullable
    @Override
    public String getSnippet() {
        return "";
    }
}
