package com.ramon.guardiasapi.guardias;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardiasController {
	
	@Autowired
	private GuardiasSrv guardiasSrv;
	
	@PostMapping("/guardias")
	public ResponseEntity<?> crearGuardia(@RequestBody Guardias guardia) {
	    // Implementa la lógica de creación de la guardia
		
		Guardias g = guardiasSrv.guardarGuardias(guardia);
		return new ResponseEntity<>(g, HttpStatusCode.valueOf(201));
	}
	@GetMapping("/guardias")
	public ResponseEntity<?> findGuardia(){
		ArrayList<Guardias> arr = guardiasSrv.findGuardias();
		return new ResponseEntity<>(arr , HttpStatusCode.valueOf(200));
	}
	
}
