package mit.c301.nf4.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;


@Log4j
@Controller
public class CommonController {

	@GetMapping("/accessError")
	public void accessError(Authentication auth, Model model){
		log.info("access denied : "+auth);
		model.addAttribute("msg","Access Denies");
	}
	
	@GetMapping("/customLogin")
	public void loginInput(String error, String logout, Model model) {
		log.info("error: "+error);
		log.info("logout: "+logout);
		
		if(error != null) {
			model.addAttribute("error", "Login error check your account");
			}
		if(logout != null) {
			model.addAttribute("logout","Logout!!");
		}
	}
	
	@GetMapping("/customLogout")
	public void logoutGet() {
		log.info("custom logout");
	}
	
	
}
