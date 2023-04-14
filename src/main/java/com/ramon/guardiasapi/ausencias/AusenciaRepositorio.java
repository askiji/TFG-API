package com.ramon.guardiasapi.ausencias;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface AusenciaRepositorio extends MongoRepository<Ausencia, String>{
	
	List<Ausencia> findByFechaBetween(long startOfDay, long endOfDay);
}
