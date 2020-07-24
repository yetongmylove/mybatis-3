package org.apache.ibatis.autoconstructor.hshp;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@ToString
public class ArticleDO implements Serializable {
    private Integer id;
    private String title;
    private ArticleTypeEnum type;
    private String content;
    private Date createTime;
}