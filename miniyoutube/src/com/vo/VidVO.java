package com.vo;

import java.sql.Date;

public class VidVO {
	private Integer id;
	private String title;
	private Date regdate;
	private Double views;
	private Double likes;
	
	public VidVO() {
	}

	public VidVO(Integer id, String title, Date regdate, Double views, Double likes) {
		this.id = id;
		this.title = title;
		this.regdate = regdate;
		this.views = views;
		this.likes = likes;
	}
	
	

	public VidVO(Integer id, String title) {
		this.id = id;
		this.title = title;
	}

	public VidVO(Integer id, String title, Date regdate) {
		this.id = id;
		this.title = title;
		this.regdate = regdate;
	}

	public VidVO(Integer id, Double views) {
		this.id = id;
		this.views = views;
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

	public Double getViews() {
		return views;
	}

	public void setViews(Double views) {
		this.views = views;
	}

	public Double getLikes() {
		return likes;
	}

	public void setLikes(Double likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "VidVO [id=" + id + ", title=" + title + ", regdate=" + regdate + ", views=" + views + ", likes=" + likes
				+ "]";
	}
	
	
	
}
