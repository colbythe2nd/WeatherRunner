package UC.WeatherRunner.service;

import UC.WeatherRunner.dao.LogbookRepository;
import UC.WeatherRunner.model.Logbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogbookServiceImplementation implements LogbookService {

    private LogbookRepository _logbookRepository;

    @Autowired
    public LogbookServiceImplementation(LogbookRepository paramLogbookRepository) {_logbookRepository = paramLogbookRepository;}

    @Override
    public List<Logbook> findAll() {return _logbookRepository.findAllById();}

    @Override
    public Logbook findById(int specificLogbookID){
        Optional<Logbook> logbookID = _logbookRepository.findById(specificLogbookID);

        Logbook specificLogbook = null;
        if (logbookID.isPresent()){
            specificLogbook = logbookID.get();
        }
        else{
            //logbookID not found
            throw new RuntimeException("The logbookID you've entered is invalid - " + specificLogbookID);
        }

        return specificLogbook;

    }

    @Override
    public void save(Logbook specificLogbook) { _logbookRepository.save(specificLogbook); }

    @Override
    public void deleteById(int logbookID) { _logbookRepository.deleteById(logbookID);}



}
