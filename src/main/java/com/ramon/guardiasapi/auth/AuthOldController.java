package com.ramon.guardiasapi.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthOldController {

	@PostMapping("/login")
	public ResponseEntity<?> loginHandler(@RequestBody Auth auth){
		return new ResponseEntity<>(auth , HttpStatus.OK);
	}
	
}
