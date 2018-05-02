package com.ripley.lista.regalo.bean;

import java.io.Serializable;

public class ParametroCabBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
    String codigoGrupo;
    String descripcion;
    String codigoEstado;
	
    public String getCodigoGrupo() {
		return codigoGrupo;
	}
	public void setCodigoGrupo(String codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigoEstado() {
		return codigoEstado;
	}
	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}
	
    
}
