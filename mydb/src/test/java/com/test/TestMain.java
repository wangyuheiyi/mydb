package com.test;

import com.common.context.ContextFactiry;
import com.db.dao.impl.DbServer;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbServer dbServer=ContextFactiry.getContext("dbContext").getBean(DbServer.class);
		dbServer.getHumanDao().getAll("from t_human_info", null, null);
	}

}
