package com.junl.apps.model;

import java.sql.Timestamp;

/**
 * 
* @ClassName: JiLiangModel
* @Description: TODO(这里用一句话描述这个类的作用)
* @author dfj
* @date 2016年8月26日 下午4:15:42
*
 */
public class JiLiangModel {
	private String ids;
	private String byIds;
	private int state;
	private Timestamp confirmTime;
	private int returnNum;
	private int meteringNum;
	private double meteringMoney;
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getByIds() {
		return byIds;
	}
	public void setByIds(String byIds) {
		this.byIds = byIds;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public Timestamp getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(Timestamp confirmTime) {
		this.confirmTime = confirmTime;
	}
	public int getReturnNum() {
		return returnNum;
	}
	public void setReturnNum(int returnNum) {
		this.returnNum = returnNum;
	}
	public int getMeteringNum() {
		return meteringNum;
	}
	public void setMeteringNum(int meteringNum) {
		this.meteringNum = meteringNum;
	}
	public double getMeteringMoney() {
		return meteringMoney;
	}
	public void setMeteringMoney(double meteringMoney) {
		this.meteringMoney = meteringMoney;
	}
	
}
