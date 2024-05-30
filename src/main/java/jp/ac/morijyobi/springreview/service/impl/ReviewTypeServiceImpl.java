package jp.ac.morijyobi.springreview.service.impl;

import jp.ac.morijyobi.springreview.bean.entity.ReviewType;
import jp.ac.morijyobi.springreview.mapper.ReviewTypeMapper;
import jp.ac.morijyobi.springreview.service.ReviewTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewTypeServiceImpl implements ReviewTypeService {
    private final ReviewTypeMapper reviewTypeMapper;

    public ReviewTypeServiceImpl(ReviewTypeMapper reviewTypeMapper) {
        this.reviewTypeMapper = reviewTypeMapper;
    }

    @Override
    public List<ReviewType> getAllReviewTypes() {
        return reviewTypeMapper.selectAllReviewTypes();
    }
}
