package com.jeongahn.sample.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jeongahn.baseObject.BaseEntity;

@Entity
@Table(name="T_USERS")
public class Users extends BaseEntity{

	@Id
	@Column(name="ID")
	private String id;
	
	@Column(name="CODE")
	private String code;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DEPTCODE")
	private String deptCode;
	
	public String getId() {
		return (this.id == null) ? this.id = UUID.randomUUID().toString() : this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	
	
}
