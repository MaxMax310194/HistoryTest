package controllers;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller
@SessionAttributes( value = {"numberTest"})
public class GoToStartTesting {

	
	@Autowired
	SessionFactory sf;
	
	@RequestMapping(value = "/goToStartTesting",method = RequestMethod.POST)
	public ModelAndView GoStartTesting() {
		
		ModelAndView modelAndView = new ModelAndView("startTest");
		int numberTest = 0;
		
		modelAndView.addObject("numberTest",numberTest);
		
		
	
		return modelAndView;
	}
}
