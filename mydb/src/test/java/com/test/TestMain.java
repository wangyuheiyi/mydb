package com.test;

import java.util.List;

import com.common.context.ContextFactiry;
import com.db.dao.impl.DbServer;
import com.db.model.impl.HumanEntity;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbServer dbServer=ContextFactiry.getContext("dbContext").getBean(DbServer.class);
		HumanEntity humanEntity=new HumanEntity();
		humanEntity.setId(11111111L);
		humanEntity.setPassportId(123456);
		humanEntity.setName("wangyuccc");
		dbServer.getHumanDao().save(humanEntity);
//		humanEntity.setId(id);
//		dbServer.getHumanDao().getAll("from HumanEntity", null, null);
		List<HumanEntity> humanEntitys=dbServer.getHumanDao().getHumanAllList(123456);
		dbServer.getMaxId(0, new String[] { "minId", "maxId" }, new Object[]{(long) 0, (long) 1000L});
		System.out.println(humanEntitys.size());
	}

}
