package com.ramon.guardiasapi.guardias;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GuardiasRepositorio extends MongoRepository<Guardias, String> {
	ArrayList<Guardias> findByDia(String dia);
}
