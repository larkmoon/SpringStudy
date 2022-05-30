package com.vo;

import java.sql.Date;

public class VidVO {
	private Integer id;
	private String title;
	private Date regdate;
	
	public VidVO() {
	}
	public VidVO(Integer id, String title, Date regdate) {
		this.id = id;
		this.title = title;
		this.regdate = regdate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "VidVO [id=" + id + ", title=" + title + ", regdate=" + regdate + "]";
	}
	
	
}
