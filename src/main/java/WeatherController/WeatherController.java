package WeatherController;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Weather")
public class WeatherController {
	
	
	//Upload Weather info
	private List<Weather> theWeather;
	
	
	@PostConstruct
	private void loadData() {
		
		//Create Faculties
		Weather wea1 = new Weather(1, "Cincinnati", "75 degrees");
		Weather wea2 = new Weather(2, "Tokyo", "68 degrees");
		Weather wea3 = new Weather(3, "London", "77 degrees");
		
		//Create our List
		ArrayList WeatherList = new ArrayList<>();
		
		//Add to our List
		WeatherList.add(wea1);
		WeatherList.add(wea2);
		WeatherList.add(wea3);
		
	}
	
	//Mapping for "/list"
	@GetMapping("/list")
	public String listWeather(Model theModel) {
		
		
		//Add Faculties to the Spring Model
		theModel.addAttribute("weather", WeatherList);
		
		return "list-weather";
	}

}
