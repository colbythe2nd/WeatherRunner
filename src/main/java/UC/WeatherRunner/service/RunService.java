package UC.WeatherRunner.service;

import java.util.List;

import UC.WeatherRunner.entity.RunEntity;

public interface RunService {

public List<RunEntity> findAll();
	
	public RunEntity findById(int theId);
	
	public void save(RunEntity theRun);
	
	public void deleteById(int theId);
	
	
}
