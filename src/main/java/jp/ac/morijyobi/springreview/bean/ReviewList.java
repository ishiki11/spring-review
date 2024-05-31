package jp.ac.morijyobi.springreview.bean;

import jp.ac.morijyobi.springreview.bean.entity.ReviewType;

public class ReviewList {
    private int id;
    private String title;
    private int rate;
    private String reviewTypeCode;
    private String reviewTypeName;

    public ReviewList(int id, String title, int rate, String reviewTypeCode, String reviewTypeName) {
        this.id = id;
        this.title = title;
        this.rate = rate;
        this.reviewTypeCode = reviewTypeCode;
        this.reviewTypeName = reviewTypeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getReviewTypeCode() {
        return reviewTypeCode;
    }

    public void setReviewTypeCode(String reviewTypeCode) {
        this.reviewTypeCode = reviewTypeCode;
    }

    public String getReviewTypeName() {
        return reviewTypeName;
    }

    public void setReviewTypeName(String reviewTypeName) {
        this.reviewTypeName = reviewTypeName;
    }
}
