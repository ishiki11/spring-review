package jp.ac.morijyobi.springreview.service;

import jp.ac.morijyobi.springreview.bean.ReviewList;
import jp.ac.morijyobi.springreview.bean.entity.Review;
import jp.ac.morijyobi.springreview.bean.form.ReviewForm;

import java.util.List;

public interface ReviewService {
    Review registerReview(ReviewForm reviewForm);

    List<ReviewList> getAllReview();

    ReviewList getReviewById(int id);

    int deleteReview(int id);

}
