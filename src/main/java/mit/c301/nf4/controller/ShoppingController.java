package mit.c301.nf4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mit.c301.nf4.service.ShoppingService;

@Controller
public class ShoppingController {
	

	private ShoppingService shoppingService; //쇼핑 서비스
	
	public ShoppingController(ShoppingService shoppingService) {
		super();
		this.shoppingService = shoppingService;
	}

	
//	@RequestMapping("/")
//	public String main(Model model) {  //메인화면을 가져올때 쇼핑리스트의 프로덕트를 가져옴
//		model.addAttribute("productlist",shoppingService.product());
//		return "main";
//	}
	
	@RequestMapping("/")
	public String main(Model model) {  //메인화면을 가져올때 쇼핑리스트의 프로덕트를 가져옴
		int pno=1;
//		shoppingService.productselect(1);
		
		return "/main";
	}
	
	@GetMapping("/productlist")  //프로덕트 리스트를 가져올떄 쇼핑리스크의 프로덕트를 가져옴 ( 근데 여기에서 여자 남자 상품타입 나눠야함)
	String productlist(Model model){
			model.addAttribute("productlist", shoppingService.product());
		return "/productlist";
	}
		
	
	@GetMapping("/recommend") //랜덤으로 추천상품을 가져오기 위한 jsp부분 ?
	public String random_input() {
		return "random_input";
	}
	
	@PostMapping("/random_info")  //성별에 따라 추천상품을 가져오는 부분
	public String random_result(Model model, int gender) {
		model.addAttribute("productlist", shoppingService.recommendView(gender));
		return "random_result";
	}
	
	
	
}
