package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	
	private String correo;
	private String contraseña;
	
	public String getCorreo() {
		return correo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
