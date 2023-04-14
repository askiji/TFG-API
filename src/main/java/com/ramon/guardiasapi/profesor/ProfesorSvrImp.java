package com.ramon.guardiasapi.profesor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorSvrImp implements ProfesorSvr{
	@Autowired
	private ProfesorRepositorio profesorRopositorio;
	
	@Override
	public Profesor guardarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		return profesorRopositorio.save(profesor);
	}
	@Override
	public Profesor findProfesor(String nombre) {
		// TODO Auto-generated method stub
		return profesorRopositorio.findByNombre(nombre);
	}
	
}
