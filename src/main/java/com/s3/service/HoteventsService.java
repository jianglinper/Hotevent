package com.s3.service;

import com.s3.pojo.Hotevents;
import com.s3.util.PageUtil;

/**
 * User: jianglin
 * Date: 2022/3/11
 * Time: 9:51
 * Desc: 业务逻辑层 接口 新闻表
 */

public interface HoteventsService {

    //查询
    public PageUtil<Hotevents> getHotevents(String keyWord,Integer pageIndex,Integer pageSize);
    //根据id查询信息
    public Hotevents getHoteventsById(Integer id);
}
