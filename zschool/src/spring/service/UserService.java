package spring.service;

public interface UserService {

	public Object getRecentSpittles(int spittlesPerPage);

	public void getRecentBlogs();
	
	public boolean confirmUser(String username,String password);

}
