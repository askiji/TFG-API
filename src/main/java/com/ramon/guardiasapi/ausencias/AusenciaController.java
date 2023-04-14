package com.ramon.guardiasapi.ausencias;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AusenciaController {
	@Autowired
	private AusenciaSvr ausenciaSvr;

	@PostMapping("/ausencia")
	public ResponseEntity<?> registrarAusencia(@RequestBody Ausencia ausencia) {
		return new ResponseEntity<>(ausenciaSvr.reAusencia(ausencia), HttpStatus.CREATED);
	}
	
	@PostMapping("/ausencia/update")
	public ResponseEntity<?> updateAusencia(@RequestBody Ausencia ausencia) {
		return new ResponseEntity<>(ausenciaSvr.updateAusencia(ausencia), HttpStatus.OK);
	}

	@GetMapping("/ausencia/hoy")
	public ResponseEntity<?> handlerAusenciasHoy() {
		return new ResponseEntity<>(ausenciaSvr.findAusenciasHoy(), HttpStatus.OK);
	}

	@GetMapping("/ausencia/{dia}")
	public ResponseEntity<?> handlerAusenciasDia(@PathVariable Integer dia, Principal principal) {
		System.out.println(principal.getName());
		return new ResponseEntity<>(ausenciaSvr.findAusenciasDia(dia), HttpStatus.OK);
	}

	@GetMapping("/expired")
	public ResponseEntity<?> expirationHandler(Principal principal) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
