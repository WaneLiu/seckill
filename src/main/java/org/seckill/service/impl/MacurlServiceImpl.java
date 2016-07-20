package org.seckill.service.impl;

import java.util.List;

import org.seckill.dao.SeckillDao;
import org.seckill.dao.SuccessKilledDao;
import org.seckill.entity.Macurl;
import org.seckill.service.MacurlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MacurlServiceImpl implements MacurlService{
	private Logger logger= LoggerFactory.getLogger(this.getClass());
    //注入service依赖
    @Autowired
    private SeckillDao seckillDao;
    @Autowired
    private SuccessKilledDao successKilledDao;
    //MD5盐值字符串，用户混淆MD5
	public List<Macurl> getMacurlList() {
		// TODO Auto-generated method stub
		return null;
	}

}
