package org.apache.ibatis.autoconstructor.hshp;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
public class AuthorDO implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private SexEnum sex;
    private String email;
    private List<ArticleDO> articles;
}