package in.cdac.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import in.cdac.main.entities.registeruser;

import in.cdac.main.service.registeruserService;

@Controller
public class UserController {
	
	@Autowired
	private registeruserService registerserviceRe;
	
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	@ResponseBody
//	    public String index(HttpServletRequest request, Model modal){ 
//		String name=request.getParameter("name");
//		if(name==null) {
//			
//			name="vikash";
//		}
//	        return name;  
//	    } 
//	@PostMapping
//	public  String submit() {
//		
//		userrepo.submit();
//	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	  public String SaveRegister(registeruser registeruser, Model model){ 
		System.out.println("in controller");
		
//		registeruser reg=new registeruser();
//		model.addAttribute("registeruser",reg);
//		
		registerserviceRe.save(registeruser);
	        return "save";  
	    } 
	
	
}
