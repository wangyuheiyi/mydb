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
 * 数据库实体类：英雄信息
 * @author Thinker
 */
@Scope("prototype")
@Component
@Entity
@Table(name = "t_hero_info")
public class HeroEntity implements BaseEntity<Long>
{
	private static final long serialVersionUID = 1L;

	/** 英雄ID 主键 */
	private long id;
	/** 所属角色ID */
	private long charId;
	/** 玩家模板id*/
	private int templateId;
	/** 等级 */
	private int level=1;
	/** 当前经验 */
	private int curExp;
	/** 英雄装备列表*/
	private String equipPack;
	/** 创建时间 */
	private Timestamp createTime;
	/** 是否已经被删除 */
	private int deleted;
	/** 删除日期 */
	private Timestamp deleteTime;


	public HeroEntity()
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
	
	@Column(columnDefinition = " int default 1", nullable = false)
	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getCurExp() {
		return this.curExp;
	}

	public void setCurExp(int value) {
		this.curExp = value;
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

	@Column(columnDefinition = " int default 0", nullable = false)
	public int getTemplateId() {
		return templateId;
	}

	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}

	@Type(type="text")
	@Column
	public String getEquipPack() {
		return equipPack;
	}

	public void setEquipPack(String equipPack) {
		this.equipPack = equipPack;
	}

	
}
