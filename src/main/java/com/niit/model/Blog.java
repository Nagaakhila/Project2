package com.niit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Blog_details")
@Component
public class Blog {

	@Id
	private int blogId;
	private String blogName,blogContent,status;
	private int likes,userId;
	private Date createDate;
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getBlogContent() {
		return blogContent;
	}
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	


}
