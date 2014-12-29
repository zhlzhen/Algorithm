package spring.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.service.UserService;

@Controller
public class LoginController {

	@Resource(name="userService")
	private UserService daoService;

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(String username,String password,HttpServletRequest request){
		
		//username 和 password 的判断
		boolean is = getDaoService().confirmUser(username,password);
		
		ModelAndView mv=new ModelAndView("");
		if(is){
			request.getSession().setAttribute("user", username);
			request.setAttribute("user", username);
			mv.addObject("op", "欢迎您的到来 "+ username +"!");
			mv.setViewName("user/success");
		}else{
			mv.setViewName("forward:/");
			mv.addObject("username",username);
			mv.addObject("message", "username or password error ");
		}
		return mv;
	}

	public UserService getDaoService() {
		return daoService;
	}

	public void setDaoService(UserService daoService) {
		this.daoService = daoService;
	}
}