package org.apache.ibatis.autoconstructor.hshp;

import org.apache.ibatis.annotations.Param;

public interface AuthorDao {
    AuthorDO findOne(@Param("id") int id);
}