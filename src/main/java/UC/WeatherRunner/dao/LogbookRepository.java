package UC.WeatherRunner.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import UC.WeatherRunner.model.Logbook;
import org.springframework.stereotype.Service;


public interface LogbookRepository extends JpaRepository<Logbook,Integer>{


    public List<Logbook> findAllById();



}