package com.db.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DbServer {
	@Autowired
	private HumanDao humanDao;
	
	public void init() {
        
	}

	public HumanDao getHumanDao() {
		return humanDao;
	}

	public void setHumanDao(HumanDao humanDao) {
		this.humanDao = humanDao;
	}
	
	
}
