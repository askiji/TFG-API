package com.ramon.guardiasapi.profesor;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfesorController {
	 @Autowired
	 private ProfesorSvr profesorSvr;
	
	@PostMapping("/profesores")
	public ResponseEntity<?> guardarProfesor(@RequestBody Profesor profesor){
		Profesor p = profesorSvr.guardarProfesor(profesor);
		return new ResponseEntity<>(p , HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/profesores/sinasignar")
	public ResponseEntity<?> findTodos(Principal principal){
		return new ResponseEntity<>(profesorSvr.findTodos(principal), HttpStatus.OK);
		
	}
	@PostMapping("/profesores/asignar")
	public ResponseEntity<?> asignarProfesore(@RequestBody Profesor profesor , Principal principal){
		return new ResponseEntity<>(profesorSvr.asignarProfesor(profesor, principal), HttpStatus.OK);
	}
	@GetMapping("/profesores/{name}")
	public ResponseEntity<?> findProfesor(@PathVariable String name){
		System.out.println(name);
		Profesor p = profesorSvr.findProfesor(name);
		return new ResponseEntity<>(p ,HttpStatus.OK);
		
	}
	@GetMapping("/admin")
	public ResponseEntity<?> findProfesores(){
		return new ResponseEntity<>(profesorSvr.findProfesores(),HttpStatus.OK);
	}
	
}
