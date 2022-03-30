package controllers;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;


import daoImpl.DaoImplTest;
import model.Test;
import model.UserHib;

@Controller
public class DelTest {

	@Autowired
	SessionFactory sf;
	
	@RequestMapping(value = "/delTest",method = RequestMethod.POST)
	public ModelAndView delTest(@RequestParam  Map<String, String>params,@SessionAttribute("userSession")UserHib userSession ) {
		
		ModelAndView modelAndView = new ModelAndView("master");
		DaoImplTest daoImplTest = new DaoImplTest(sf);
		List<Test>tests = daoImplTest.getAllTest();
		
		for (int i = 0; i < tests.size(); i++) {
			if (params.get("t"+tests.get(i).getIdTest() )!= null) {
				daoImplTest.delTest(tests.get(i));
			}
		}
		
		tests = daoImplTest.getAllTest();
		modelAndView.addObject("tests",tests);
		modelAndView.addObject("userSession",userSession);
		
		
		return modelAndView;
	}
	
}
