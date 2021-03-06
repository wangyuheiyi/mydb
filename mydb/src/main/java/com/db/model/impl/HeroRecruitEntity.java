package com.db.model.impl;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.db.model.BaseEntity;


/**
 * 数据库实体类：英雄招募信息
 * @author Thinker
 */
@Scope("prototype")
@Component
@Entity
@Table(name = "t_hero_recruit_info")
public class HeroRecruitEntity implements BaseEntity<Long>
{
	private static final long serialVersionUID = 1L;

	/** 英雄ID 主键 */
	private long id;
	/** 所属角色ID */
	private long charId;
	/** 英雄招募信息列表*/
	private String recruitPack;
	/** 创建时间 */
	private Timestamp createTime;
	/** 是否已经被删除 */
	private int deleted;
	/** 删除日期 */
	private Timestamp deleteTime;


	public HeroRecruitEntity()
	{
		
	}

	@Id
	@Override
	public Long getId()
	{
		return id;
	}

	@Override
	public void setId(Long id)
	{
		this.id = id;
	}
	

	@Column
	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(columnDefinition = " int default 0", nullable = false)
	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	
	@Column
	public Timestamp getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(Timestamp deleteTime) {
		this.deleteTime = deleteTime;
	}

	@Column
	public long getCharId() {
		return charId;
	}

	public void setCharId(long charId) {
		this.charId = charId;
	}

	@Type(type="text")
	@Column
	public String getRecruitPack() {
		return recruitPack;
	}

	public void setRecruitPack(String recruitPack) {
		this.recruitPack = recruitPack;
	}

	
	
}
