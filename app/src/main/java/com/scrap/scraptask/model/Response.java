package com.scrap.scraptask.model;

import java.util.List;

public class Response {
    public boolean error;
    public String status;
    public List<LocationData> locationData;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<LocationData> getLocationData() {
        return locationData;
    }

    public void setLocationData(List<LocationData> locationData) {
        this.locationData = locationData;
    }
}
