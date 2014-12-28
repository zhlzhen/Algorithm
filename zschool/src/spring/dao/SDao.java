package spring.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import spring.model.Blog;

@Component("sd")
public class SDao {

	public List<Blog> getRecentBlogs() {
		return null;
		
	}

	public boolean confirmUser(String username, String password) {
		//通过数据库的判定
		// TODO Auto-generated method stub
		return true;
	}

}
