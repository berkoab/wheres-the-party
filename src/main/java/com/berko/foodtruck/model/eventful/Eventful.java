
package com.berko.foodtruck.model.eventful;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Eventful {

    @SerializedName("last_item")
    @Expose
    private Object lastItem;
    @SerializedName("total_items")
    @Expose
    private String totalItems;
    @SerializedName("first_item")
    @Expose
    private Object firstItem;
    @SerializedName("page_number")
    @Expose
    private String pageNumber;
    @SerializedName("page_size")
    @Expose
    private String pageSize;
    @SerializedName("page_items")
    @Expose
    private Object pageItems;
    @SerializedName("search_time")
    @Expose
    private String searchTime;
    @SerializedName("page_count")
    @Expose
    private String pageCount;
    @SerializedName("events")
    @Expose
    private Events events;

    public Object getLastItem() {
        return lastItem;
    }

    public void setLastItem(Object lastItem) {
        this.lastItem = lastItem;
    }

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public Object getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(Object firstItem) {
        this.firstItem = firstItem;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public Object getPageItems() {
        return pageItems;
    }

    public void setPageItems(Object pageItems) {
        this.pageItems = pageItems;
    }

    public String getSearchTime() {
        return searchTime;
    }

    public void setSearchTime(String searchTime) {
        this.searchTime = searchTime;
    }

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

}
