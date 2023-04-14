package com.ramon.guardiasapi.datos;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DatosRepositorio extends MongoRepository<Datos, String>{
	
}
