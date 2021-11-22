package UC.WeatherRunner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller

public class WeatherRunnerController {
	private List<Logbook> logbookList;
	@PostConstruct
	private void loadData() {
		Logbook log1 = new Logbook(1, "10/21/2021", 5.0, "1:00:00");
		Logbook log2 = new Logbook(2, "10/26/2021", 3.2, "0:38:25");
		Logbook log3 = new Logbook(3, "11/21/2021", 42.2, "5:43:21");
		logbookList = new ArrayList<>();
		logbookList.add(log1);
		logbookList.add(log2);
		logbookList.add(log3);
	}
	@RequestMapping("/")
	public String start(Model logbookModel) {
		logbookModel.addAttribute("logbook",logbookList);
		return "WeatherRunner";
	}
}
