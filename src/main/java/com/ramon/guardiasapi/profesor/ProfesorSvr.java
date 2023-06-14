package com.ramon.guardiasapi.profesor;

import java.security.Principal;
import java.util.ArrayList;

public interface ProfesorSvr {
	
	
	public Profesor guardarProfesor(Profesor profesor);
	public Profesor findProfesor(String nombre);
	public ArrayList<Profesor> findTodos(Principal principal);
	public ArrayList<Profesor> findProfesores();
	public Profesor asignarProfesor(Profesor profesor , Principal principal);
}
