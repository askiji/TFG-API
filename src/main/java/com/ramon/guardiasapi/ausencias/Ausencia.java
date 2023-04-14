package com.ramon.guardiasapi.ausencias;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class Ausencia {
	@Id
	private String id;
	private Float fecha;
	private String nombre;
	private ArrayList<String> clases;
	private String nombreSuplente;
	
	public String getNombreSuplente() {
		return nombreSuplente;
	}
	public void setNombreSuplente(String nombreSuplente) {
		this.nombreSuplente = nombreSuplente;
	}
	public ArrayList<String> getClases() {
		return clases;
	}
	public void setClases(ArrayList<String> clases) {
		this.clases = clases;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Float getFecha() {
		return fecha;
	}
	public void setFecha(Float fecha) {
		this.fecha = fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
