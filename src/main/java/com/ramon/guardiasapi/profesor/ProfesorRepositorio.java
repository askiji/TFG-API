package com.ramon.guardiasapi.profesor;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ramon.guardiasapi.guardias.Guardias;


public interface ProfesorRepositorio extends MongoRepository<Profesor, String>{
	Profesor findByNombre(String nombre);
}
