package mit.c301.nf4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/login/*")
@Controller
public class LoginController {
	
	@GetMapping("/all")
	public void doAll(){
		log.info("every body");
	}
	@GetMapping("/member")
	public void doMember(){
		log.info("logined member");
	}
	@GetMapping("/admin")
	public void doAdmin(){
		log.info("admin only");
	}

}
