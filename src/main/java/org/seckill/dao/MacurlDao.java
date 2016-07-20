package org.seckill.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Macurl;
import org.seckill.entity.Seckill;

public class MacurlDao {
	//根据偏移量查询秒杀列表
    List<Macurl> queryAll(@Param("offset")int offset,@Param("limit")int limit) {
		return null;
	}
}
