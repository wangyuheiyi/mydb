package com.db.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.db.dao.BaseDao;
import com.db.model.impl.BuildEntity;

/**
 * 建筑数据管理操作类
 * @author Thinker
 * 
 */
@Component
public class BuildDao extends BaseDao<BuildEntity>
{
	public static final String QUERY_GET_BUILD_BY_CHARID = "from BuildEntity where charId=:charId";
	@Autowired
	public BuildDao(SessionFactory sessionFactory)
	{
		super(sessionFactory);
	}

	@Override
	protected Class<BuildEntity> getEntityClazz() 
	{
		return BuildEntity.class;
	}
	
	/**
	 * 根据角色id获取角色建筑物信息
	 * @param passportId
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public BuildEntity getBuildEntity(long charId){
		List<BuildEntity> buildEntityList= getAll(QUERY_GET_BUILD_BY_CHARID, new String[] { "charId" }, new Object[] { charId });
		if(buildEntityList!=null&&buildEntityList.size()!=0)
			return buildEntityList.get(0);
		else
			return null;
	}
	
}
