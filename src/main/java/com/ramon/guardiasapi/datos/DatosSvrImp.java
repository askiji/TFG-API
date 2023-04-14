package com.ramon.guardiasapi.datos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosSvrImp implements DatosSvr{
	@Autowired
	private DatosRepositorio datosRepositorio;
@Override
public Datos traerGuardias() {
	// TODO Auto-generated method stub
	return datosRepositorio.findAll().get(0);
}
}
