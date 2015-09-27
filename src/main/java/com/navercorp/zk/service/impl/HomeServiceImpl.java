package com.navercorp.zk.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.navercorp.zk.service.HomeService;

public class HomeServiceImpl implements HomeService {
	private static final Logger logger = LoggerFactory.getLogger(HomeServiceImpl.class);
	
	@Override
	public void getHomeInfo() {
		logger.info("call getHomeInfo");
	}

	@Override
	public void getTest() {
		logger.info("call getTest");
	}
}
