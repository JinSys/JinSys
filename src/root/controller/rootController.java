package root.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class rootController {

	@RequestMapping({"/index","/"})
	public String home(){
		return "/template";
	}
}
