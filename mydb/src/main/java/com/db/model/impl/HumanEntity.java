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
	/** 职业类型 */
	private int vocationType;
	/** 等级 */
	private int level=1;
	/** 阵营 */
	private int allianceTypeId;
	/** 玩家的战功 */
	private int exploit;
	/** vip等级 */
	private int vipLevel;
	/** 最后成为某级别vip的时间 */
	private Timestamp lastVipTime;
	/** 钻石 */
	private int diamond;
	/** 金币 */
	private int gold;
	/** 点券 */
	private int coupon;
	/** 当前经验 */
	private int curExp;
	/** 当前精力  */
	private int curVim;
	/** 最后回复精力的时间  */
	private long vimLastTime;
	/** 所在城镇 ID */
	private int cityId = -1;
	/** 所在场景Id */
	private int sceneId;
	/** 主背包容量 */
	private int primBagCount;
	/** 剧情ID */
	private int storyId;
	/** 角色的AvatarId */
	private int avatar;
	/** 新手引导ID */
	private int guideId;
	/** 新手引导状态 */
	private int guideState;
	/** 角色类型:0正常角色1竞技场角色其它场景角色 */
	private int roleKind;
	/** 技能信息*/
	private String skillPack;
	/** 开启功能信息*/
	private String openFuncPack;
	/** 开启场景信息*/
	private String openScenePack;
	
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
	/** 空闲时间 */
	private int idleTime;
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

	public int getVocationType() {
		return this.vocationType ;
	}

	public void setVocationType(int vocationType) {
		this.vocationType = vocationType;
	}
	
	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	

	public int getAllianceTypeId() {
		return this.allianceTypeId;
	}

	public void setAllianceTypeId(int allianceTypeId) {
		this.allianceTypeId = allianceTypeId;
	}
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getExploit() {
		return exploit;
	}

	public void setExploit(int exploit) {
		this.exploit = exploit;
	}
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getVipLevel() {
		return vipLevel;
	}

	public void setVipLevel(int vipLevel) {
		this.vipLevel = vipLevel;
	}
	
	@Column
	public Timestamp getLastVipTime() {
		return lastVipTime;
	}

	public void setLastVipTime(Timestamp lastVipTime) {
		this.lastVipTime = lastVipTime;
	}
	
	public int getDiamond() {
		return diamond;
	}

	public void setDiamond(int diamond) {
		this.diamond = diamond;
	}

	public int getGold() {
		return this.gold;
	}

	public void setGold(int value) {
		this.gold = value;
	}

	
	public int getCoupon() {
		return this.coupon;
	}
	
	public void setCoupon(int value) {
		this.coupon = value;
	}
	
	public int getCurExp() {
		return this.curExp;
	}

	public void setCurExp(int value) {
		this.curExp = value;
	}
	
	public int getCurVim() {
		return curVim;
	}

	public void setCurVim(int curVim) {
		this.curVim = curVim;
	}

	public long getVimLastTime() {
		return vimLastTime;
	}

	public void setVimLastTime(long vimLastTime) {
		this.vimLastTime = vimLastTime;
	}

	public int getCityId()
	{
		return this.cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	@Column(columnDefinition = " int default 0", nullable = false)
	public int getSceneId() {
		return sceneId;
	}

	public void setSceneId(int sceneId) {
		this.sceneId = sceneId;
	}
	@Column
	public int getPrimBagCount() {
		return primBagCount;
	}

	public void setPrimBagCount(int primBagCount) {
		this.primBagCount = primBagCount;
	}
	
	@Column
	public int getStoryId() {
		return storyId;
	}

	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}
	@Column
	public int getAvatar() {
		return avatar;
	}

	public void setAvatar(int avatar) {
		this.avatar = avatar;
	}
	
	@Column
	public int getGuideId() {
		return guideId;
	}

	public void setGuideId(int guideId) {
		this.guideId = guideId;
	}
	@Column
	public int getGuideState() {
		return guideState;
	}

	public void setGuideState(int guideState) {
		this.guideState = guideState;
	}
	@Column
	public int getRoleKind() {
		return roleKind;
	}

	public void setRoleKind(int roleKind) {
		this.roleKind = roleKind;
	}

	@Column
	public String getSkillPack() {
		return skillPack;
	}

	public void setSkillPack(String skillPack) {
		this.skillPack = skillPack;
	}
	@Column
	public String getOpenFuncPack() {
		return openFuncPack;
	}

	public void setOpenFuncPack(String openFuncPack) {
		this.openFuncPack = openFuncPack;
	}
	@Column
	public String getOpenScenePack() {
		return openScenePack;
	}

	public void setOpenScenePack(String openScenePack) {
		this.openScenePack = openScenePack;
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

	@Column(columnDefinition = " int default 0", nullable = false)
	public int getIdleTime() {
		return idleTime;
	}

	public void setIdleTime(int idleTime) {
		this.idleTime = idleTime;
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


}
