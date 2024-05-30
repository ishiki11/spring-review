package jp.ac.morijyobi.springreview.mapper;

import jp.ac.morijyobi.springreview.bean.entity.ReviewType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReviewTypeMapper {

    @Select("SELECT * FROM review_type")
    List<ReviewType> selectAllReviewTypes();
}
