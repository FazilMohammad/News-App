package com.example.tradptoxn.stockmodels;

import com.google.gson.annotations.SerializedName;

public class CurrentTradingPeriod {
    @SerializedName("pre")
    private Pre pre;
    @SerializedName("regular")
    private Regular regular;
    @SerializedName("post")
    private Post post;

    public CurrentTradingPeriod() {
    }

    public CurrentTradingPeriod(Pre pre, Regular regular, Post post) {
        this.pre = pre;
        this.regular = regular;
        this.post = post;
    }

    public Pre getPre() {
        return pre;
    }

    public void setPre(Pre pre) {
        this.pre = pre;
    }

    public Regular getRegular() {
        return regular;
    }

    public void setRegular(Regular regular) {
        this.regular = regular;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "CurrentTradingPeriod{" +
                "pre=" + pre +
                ", regular=" + regular +
                ", post=" + post +
                '}';
    }
}
