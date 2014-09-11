package com.db.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.db.model.BaseEntity;

/**
 * 基础的 DAO
 * 
 * @param <E> 实体的类型 
 * @author Thinker
 * 
 */

public abstract class BaseDao<E extends BaseEntity<?>> 
{
	/** 数据库服务 */
	private SessionFactory sessionFactory;

	/**
	 * 类参数构造器
	 * 
	 * @param dbServ 
	 * 
	 */
	@Autowired
	public BaseDao(SessionFactory sessionFactory)
	{
		if (sessionFactory == null) 
		{
			throw new IllegalArgumentException("dbServ is null");
		}

		this.sessionFactory = sessionFactory;
	}

	/**
	 * 获取数据库服务
	 * 
	 * @return 
	 * 
	 */
	public Session currentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	/**
	 * 保存一个实体
	 * 
	 * @param obj
	 * 
	 */
	public Serializable save(E obj)
	{
		if (obj == null)
		{
			return null;
		} else
		{
			return currentSession().save(obj);
		}
	}

	/**
	 * 更新一个实体
	 * 
	 * @param obj
	 * 
	 */
	public void update(E obj)
	{
		if (obj == null)
		{
			return;
		} else
		{
			currentSession().update(obj);
		}
	}

	/**
	 * 保存或更新一个实体
	 * 
	 * @param obj 
	 * 
	 */
	public void saveOrUpdate(E obj) 
	{
		if (obj == null)
		{
			return;
		} else 
		{
			currentSession().saveOrUpdate(obj);
		}
	}

	/**
	 * 删除一个实体
	 * 
	 * @param obj
	 * @throws DataAccessException 
	 * @see {@link DBService#softDelete(SoftDeleteEntity)}
	 * @see {@link DBService#delete(BaseEntity)}
	 * 
	 */
	public void delete(E obj)
	{
		if (obj == null)
		{
			return;
		}

		// 物理删除
		currentSession().delete(obj);
		
	}


	/**
	 * 根据主键获取一个实体
	 * 
	 * @param ID
	 * @return 
	 * @throws DataAccessException 
	 * @see {@link DBService#get(Class, java.io.Serializable)}
	 * 
	 */
	public E get(Serializable ID)
	{
		if (ID == null) 
		{
			return null;
		} else 
		{
			return (E)currentSession().get(this.getEntityClazz(), ID);
		}
	}
	
	/**
	 * 根据主键获取一个实体
	 * 
	 * @param ID
	 * @return 
	 * @throws DataAccessException 
	 * @see {@link DBService#get(Class, java.io.Serializable)}
	 * 
	 */
	public List<E> getAll(String hsql,final String[] paramNames, final Object[] values)
	{
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hsql);
        prepareQuery(paramNames,values,query);
        return query.list();
	}
	
	private void prepareQuery(final String[] paramNames, final Object[] values,
			Query query) {
		for (int i = 0; paramNames != null && i < paramNames.length; i++) {
			if (values[i] instanceof Collection) {
				query.setParameterList(paramNames[i], (Collection<?>)values[i]);
			} else {
				query.setParameter(paramNames[i], values[i]);
			}
		}
	}

	/**
	 * 根据指定类型的指定 ID 查询实体
	 * 
	 * @param entityClazz
	 * @param ID
	 * @return 
	 * @see {@link DBService#get(Class, java.io.Serializable)} 
	 * 
	 */
	public Object get(Class<? extends BaseEntity<Serializable>> entityClazz,Serializable ID) 
	{
		if (entityClazz == null || ID == null)
		{
			return null;
		}

		return currentSession().get(entityClazz, ID);
	}


	/**
	 * 取得该 Dao 所操作的对象类型
	 * 
	 * @return 
	 * 
	 */
	protected abstract Class<E> getEntityClazz();

}
