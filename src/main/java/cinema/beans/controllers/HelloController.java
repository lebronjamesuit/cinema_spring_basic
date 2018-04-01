package cinema.beans.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "cinema.beans")
public class HelloController {

	  @RequestMapping(method = RequestMethod.GET)
	    public String sayHello(ModelMap model) {
	        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
	        model.addAttribute("name","your name is Minh");
	        return "welcome";
	    }
	 
	    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	    public String sayHelloAgain(ModelMap model) {
	        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
	        return "welcome";
	    }
	    
	    @RequestMapping(value ="/login", method = RequestMethod.GET)
	    public String gotoLoginPage(Model model) {
	    	model.addAttribute("page","Login page");
	    	return "login";
	    }
}
