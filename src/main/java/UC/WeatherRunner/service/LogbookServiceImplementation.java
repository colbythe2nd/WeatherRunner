package UC.WeatherRunner.service;

import UC.WeatherRunner.dao.LogbookRepository;
import UC.WeatherRunner.model.Logbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogbookServiceImplementation implements LogbookService {

    private LogbookRepository logbookRepository;

    @Autowired
    public LogbookServiceImplementation(LogbookRepository theLogbookRepository) {logbookRepository = theLogbookRepository;}

    @Override
    public List<Logbook> findAll() {return logbookRepository.findAllById();}

    @Override
    public Logbook findById(int theId){
        Optional<Logbook> logbookID = logbookRepository.findById(theId);

        Logbook specificLogbook = null;
        if (logbookID.isPresent()){
            specificLogbook = logbookID.get();
        }
        else{
            //logbookID not found
            throw new RuntimeException("The logbookID you've entered is invalid - " + theId);
        }

        return specificLogbook;

    }

    @Override
    public void save(Logbook specificLogbook) { logbookRepository.save(specificLogbook); }

    @Override
    public void deleteById(int logbookID) { logbookRepository.deleteById(logbookID);}



}
