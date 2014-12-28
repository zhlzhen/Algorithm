package spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import spring.dao.SDao;

@Service("dAOService")
public class DAOServiceImpl implements DAOService {

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

}
