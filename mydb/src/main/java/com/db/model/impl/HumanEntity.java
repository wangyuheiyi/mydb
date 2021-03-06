package com.db.model.impl;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.db.model.BaseEntity;


/**
 * 数据库实体类：角色信息，暂时先放在这儿
 * @author Thinker
 */
@Scope("prototype")
@Component
@Entity
@Table(name = "t_human_info")
public class HumanEntity implements BaseEntity<Long>
{
	private static final long serialVersionUID = 1L;

	/** 玩家角色ID 主键 */
	private long id;
	/** 玩家账号ID */
	private long passportId;
	/** 玩家的名字  */
	private String name;
	/** 玩家模板id*/
	private int templateId;
	/** 等级 */
	private int level=1;
	/** 种族 */
	private int allianceTypeId;
	/** 钻石 */
	private int diamond;
	/** 金币 */
	private int gold;
	/** 点券 */
	private int coupon;
	/** 木材资源*/
	private int wood;
	/** 石头资源*/
	private int stone;
	/** 水晶资源*/
	private int crystal;
	/** 特殊资源*/
	private int special;
	/** 当前经验 */
	private int curExp;
	/** 所在场景Id */
	private int sceneId;
	/** 主背包容量 */
	private int primBagCount;
	/** 剧情ID */
	private int storyId;
	/** 新手引导ID */
	private int guideId;
	/** 新手引导状态 */
	private int guideState;
	/** 角色类型:0正常角色1竞技场角色其它场景角色 */
	private int roleKind;
	/** 上次登陆IP */
	private String lastLoginIp;
	/** 上次登陆时间 */
	private Timestamp lastLoginTime;
	/** 上次登出时间 */
	private Timestamp lastLogoutTime;
	/** 累计在线时长(分钟) */
	private int totalMinute;
	/** 在线状态 */
	private int onlineStatus;
	/** 创建时间 */
	private Timestamp createTime;
	/** 是否已经被删除 */
	private int deleted;
	/** 删除日期 */
	private Timestamp deleteTime;


	public HumanEntity()
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
	
	@Column(columnDefinition = " int default 0", nullable = false)
	public long getPassportId() {
		return passportId;
	}

	public void setPassportId(long passportId) {
		this.passportId = passportId;
	}

	@Column(length = 36)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getTemplateId() {
		return templateId;
	}

	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}

	@Column(columnDefinition = " int default 1", nullable = false)
	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	@Column(columnDefinition = " int default 1", nullable = false)
	public int getAllianceTypeId() {
		return this.allianceTypeId;
	}

	public void setAllianceTypeId(int allianceTypeId) {
		this.allianceTypeId = allianceTypeId;
	}
	
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getDiamond() {
		return diamond;
	}


	public void setDiamond(int diamond) {
		this.diamond = diamond;
	}

	@Column(columnDefinition = " int default 0", nullable = false)
	public int getGold() {
		return this.gold;
	}

	public void setGold(int value) {
		this.gold = value;
	}

	@Column(columnDefinition = " int default 0", nullable = false)
	public int getCoupon() {
		return this.coupon;
	}
	
	public void setCoupon(int value) {
		this.coupon = value;
	}
	
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getCurExp() {
		return this.curExp;
	}

	public void setCurExp(int value) {
		this.curExp = value;
	}
	

	@Column(columnDefinition = " int default 0", nullable = false)
	public int getSceneId() {
		return sceneId;
	}

	public void setSceneId(int sceneId) {
		this.sceneId = sceneId;
	}
	
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getPrimBagCount() {
		return primBagCount;
	}

	public void setPrimBagCount(int primBagCount) {
		this.primBagCount = primBagCount;
	}
	
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getStoryId() {
		return storyId;
	}

	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}
	
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getGuideId() {
		return guideId;
	}

	public void setGuideId(int guideId) {
		this.guideId = guideId;
	}
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getGuideState() {
		return guideState;
	}

	public void setGuideState(int guideState) {
		this.guideState = guideState;
	}
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getRoleKind() {
		return roleKind;
	}

	public void setRoleKind(int roleKind) {
		this.roleKind = roleKind;
	}


	@Column
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	@Column
	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Column
	public Timestamp getLastLogoutTime() {
		return lastLogoutTime;
	}

	public void setLastLogoutTime(Timestamp lastLogoutTime) {
		this.lastLogoutTime = lastLogoutTime;
	}
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getTotalMinute() {
		return totalMinute;
	}

	public void setTotalMinute(int totalMinute) {
		this.totalMinute = totalMinute;
	}

	@Column(columnDefinition = " int default 0", nullable = false)
	public int getOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(int onlineStatus) {
		this.onlineStatus = onlineStatus;
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

	@Column(columnDefinition = " int default 0", nullable = false)
	public int getWood() {
		return wood;
	}

	public void setWood(int wood) {
		this.wood = wood;
	}

	@Column(columnDefinition = " int default 0", nullable = false)
	public int getStone() {
		return stone;
	}

	public void setStone(int stone) {
		this.stone = stone;
	}

	@Column(columnDefinition = " int default 0", nullable = false)
	public int getCrystal() {
		return crystal;
	}

	public void setCrystal(int crystal) {
		this.crystal = crystal;
	}
	
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getSpecial() {
		return special;
	}

	public void setSpecial(int special) {
		this.special = special;
	}
}
