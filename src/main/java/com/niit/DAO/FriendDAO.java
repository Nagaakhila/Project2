package com.niit.DAO;

import java.util.List;


import com.niit.model.Friend;

public interface FriendDAO {
	
	public boolean createFriend(Friend friend);
	public Friend getFrienddetails(int blogId);
	public List<Friend> getFriend();
	public boolean approveFriend(Friend friend);
	public boolean editFriend(int friendId);
	public boolean deleteFriend(int friendId);

}
