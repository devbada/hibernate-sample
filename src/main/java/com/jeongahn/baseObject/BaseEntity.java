package com.jeongahn.baseObject;

import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	private Date registedDate;
	private String register;
	private Date modifiedDate;
	private String modifier;
	
	public Date getRegistedDate() {
		return registedDate;
	}
	public void setRegistedDate(Date registedDate) {
		this.registedDate = registedDate;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	
	
}
