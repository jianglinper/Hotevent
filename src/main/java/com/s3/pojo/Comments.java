package com.s3.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * User: jianglin
 * Date: 2022/3/11
 * Time: 9:35
 * Desc: 实体类 回复表
 */
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comments {
    private Integer id;
    private Integer hotEventsId;
    private String commentDate;
    private String content;
}
