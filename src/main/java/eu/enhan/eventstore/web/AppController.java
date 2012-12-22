package eu.enhan.eventstore.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AppController {

	private static final Logger LOG = LoggerFactory.getLogger(AppController.class);

	@RequestMapping
	public String redirectToStaticHome(){
		return "redirect:/app/index.html";
	}

}
