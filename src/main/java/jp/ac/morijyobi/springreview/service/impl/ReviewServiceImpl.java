package jp.ac.morijyobi.springreview.service.impl;

import jp.ac.morijyobi.springreview.bean.entity.Review;
import jp.ac.morijyobi.springreview.bean.ReviewList;
import jp.ac.morijyobi.springreview.bean.form.ReviewForm;
import jp.ac.morijyobi.springreview.mapper.ReviewListMapper;
import jp.ac.morijyobi.springreview.mapper.ReviewMapper;
import jp.ac.morijyobi.springreview.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewMapper reviewMapper;
    private final ReviewListMapper reviewListMapper;

    public ReviewServiceImpl(ReviewMapper reviewMapper, ReviewListMapper reviewListMapper) {
        this.reviewMapper = reviewMapper;
        this.reviewListMapper = reviewListMapper;
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

    @Override
    public List<ReviewList> getAllReview() {
        return reviewListMapper.selectAllReviewList();
    }

    @Override
    public ReviewList getReviewById(int id) {
        return reviewListMapper.selectReviewListById(id);
    }

    @Override
    public int deleteReview(int id) {
        return reviewMapper.deleteReviewById(id);
    }

    @Override
    public int editReview(Review review) {
        return reviewMapper.updateReview(review);
    }

    @Override
    public List<ReviewList> getSearchReview(String typeCode, String titleWord) {
        return reviewListMapper.selectReviewListByTypeAndWord(typeCode, titleWord);
    }
}
