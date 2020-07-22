package org.apache.ibatis.autoconstructor.hshp;

import org.apache.ibatis.annotations.Param;

public interface ArticleDao {
    ArticleDO findOne(@Param("id") int id);
}