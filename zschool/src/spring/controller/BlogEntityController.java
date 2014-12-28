package spring.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.service.DAOService;

@Controller
public class BlogEntityController {

	@Resource(name="dAOService")
	private DAOService daoService;

	@RequestMapping(value ={"/getAllBlog"}, method = RequestMethod.GET)
	public ModelAndView showHomePage(Map<String, Object> model) {
		daoService.getRecentBlogs();
		ModelAndView mv = new ModelAndView("user/home");  
		mv.addObject("op", "请求所有的Blog!");
		return mv;
	}

	public DAOService getDaoService() {
		return daoService;
	}

	public void setDaoService(DAOService daoService) {
		this.daoService = daoService;
	}
}