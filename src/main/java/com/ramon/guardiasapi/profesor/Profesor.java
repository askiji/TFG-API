package com.ramon.guardiasapi.profesor;

import org.springframework.data.annotation.Id;

public class Profesor {
	
	@Id
	private String id;
	private String nombre;
	private Object data;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
