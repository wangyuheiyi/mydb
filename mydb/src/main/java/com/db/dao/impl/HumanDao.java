package com.db.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.db.dao.BaseDao;
import com.db.model.impl.HumanEntity;

/**
 * 人物角色数据管理操作类
 * @author Thinker
 * 
 */
@Component
public class HumanDao extends BaseDao<HumanEntity>
{
	/** 查询语句名称 ： 根据账号ID获取所有 characterInfo */
	public static final String QUERY_GET_ALLROLE_BY_PID = "from HumanEntity where passportId=:passportId";
	@Autowired
	public HumanDao(SessionFactory sessionFactory)
	{
		super(sessionFactory);
	}

	@Override
	protected Class<HumanEntity> getEntityClazz() 
	{
		return HumanEntity.class;
	}
	
	/**
	 * 根据用户id获取全部角色信息
	 * @param passportId
	 * @return
	 */
	public List<HumanEntity> getHumanAllList(long passportId){
		List<HumanEntity> humanEntityList= getAll(QUERY_GET_ALLROLE_BY_PID, new String[] { "passportId" }, new Object[] { passportId });
		return humanEntityList;
	}
}
