package com.ramon.guardiasapi.datos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DatosController {

	@Autowired
	private DatosSvr datosSvr;
	@GetMapping("/profesor/guardias")
	public ResponseEntity<?> traerGuardias(){
		return new ResponseEntity<>(datosSvr.traerGuardias() , HttpStatus.OK);
		
	}
}
