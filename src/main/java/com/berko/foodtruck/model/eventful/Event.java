
package com.berko.foodtruck.model.eventful;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("watching_count")
    @Expose
    private Object watchingCount;
    @SerializedName("olson_path")
    @Expose
    private String olsonPath;
    @SerializedName("calendar_count")
    @Expose
    private Object calendarCount;
    @SerializedName("comment_count")
    @Expose
    private Object commentCount;
    @SerializedName("region_abbr")
    @Expose
    private String regionAbbr;
    @SerializedName("postal_code")
    @Expose
    private int postalCode;
    @SerializedName("going_count")
    @Expose
    private int goingCount;
    @SerializedName("all_day")
    @Expose
    private String allDay;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("groups")
    @Expose
    private Object groups;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("privacy")
    @Expose
    private String privacy;
    @SerializedName("city_name")
    @Expose
    private String cityName;
    @SerializedName("link_count")
    @Expose
    private Object linkCount;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("country_abbr")
    @Expose
    private String countryAbbr;
    @SerializedName("region_name")
    @Expose
    private String regionName;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("tz_id")
    @Expose
    private Object tzId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("venue_display")
    @Expose
    private String venueDisplay;
    @SerializedName("tz_country")
    @Expose
    private Object tzCountry;
    @SerializedName("performers")
    @Expose
    private Object performers;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("venue_address")
    @Expose
    private String venueAddress;
    @SerializedName("geocode_type")
    @Expose
    private String geocodeType;
    @SerializedName("tz_olson_path")
    @Expose
    private Object tzOlsonPath;
    @SerializedName("recur_string")
    @Expose
    private String recurString;
    @SerializedName("calendars")
    @Expose
    private Object calendars;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("going")
    @Expose
    private Object going;
    @SerializedName("country_abbr2")
    @Expose
    private String countryAbbr2;
    @SerializedName("image")
    @Expose
    private Object image;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("venue_id")
    @Expose
    private String venueId;
    @SerializedName("tz_city")
    @Expose
    private Object tzCity;
    @SerializedName("stop_time")
    @Expose
    private Object stopTime;
    @SerializedName("venue_name")
    @Expose
    private String venueName;
    @SerializedName("venue_url")
    @Expose
    private String venueUrl;

    public Object getWatchingCount() {
        return watchingCount;
    }

    public void setWatchingCount(Object watchingCount) {
        this.watchingCount = watchingCount;
    }

    public String getOlsonPath() {
        return olsonPath;
    }

    public void setOlsonPath(String olsonPath) {
        this.olsonPath = olsonPath;
    }

    public Object getCalendarCount() {
        return calendarCount;
    }

    public void setCalendarCount(Object calendarCount) {
        this.calendarCount = calendarCount;
    }

    public Object getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Object commentCount) {
        this.commentCount = commentCount;
    }

    public String getRegionAbbr() {
        return regionAbbr;
    }

    public void setRegionAbbr(String regionAbbr) {
        this.regionAbbr = regionAbbr;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getGoingCount() {
        return goingCount;
    }

    public void setGoingCount(int goingCount) {
        this.goingCount = goingCount;
    }

    public String getAllDay() {
        return allDay;
    }

    public void setAllDay(String allDay) {
        this.allDay = allDay;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Object getGroups() {
        return groups;
    }

    public void setGroups(Object groups) {
        this.groups = groups;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Object getLinkCount() {
        return linkCount;
    }

    public void setLinkCount(Object linkCount) {
        this.linkCount = linkCount;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryAbbr() {
        return countryAbbr;
    }

    public void setCountryAbbr(String countryAbbr) {
        this.countryAbbr = countryAbbr;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Object getTzId() {
        return tzId;
    }

    public void setTzId(Object tzId) {
        this.tzId = tzId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getVenueDisplay() {
        return venueDisplay;
    }

    public void setVenueDisplay(String venueDisplay) {
        this.venueDisplay = venueDisplay;
    }

    public Object getTzCountry() {
        return tzCountry;
    }

    public void setTzCountry(Object tzCountry) {
        this.tzCountry = tzCountry;
    }

    public Object getPerformers() {
        return performers;
    }

    public void setPerformers(Object performers) {
        this.performers = performers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    public String getGeocodeType() {
        return geocodeType;
    }

    public void setGeocodeType(String geocodeType) {
        this.geocodeType = geocodeType;
    }

    public Object getTzOlsonPath() {
        return tzOlsonPath;
    }

    public void setTzOlsonPath(Object tzOlsonPath) {
        this.tzOlsonPath = tzOlsonPath;
    }

    public String getRecurString() {
        return recurString;
    }

    public void setRecurString(String recurString) {
        this.recurString = recurString;
    }

    public Object getCalendars() {
        return calendars;
    }

    public void setCalendars(Object calendars) {
        this.calendars = calendars;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Object getGoing() {
        return going;
    }

    public void setGoing(Object going) {
        this.going = going;
    }

    public String getCountryAbbr2() {
        return countryAbbr2;
    }

    public void setCountryAbbr2(String countryAbbr2) {
        this.countryAbbr2 = countryAbbr2;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public Object getTzCity() {
        return tzCity;
    }

    public void setTzCity(Object tzCity) {
        this.tzCity = tzCity;
    }

    public Object getStopTime() {
        return stopTime;
    }

    public void setStopTime(Object stopTime) {
        this.stopTime = stopTime;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueUrl() {
        return venueUrl;
    }

    public void setVenueUrl(String venueUrl) {
        this.venueUrl = venueUrl;
    }

}
