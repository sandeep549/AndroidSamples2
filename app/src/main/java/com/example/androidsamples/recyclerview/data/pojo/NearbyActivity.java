package com.example.androidsamples.recyclerview.data.pojo;


import java.util.List;

import com.google.gson.annotations.SerializedName;

public class NearbyActivity {

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("imageUrl")
    private String imageUrl;

    @SerializedName("largeImageURL")
    private String largeImageURL;

    @SerializedName("fromPrice")
    private String fromPrice;

    @SerializedName("fromPriceValue")
    private String fromPriceValue;

    @SerializedName("fromPriceLabel")
    private String fromPriceLabel;

    @SerializedName("fromOriginalPrice")
    private String fromOriginalPrice;

    @SerializedName("fromOriginalPriceValue")
    private String fromOriginalPriceValue;

    @SerializedName("duration")
    private String duration;

    @SerializedName("durationInMillis")
    private Long durationInMillis;

    @SerializedName("fromPriceTicketType")
    private String fromPriceTicketType;

    @SerializedName("fromPriceTicketCode")
    private String fromPriceTicketCode;

    @SerializedName("discountPercentage")
    private String discountPercentage;

    @SerializedName("formattedTitle")
    private String formattedTitle;

    @SerializedName("categories")
    private List<String> categories = null;

    @SerializedName("latLng")
    private String latLng;

    @SerializedName("redemptionType")
    private String redemptionType;

    @SerializedName("supplierName")
    private String supplierName;

    @SerializedName("recommendationScore")
    private Integer recommendationScore;

    @SerializedName("scoreOutOf5")
    private Float scoreOutOf5;

    @SerializedName("reviewScoreThresholdMet")
    private Boolean reviewScoreThresholdMet;

    @SerializedName("hotelPickupEnabled")
    private Boolean hotelPickupEnabled;

    @SerializedName("approvedReviewCount")
    private Integer approvedReviewCount;

    @SerializedName("shortDescription")
    private Object shortDescription;

    @SerializedName("isBoostedNewActivity")
    private Boolean isBoostedNewActivity;

    @SerializedName("promoPricingAvailable")
    private Boolean promoPricingAvailable;

    @SerializedName("redemptionLocations")
    private List<String> redemptionLocations = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    public String getFromPrice() {
        return fromPrice;
    }

    public void setFromPrice(String fromPrice) {
        this.fromPrice = fromPrice;
    }

    public String getFromPriceValue() {
        return fromPriceValue;
    }

    public void setFromPriceValue(String fromPriceValue) {
        this.fromPriceValue = fromPriceValue;
    }

    public String getFromPriceLabel() {
        return fromPriceLabel;
    }

    public void setFromPriceLabel(String fromPriceLabel) {
        this.fromPriceLabel = fromPriceLabel;
    }

    public String getFromOriginalPrice() {
        return fromOriginalPrice;
    }

    public void setFromOriginalPrice(String fromOriginalPrice) {
        this.fromOriginalPrice = fromOriginalPrice;
    }

    public String getFromOriginalPriceValue() {
        return fromOriginalPriceValue;
    }

    public void setFromOriginalPriceValue(String fromOriginalPriceValue) {
        this.fromOriginalPriceValue = fromOriginalPriceValue;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Long getDurationInMillis() {
        return durationInMillis;
    }

    public void setDurationInMillis(Long durationInMillis) {
        this.durationInMillis = durationInMillis;
    }

    public String getFromPriceTicketType() {
        return fromPriceTicketType;
    }

    public void setFromPriceTicketType(String fromPriceTicketType) {
        this.fromPriceTicketType = fromPriceTicketType;
    }

    public String getFromPriceTicketCode() {
        return fromPriceTicketCode;
    }

    public void setFromPriceTicketCode(String fromPriceTicketCode) {
        this.fromPriceTicketCode = fromPriceTicketCode;
    }

    public String getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getFormattedTitle() {
        return formattedTitle;
    }

    public void setFormattedTitle(String formattedTitle) {
        this.formattedTitle = formattedTitle;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getLatLng() {
        return latLng;
    }

    public void setLatLng(String latLng) {
        this.latLng = latLng;
    }

    public String getRedemptionType() {
        return redemptionType;
    }

    public void setRedemptionType(String redemptionType) {
        this.redemptionType = redemptionType;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getRecommendationScore() {
        return recommendationScore;
    }

    public void setRecommendationScore(Integer recommendationScore) {
        this.recommendationScore = recommendationScore;
    }

    public Float getScoreOutOf5() {
        return scoreOutOf5;
    }

    public void setScoreOutOf5(Float scoreOutOf5) {
        this.scoreOutOf5 = scoreOutOf5;
    }

    public Boolean getReviewScoreThresholdMet() {
        return reviewScoreThresholdMet;
    }

    public void setReviewScoreThresholdMet(Boolean reviewScoreThresholdMet) {
        this.reviewScoreThresholdMet = reviewScoreThresholdMet;
    }

    public Boolean getHotelPickupEnabled() {
        return hotelPickupEnabled;
    }

    public void setHotelPickupEnabled(Boolean hotelPickupEnabled) {
        this.hotelPickupEnabled = hotelPickupEnabled;
    }

    public Integer getApprovedReviewCount() {
        return approvedReviewCount;
    }

    public void setApprovedReviewCount(Integer approvedReviewCount) {
        this.approvedReviewCount = approvedReviewCount;
    }

    public Object getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(Object shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Boolean getIsBoostedNewActivity() {
        return isBoostedNewActivity;
    }

    public void setIsBoostedNewActivity(Boolean isBoostedNewActivity) {
        this.isBoostedNewActivity = isBoostedNewActivity;
    }

    public Boolean getPromoPricingAvailable() {
        return promoPricingAvailable;
    }

    public void setPromoPricingAvailable(Boolean promoPricingAvailable) {
        this.promoPricingAvailable = promoPricingAvailable;
    }

    public List<String> getRedemptionLocations() {
        return redemptionLocations;
    }

    public void setRedemptionLocations(List<String> redemptionLocations) {
        this.redemptionLocations = redemptionLocations;
    }

}