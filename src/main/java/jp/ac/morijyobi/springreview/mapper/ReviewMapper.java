package jp.ac.morijyobi.springreview.mapper;

import jp.ac.morijyobi.springreview.bean.entity.Review;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface ReviewMapper {

    @Insert("INSERT INTO review(title, rate, review_type_code) VALUES (#{title}, #{rate}, #{reviewTypeCode})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertReview(Review review);

    @Delete("DELETE FROM review WHERE id = #{id}")
    int deleteReviewById(int id);
}
