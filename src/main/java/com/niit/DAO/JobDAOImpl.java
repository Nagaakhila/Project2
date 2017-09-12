package com.niit.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.Job;

public class JobDAOImpl implements JobDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public JobDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	public boolean createJob(Job job) {
		// TODO Auto-generated method stub
		return false;
	}

	public Job getJob(int jobId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Job> getJob() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean approveJob(Job job) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean editJob(int jobId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteJob(int jobId) {
		// TODO Auto-generated method stub
		return false;
	}

	
}


	
	


