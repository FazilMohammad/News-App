package com.example.tradptoxn.stockmodels;

import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("timezone")
    private String timezone;
    @SerializedName("end")
    private Integer end;
    @SerializedName("start")
    private Integer start;
    @SerializedName("gmtoffset")
    private Integer gmtoffset;

    public Post() {
    }

    public Post(String timezone, Integer end, Integer start, Integer gmtoffset) {
        this.timezone = timezone;
        this.end = end;
        this.start = start;
        this.gmtoffset = gmtoffset;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getGmtoffset() {
        return gmtoffset;
    }

    public void setGmtoffset(Integer gmtoffset) {
        this.gmtoffset = gmtoffset;
    }

    @Override
    public String toString() {
        return "Post{" +
                "timezone='" + timezone + '\'' +
                ", end=" + end +
                ", start=" + start +
                ", gmtoffset=" + gmtoffset +
                '}';
    }
}
