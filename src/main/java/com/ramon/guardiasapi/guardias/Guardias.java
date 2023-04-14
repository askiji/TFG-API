package com.ramon.guardiasapi.guardias;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

import com.ramon.guardiasapi.profesor.Profesor;

public class Guardias {
	 @Id
	private String id;
	private String hora;
	private String dia;
	private ArrayList<Profesor> profesores;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}
	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}
	@Override
	public String toString() {
		return "Guardias [id=" + id + ", hora=" + hora + ", dia=" + dia + ", profesores=" + profesores + "]";
	}

	
	
}
