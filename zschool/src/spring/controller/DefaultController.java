package spring.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.service.DAOService;

@Controller
public class DefaultController {

	@Resource(name="dAOService")
	private DAOService daoService;

	@RequestMapping(value ={"/*"}, method = RequestMethod.GET)
	public ModelAndView showHomePage(Map<String, Object> model) {
		ModelAndView mv = new ModelAndView("user/fail");  
		mv.addObject("op", "µÇÂ½Ê§°Ü!");
		return mv;
	}

	public DAOService getDaoService() {
		return daoService;
	}

	public void setDaoService(DAOService daoService) {
		this.daoService = daoService;
	}
}