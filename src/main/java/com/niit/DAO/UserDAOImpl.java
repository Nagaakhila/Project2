package com.niit.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.User;

public class UserDAOImpl implements UserDAO {
	
    @Autowired
    SessionFactory sessionFactory;
	public UserDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean approveUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean editUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

}


