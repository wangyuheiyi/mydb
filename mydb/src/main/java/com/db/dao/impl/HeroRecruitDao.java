package com.db.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.db.dao.BaseDao;
import com.db.model.impl.HeroEntity;
import com.db.model.impl.HeroRecruitEntity;

/**
 * 英雄招募数据管理操作类
 * @author Thinker
 * 
 */
@Component
public class HeroRecruitDao extends BaseDao<HeroRecruitEntity>
{
	public static final String QUERY_GET_HERO_RECRUIT_BY_CHARID = "from HeroRecruitEntity where charId=:charId";
	@Autowired
	public HeroRecruitDao(SessionFactory sessionFactory)
	{
		super(sessionFactory);
	}

	@Override
	protected Class<HeroRecruitEntity> getEntityClazz() 
	{
		return HeroRecruitEntity.class;
	}
	
	/**
	 * 根据用户id获取全部角色信息
	 * @param passportId
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public HeroRecruitEntity getHumanAllList(long charId){
		List<HeroRecruitEntity> heroRecruitEntityList= getAll(QUERY_GET_HERO_RECRUIT_BY_CHARID, new String[] { "charId" }, new Object[] { charId });
		if(heroRecruitEntityList!=null&&heroRecruitEntityList.size()!=0) return heroRecruitEntityList.get(0);
		return null;
	}
	

}
