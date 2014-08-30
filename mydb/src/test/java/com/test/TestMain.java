package com.test;

import com.common.context.ContextFactiry;
import com.db.model.impl.HumanEntity;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DbServer dbServer=ContextFactiry.getContext("dbContext").getBean(DbServer.class);
		HumanEntity humanEntity=new HumanEntity();
		humanEntity.setId(123123123L);
		humanEntity.setPassportId(123456);
		humanEntity.setName("wangyu");
//		dbServer.getHumanDao().add(humanEntity);
//		humanEntity.setId(id);
//		dbServer.getHumanDao().getAll("from HumanEntity", null, null);
	}

}
