package com.s3.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * User: jianglin
 * Date: 2022/3/11
 * Time: 9:37
 * Desc: 实体类 新闻表
 */
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotevents {
    private Integer id;
    private String keyWord;
    private String hotContent;
    private Integer searchSum;
    private String createDate;
}
