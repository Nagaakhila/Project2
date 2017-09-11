package com.niit.Backend;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.niit.DAO.BlogDAO;
import com.niit.model.Blog;

@ComponentScan("com.niit")
public class BlogDAOTestCase {
	
@Autowired	
static BlogDAO blogDAO;
@Autowired
static Blog blog;

	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.niit.*");
		annotationConfigAppContext.refresh();
		
		blogDAO=(BlogDAO)annotationConfigAppContext.getBean("blogDAO");
		blog=(Blog)annotationConfigAppContext.getBean("blog");
	
	}
	
	@Test
	public void createBlogtest()
	{
		blog.setBlogId(111);
		blog.setBlogName("Akhila");
		blog.setBlogContent("I like singing");
		blog.setCreateDate(new java.util.Date());
		blog.setStatus("NA");
		blog.setLikes(0);
		assertTrue("Problem in Blog Creation",blogDAO.createBlog(blog));
	
	}
	
	@Ignore
	@Test
	public void approveBlogTest()
	{
		blog.setBlogName("Akhila");
		blog.setBlogContent("I like dancing");
		blog.setCreateDate(new java.util.Date());
		blog.setStatus("NA");
		blog.setLikes(0);
		assertTrue("Problem in approving Blog",blogDAO.approveBlog(blog));	
	}
	@Test
	public void editBlogTest()
	{
	blog.setBlogId(1001);
	blog.setBlogName("NagaAkhila");
	blog.setBlogContent("NagaAkhila likes cooking ");
	blog.setCreateDate(new java.util.Date());
	blog.setStatus("NA");
	blog.setLikes(0);
	assertTrue("Problem in approving Blog",blogDAO.editBlog(blog.getBlogId()));	
	}
	
	@Test
	public void deleteBlogTest()
	{
	blog.setBlogId(1001);
	assertTrue("Problem in approving Blog",blogDAO.deleteBlog(blog.getBlogId()));	
	}
	
	@Test
	public void getBlogTest()
	{
	blog.setBlogId(1001);
   /* assertTrue("Problem in getting blog",blogDAO.getBlogdetails(blog.getBlogId())>0);*/
	}
	
	
}
	
	


