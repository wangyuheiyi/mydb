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

	/** 建筑ID 主键 */
	private long id;
	/** 所属角色ID */
	private long charId;
	
	/** 玩家模板id*/
	private int templateId;
	
	/** 是否建筑完成*/
	private int isFinish;
	
	/** 产出的最后时间*/
	private long outPutTime;
	/** 开始建筑时间*/
	private long buildStartTime;
	
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
	public int getIsFinish() {
		return isFinish;
	}

	public void setIsFinish(int isFinish) {
		this.isFinish = isFinish;
	}

	@Column
	public long getOutPutTime() {
		return outPutTime;
	}

	public void setOutPutTime(long outPutTime) {
		this.outPutTime = outPutTime;
	}

	@Column
	public long getBuildStartTime() {
		return buildStartTime;
	}

	public void setBuildStartTime(long buildStartTime) {
		this.buildStartTime = buildStartTime;
	}

	@Column
	public int getTemplateId() {
		return templateId;
	}

	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}
	
	
}
