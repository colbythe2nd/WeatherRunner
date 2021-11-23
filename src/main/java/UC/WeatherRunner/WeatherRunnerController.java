package UC.WeatherRunner;

import UC.WeatherRunner.model.Logbook;
import UC.WeatherRunner.service.LogbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/WeatherRunner")
public class WeatherRunnerController {

	public LogbookService _logbookService;

	@Autowired
	public WeatherRunnerController (LogbookService paramLogbookService) { _logbookService = paramLogbookService;}

	//mapping for "/list"
	@GetMapping("/list")
	public String listLogbooks(Model theModel){
		List<Logbook> theLogbooks = _logbookService.findAll();

		//add logbooks to the spring model
		theModel.addAttribute("logbooks",theLogbooks);

		return "logbooks/list-logbooks";
	}

	@GetMapping("/newLog")
	public String newLog(Model theModel){

		//Model attribute for databinding
		Logbook theLogbook = new Logbook();
		theModel.addAttribute("logbook",theLogbook);
		return "logbooks/create-logbook";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("logbookId") int specificLogbookId){
		//remove logbook
		_logbookService.deleteById(specificLogbookId);
		return "redirect:/WeatherRunner/list";
	}

	@PostMapping("/save")
	public String saveLogbook(@ModelAttribute("logbook") Logbook theLogbook){

		//Register the logbook
		_logbookService.save(theLogbook);

		//Block duplicate submission for accidental page refresh
		return "redirect:/WeatherRunner/list";
	}


}
