package com.db.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.core.uuids.UUIDType;



@Component
public class DbServer{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private HumanDao humanDao;
	
	@Autowired
	private HeroDao heroDao;
	
	@Autowired
	private BuildDao buildDao;
	

	public HumanDao getHumanDao() {
		return humanDao;
	}

	
	
	public HeroDao getHeroDao() {
		return heroDao;
	}



	public BuildDao getBuildDao() {
		return buildDao;
	}



	/**
	 * 获取最大id
	 * @param uuidIndex
	 * @return
	 */
	public long getMaxId(int uuidIndex,final String[] paramNames, final Object[] values){
		String getMaxIdHsql="select max(id) from "+UUIDType.valueOf(uuidIndex).getName()+" where id >=:minId and id <= :maxId";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery(getMaxIdHsql);
		for (int i = 0; paramNames != null && i < paramNames.length; i++) {
			query.setParameter(paramNames[i], values[i]);
		}
		List rs=query.list();
		if(rs==null||rs.size()==0) return 0L;
		if(rs.get(0)==null)return 0L;
		return Long.parseLong(String.valueOf(rs.get(0)));
	}
}
