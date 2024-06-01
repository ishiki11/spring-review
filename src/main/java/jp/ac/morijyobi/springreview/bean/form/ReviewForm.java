package jp.ac.morijyobi.springreview.bean.form;

import jakarta.validation.constraints.NotBlank;

public class ReviewForm {
    @NotBlank
    private String title;

    private int rate = 3;

    @NotBlank
    private String reviewTypeCode;

    public ReviewForm() {

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
}
