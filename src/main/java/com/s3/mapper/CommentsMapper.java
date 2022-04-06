package com.s3.mapper;

import com.s3.pojo.Comments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User: jianglin
 * Date: 2022/3/11
 * Time: 9:39
 * Desc: 数据访问层 接口 评论表
 */
@Mapper
public interface CommentsMapper {

    //根据id查询信息
    public List<Comments> getById(@Param("id")Integer id);

    //新增评论
    public int insert(Comments comments);
}
