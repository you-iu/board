package com.khrd.dto;

import java.util.Date;

public class Member {
	private String memberid;
	private String name;
	private String password;
	private Date datetime;
	public Member() {}
	public Member(String memberid, String name, String password, Date datetime) {
		super();
		this.memberid = memberid;
		this.name = name;
		this.password = password;
		this.datetime = datetime;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", name=" + name + ", password=" + password + ", datetime=" + datetime
				+ "]";
	}
	
	
}


