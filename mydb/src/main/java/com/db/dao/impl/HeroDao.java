package com.db.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.db.dao.BaseDao;
import com.db.model.impl.HeroEntity;

/**
 * 英雄数据管理操作类
 * @author Thinker
 * 
 */
@Component
public class HeroDao extends BaseDao<HeroEntity>
{
	public static final String QUERY_GET_HERO_BY_CHARID = "from HeroEntity where charId=:charId";
	@Autowired
	public HeroDao(SessionFactory sessionFactory)
	{
		super(sessionFactory);
	}

	@Override
	protected Class<HeroEntity> getEntityClazz() 
	{
		return HeroEntity.class;
	}
	
	/**
	 * 根据用户id获取全部角色信息
	 * @param passportId
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public List<HeroEntity> getHumanAllList(long charId){
		List<HeroEntity> heroEntityList= getAll(QUERY_GET_HERO_BY_CHARID, new String[] { "charId" }, new Object[] { charId });
		return heroEntityList;
	}
	
//	@Transactional(propagation = Propagation.REQUIRED)
//	public Serializable save(HumanEntity obj)
//	{
//		return super.save(obj);
//	}
}
