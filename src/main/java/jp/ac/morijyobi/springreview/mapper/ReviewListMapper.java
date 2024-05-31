package jp.ac.morijyobi.springreview.mapper;

import jp.ac.morijyobi.springreview.bean.ReviewList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReviewListMapper {

    @Select("SELECT review. id, review.title, review.rate, review.review_type_code, review_type.type_name " +
            "FROM review INNER JOIN review_type ON review.review_type_code = review_type.type_code " +
            "ORDER BY id")
    List<ReviewList> selectAllReviewList();
}
