package spring.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.service.DAOService;

@Controller
public class HomeController {

	@Resource(name="dAOService")
	private DAOService daoService;

	@RequestMapping(value ={"/home"}, method = RequestMethod.GET)
	public ModelAndView showHomePage(Map<String, Object> model) {
		System.out.println(model.toString());
		ModelAndView mv = new ModelAndView("user/home");  
		mv.addObject("op", "µÇÂ½Ê§°Ü!");
		return mv;
	}


	public static final int DEFAULT_SPITTLES_PER_PAGE = 25;

	private int spittlesPerPage = DEFAULT_SPITTLES_PER_PAGE;

	public void setSpittlesPerPage(int spittlesPerPage) {
		this.spittlesPerPage = spittlesPerPage;
	}

	public int getSpittlesPerPage() {
		return spittlesPerPage;
	}

	public DAOService getDaoService() {
		return daoService;
	}

	public void setDaoService(DAOService daoService) {
		this.daoService = daoService;
	}
}