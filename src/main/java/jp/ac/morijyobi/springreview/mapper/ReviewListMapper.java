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

    @Select("SELECT review.id, review.title, review.rate, review.review_type_code, review_type.type_name " +
            "FROM review INNER JOIN review_type ON review.review_type_code = review_type.type_code " +
            "WHERE review.id = #{id} ORDER BY id")
    ReviewList selectReviewListById(int id);

    @Select("<script> " +
            "SELECT review.id, review.title, review.rate, review.review_type_code, review_type.type_name " +
            "FROM review INNER JOIN review_type ON review.review_type_code = review_type.type_code " +
            "<where>" +
            "1 = 1" +
            "<if test='typeCode != null'>" +
                " AND review.review_type_code = #{typeCode} " +
            "</if>" +
            "<if test='titleWord != null'>" +
                " AND review.title LIKE CONCAT('%',#{titleWord},'%') " +
            "</if>" +
            "</where>" +
            "ORDER BY id" +
            "</script>")
    List<ReviewList> selectReviewListByTypeAndWord(String typeCode, String titleWord);
}
