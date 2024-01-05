package com.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {
	
	@GetMapping(path="/sayit")
	public String getmessage() {
		return "vanakam da mapla";
	}

}
