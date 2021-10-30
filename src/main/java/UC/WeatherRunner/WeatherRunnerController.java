package UC.WeatherRunner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WeatherRunnerController {

	@RequestMapping("/index")
	public String start() {
		
		return "index";
	}
}
