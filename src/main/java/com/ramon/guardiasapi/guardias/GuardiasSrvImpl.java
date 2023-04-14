package com.ramon.guardiasapi.guardias;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuardiasSrvImpl implements GuardiasSrv{
	
	@Autowired
	private GuardiasRepositorio guardiasRepo;
	
	
	@Override
	public Guardias guardarGuardias(Guardias guardia) {
		return guardiasRepo.save(guardia);
	}
	@Override
	public ArrayList<Guardias> findGuardias() {
		
		return (ArrayList<Guardias>) guardiasRepo.findAll();
	}

}
