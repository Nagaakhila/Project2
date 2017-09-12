package com.niit.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.Friend;

public class FriendDAOImpl implements FriendDAO {
		
	    @Autowired
	    SessionFactory sessionFactory;
		public FriendDAOImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}
		
		public boolean createFriend(Friend friend) {
			// TODO Auto-generated method stub
			return false;
		}

		public Friend getFriend(int friendId) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<Friend> getFriend() {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean approveFriend(Friend friend) {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean editFriend(int userId) {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean deleteFriend(int userId) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Friend getFrienddetails(int blogId) {
			// TODO Auto-generated method stub
			return null;
		}
}
		