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
 * 数据库实体类：建筑信息
 * @author Thinker
 */
@Scope("prototype")
@Component
@Entity
@Table(name = "t_build_info")
public class BuildEntity implements BaseEntity<Long>
{
	private static final long serialVersionUID = 1L;

	/** 英雄ID 主键 */
	private long id;
	/** 所属角色ID */
	private long charId;
	/** 木材资源*/
	private int wood;
	/** 石头资源*/
	private int stone;
	/** 水晶资源*/
	private int crystal;
	/** 特殊资源*/
	private int special;
	/** 玩家建筑列表*/
	private String buildPack;
	/** 正在建筑列表*/
	private String buildIngPack;
	/** 创建时间 */
	private Timestamp createTime;
	/** 是否已经被删除 */
	private int deleted;
	/** 删除日期 */
	private Timestamp deleteTime;


	public BuildEntity()
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

	@Column
	public int getWood() {
		return wood;
	}

	public void setWood(int wood) {
		this.wood = wood;
	}

	@Column
	public int getStone() {
		return stone;
	}

	public void setStone(int stone) {
		this.stone = stone;
	}

	@Column
	public int getCrystal() {
		return crystal;
	}

	public void setCrystal(int crystal) {
		this.crystal = crystal;
	}

	@Type(type="text")
	@Column
	public String getBuildPack() {
		return buildPack;
	}

	public void setBuildPack(String buildPack) {
		this.buildPack = buildPack;
	}

	@Type(type="text")
	@Column
	public String getBuildIngPack() {
		return buildIngPack;
	}

	public void setBuildIngPack(String buildIngPack) {
		this.buildIngPack = buildIngPack;
	}

	@Column
	public int getSpecial() {
		return special;
	}

	public void setSpecial(int special) {
		this.special = special;
	}

	
	
}
