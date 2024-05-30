package jp.ac.morijyobi.springreview.service.impl;

import jp.ac.morijyobi.springreview.bean.entity.Review;
import jp.ac.morijyobi.springreview.bean.form.ReviewForm;
import jp.ac.morijyobi.springreview.mapper.ReviewMapper;
import jp.ac.morijyobi.springreview.service.ReviewService;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewMapper reviewMapper;

    public ReviewServiceImpl(ReviewMapper reviewMapper) {
        this.reviewMapper = reviewMapper;
    }

    @Override
    public Review registerReview(ReviewForm reviewForm) {
        Review review = new Review(
                -1,
                reviewForm.getTitle(),
                reviewForm.getRate(),
                reviewForm.getReviewTypeCode()
        );

        reviewMapper.insertReview(review);

        return review;
    }
}
