package UC.WeatherRunner;

import UC.WeatherRunner.dao.LogbookRepository;
import UC.WeatherRunner.model.Logbook;
import UC.WeatherRunner.service.LogbookServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherRunnerApplication {

	//private static final Logger log = LoggerFactory.getLogger(WeatherRunnerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WeatherRunnerApplication.class, args);



	}

	/*@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	// Atm using this to test if the API route works. Not working too well atm, but its calling it.
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Properties properties = restTemplate.getForObject(
					"https://api.weather.gov/gridpoints/ILN/34,39/forecast", Properties.class);
			log.info(properties.toString());
		};
	}*/
}
