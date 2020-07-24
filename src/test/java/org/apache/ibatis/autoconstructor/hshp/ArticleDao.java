package org.apache.ibatis.autoconstructor.hshp;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleDao {
    ArticleDO findOne(@Param("id") int id);

    List<ArticleDO> findByIdAndTitle(@Param("id") int id, @Param("title") String title);
}