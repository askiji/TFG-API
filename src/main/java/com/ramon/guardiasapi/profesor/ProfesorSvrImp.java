package com.ramon.guardiasapi.profesor;

import java.security.Principal;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorSvrImp implements ProfesorSvr{
	@Autowired
	private ProfesorRepositorio profesorRopositorio;
	
	@Override
	public Profesor guardarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		Profesor p = profesorRopositorio.findByNombre(profesor.getNombre());
		if(p != null) {
			return p;
		}
		return profesorRopositorio.save(profesor);
	}
	@Override
	public Profesor findProfesor(String nombre) {
		// TODO Auto-generated method stub
		return profesorRopositorio.findByNombre(nombre);
	}
	@Override
	public ArrayList<Profesor> findTodos(Principal principal) {
		// TODO Auto-generated method stub
		ArrayList<Profesor> all = (ArrayList<Profesor>) profesorRopositorio.findAll();
		return all.stream().filter( e -> {
			return e.getNombre() == null || e.getNombre().startsWith("<span>");
		}).collect(Collectors.toCollection(ArrayList::new));
	}
	@Override
	public Profesor asignarProfesor(Profesor profesor, Principal principal) {
		profesor.setNombre(principal.getName());
		return profesorRopositorio.save(profesor);
	}
	
}
