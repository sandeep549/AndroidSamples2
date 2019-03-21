package com.example.androidsamples.recyclerview.data.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ActivityData {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("activities")
    @Expose
    private List<NearbyActivity> activities = null;
    @SerializedName("isLocationRedirected")
    @Expose
    private Boolean isLocationRedirected;
    @SerializedName("distanceUnit")
    @Expose
    private String distanceUnit;
    @SerializedName("regionId")
    @Expose
    private String regionId;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("dateAdjusted")
    @Expose
    private Boolean dateAdjusted;
    @SerializedName("filterCategories")
    @Expose
    private FilterCategories filterCategories;
    @SerializedName("currencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("status")
    @Expose
    private String status;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<NearbyActivity> getActivities() {
        return activities;
    }

    public void setActivities(List<NearbyActivity> activities) {
        this.activities = activities;
    }

    public Boolean getIsLocationRedirected() {
        return isLocationRedirected;
    }

    public void setIsLocationRedirected(Boolean isLocationRedirected) {
        this.isLocationRedirected = isLocationRedirected;
    }

    public String getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Boolean getDateAdjusted() {
        return dateAdjusted;
    }

    public void setDateAdjusted(Boolean dateAdjusted) {
        this.dateAdjusted = dateAdjusted;
    }

    public FilterCategories getFilterCategories() {
        return filterCategories;
    }

    public void setFilterCategories(FilterCategories filterCategories) {
        this.filterCategories = filterCategories;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
