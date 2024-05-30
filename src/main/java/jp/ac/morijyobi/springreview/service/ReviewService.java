package jp.ac.morijyobi.springreview.service;

import jp.ac.morijyobi.springreview.bean.entity.Review;
import jp.ac.morijyobi.springreview.bean.form.ReviewForm;

public interface ReviewService {
    Review registerReview(ReviewForm reviewForm);
}
