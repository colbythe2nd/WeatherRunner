package UC.WeatherRunner.service;

import UC.WeatherRunner.dao.LogbookRepository;
import UC.WeatherRunner.model.Logbook;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogbookServiceImpl implements LogbookService {


    private LogbookRepository logbookRepository;


    @Autowired
    public LogbookServiceImpl(LogbookRepository theLogbookRepository) {
        logbookRepository=theLogbookRepository;
    }


    public List<Logbook> findAll() {return logbookRepository.findAllById();}


    public Logbook findById(int theId){
        Optional<Logbook> logbookID = logbookRepository.findById(theId);

        Logbook theLogbook = null;
        if (logbookID.isPresent()){
            theLogbook = logbookID.get();
        }
        else{
            //logbookID not found
            throw new RuntimeException("The logbookID you've entered is invalid - " + theId);
        }

        return theLogbook;

    }


    public void save(Logbook theLogbook) { logbookRepository.save(theLogbook); }


    public void deleteById(int theId) { logbookRepository.deleteById(theId);}



}