package com.niit.Backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.ForumDAO;
import com.niit.model.Forum;

public class ForumDAOTestCase {
	
static ForumDAO forumDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.niit");
		annotationConfigAppContext.refresh();
	    forumDAO=(ForumDAO)annotationConfigAppContext.getBean("forumDAO");
	
	}
	
	@Test
	public void createForumtest()
	{
		Forum forum=new Forum();
		forum.setForumId(111);
		forum.setForumName("Akhila");
		forum.setForumContent("I like singing");
		forum.setCreateDate(new java.util.Date());
		forum.setStatus("NA");
		forum.setLikes(0);
		assertTrue("Problem in Blog Creation",forumDAO.createForum(forum));
	
	}
	
	@Ignore
	@Test
	public void approveBlogTest()
	{
		Forum forum=new Forum();
		forum.setForumName("Akhila");
		forum.setForumContent("I like dancing");
		forum.setCreateDate(new java.util.Date());
		forum.setStatus("NA");
		forum.setLikes(0);
		assertTrue("Problem in approving Forum",forumDAO.approveForum(forum));	
	}
	@Test
	public void editBlogTest()
	{
    Forum forum=new Forum();
    forum.setForumId(1001);
    forum.setForumName("NagaAkhila");
    forum.setForumContent("NagaAkhila likes cooking ");
    forum.setCreateDate(new java.util.Date());
    forum.setStatus("NA");
    forum.setLikes(0);
	assertTrue("Problem in approving Blog",forumDAO.editForum(forum.getForumId()));	
	}
	
	@Test
	public void deleteBlogTest()
	{
		Forum forum = new Forum();
		forum.setForumId(1001);
	assertTrue("Problem in approving Blog",forumDAO.deleteForum(forum.getForumId()));	
	}
	
	@Test
	public void getBlogTest()
	{
		Forum forum = new Forum();
		forum.setForumId(1001);

	}
	
	
}
	
	


