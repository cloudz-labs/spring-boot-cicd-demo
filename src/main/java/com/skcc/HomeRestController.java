package com.skcc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHome() {
		return "Hello dev application!.";
	}

}
