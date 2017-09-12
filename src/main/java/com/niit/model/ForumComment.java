package com.niit.model;

import java.util.Date;

public class ForumComment {
	
	private int ID,ForumID,UserID;
	private String Comment,UserName;
	public Date CommentEnd;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getForumID() {
		return ForumID;
	}
	public void setForumID(int forumID) {
		ForumID = forumID;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public Date getCommentEnd() {
		return CommentEnd;
	}
	public void setCommentEnd(Date commentEnd) {
		CommentEnd = commentEnd;
	}

	
}

