package com.ent.staySafe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WeatherRunnerController {
	@RequestMapping("/")
	public String start() {

		return "weatherRunner";
	}
}
