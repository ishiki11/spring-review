package jp.ac.morijyobi.springreview.bean.entity;

public class Review {
    private int id;
    private String title;
    private int rate;
    private int reviewTypeCode;

    public Review(int id, String title, int rate, int reviewTypeCode) {
        this.id = id;
        this.title = title;
        this.rate = rate;
        this.reviewTypeCode = reviewTypeCode;
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

    public int getReviewTypeCode() {
        return reviewTypeCode;
    }

    public void setReviewTypeCode(int reviewTypeCode) {
        this.reviewTypeCode = reviewTypeCode;
    }
}
