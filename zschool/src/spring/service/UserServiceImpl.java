package spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import spring.dao.SDao;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name ="sd")
	public SDao sd;
	
	@Override
	public Object getRecentSpittles(int spittlesPerPage) {
		// TODO Auto-generated method stub
		return new String("test");
	}

	@Override
	public void getRecentBlogs() {
		sd.getRecentBlogs();
	}

	@Override
	public boolean confirmUser(String username, String password) {
		// TODO Auto-generated method stub
		return sd.confirmUser(username,password);
	}

}
