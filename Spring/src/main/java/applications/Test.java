package applications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {

/*	@RequestMapping("/login")
	public String showLoginForm() {
		System.out.println("login called");
		return "login";
	}*/
	
	
/*	@RequestMapping("/welcome/{conteryname}/{login}")
	public ModelAndView login(@PathVariable String login, @PathVariable String conteryname ){
		
		System.out.println(login);
		
		ModelAndView model = new ModelAndView("login");
		model.addObject("msg", "HI " +login +"   and Contery "+conteryname);
		
		return model;
	}*/
	
	/*@RequestMapping("/welcome/{conteryname}/{login}")
	public ModelAndView login(@PathVariable Map<String, String> pathVar){
		
		String login = pathVar.get("login");
		String conteryname = pathVar.get("conteryname");
		System.out.println(login +" and" +conteryname );
		
		
		ModelAndView model = new ModelAndView("login");
		model.addObject("msg", "HI " +login +"   and Contery "+conteryname);
		
		return model;
	}*/
	
	@RequestMapping(value= "/loginForm" , method = RequestMethod.GET)
	public ModelAndView showLoginForm() {
		ModelAndView model = new ModelAndView("login");
		System.out.println("login called");
		return model;
	}
	
	
	/*@RequestMapping(value= "/loginFormSubmited.html" , method = RequestMethod.POST)
	public ModelAndView loginFormSubmitted(@RequestParam("username") String username, @RequestParam("password") String password) {
		
		ModelAndView model = new ModelAndView("success");
		model.addObject("Message", "Username is  " +username +" and  Password is " +password );	
		return model;
	}*/
	@ModelAttribute
	public void commonHeader(Model model){
		
		model.addAttribute("headerMessage", "Hi Spring Demo");
		
		
	}

@Autowired
TestService testservice;
	
	@RequestMapping(value= "/loginFormSubmited.html" , method = RequestMethod.POST)
	public ModelAndView loginFormSubmitted(@ModelAttribute("student") Student student) {
		
		testservice.saveService(student);
		
		ModelAndView model = new ModelAndView("success");
		return model;
	}
	
	
	
}


