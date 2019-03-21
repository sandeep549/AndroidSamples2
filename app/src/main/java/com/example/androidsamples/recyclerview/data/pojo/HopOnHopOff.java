package com.example.androidsamples.recyclerview.data.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HopOnHopOff {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("displayValue")
    @Expose
    private String displayValue;
    @SerializedName("categoryType")
    @Expose
    private String categoryType;
    @SerializedName("categoryTypeDisplayValue")
    @Expose
    private String categoryTypeDisplayValue;
    @SerializedName("categoryRank")
    @Expose
    private Integer categoryRank;
    @SerializedName("contextualDisplayValue")
    @Expose
    private String contextualDisplayValue;
    @SerializedName("contextualSingularDisplayValue")
    @Expose
    private String contextualSingularDisplayValue;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategoryTypeDisplayValue() {
        return categoryTypeDisplayValue;
    }

    public void setCategoryTypeDisplayValue(String categoryTypeDisplayValue) {
        this.categoryTypeDisplayValue = categoryTypeDisplayValue;
    }

    public Integer getCategoryRank() {
        return categoryRank;
    }

    public void setCategoryRank(Integer categoryRank) {
        this.categoryRank = categoryRank;
    }

    public String getContextualDisplayValue() {
        return contextualDisplayValue;
    }

    public void setContextualDisplayValue(String contextualDisplayValue) {
        this.contextualDisplayValue = contextualDisplayValue;
    }

    public String getContextualSingularDisplayValue() {
        return contextualSingularDisplayValue;
    }

    public void setContextualSingularDisplayValue(String contextualSingularDisplayValue) {
        this.contextualSingularDisplayValue = contextualSingularDisplayValue;
    }

}
