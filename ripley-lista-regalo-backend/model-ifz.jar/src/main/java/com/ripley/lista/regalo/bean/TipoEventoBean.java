package com.ripley.lista.regalo.bean;

import java.io.Serializable;

public class TipoEventoBean implements Serializable{
  
	private static final long serialVersionUID = 1L;
	String nro_caja;
	String nro_docu;
	String nro_comercio;
	String cod_sucursal;
	public String getNro_caja() {
		return nro_caja;
	}
	public void setNro_caja(String nro_caja) {
		this.nro_caja = nro_caja;
	}
	public String getNro_docu() {
		return nro_docu;
	}
	public void setNro_docu(String nro_docu) {
		this.nro_docu = nro_docu;
	}
	public String getNro_comercio() {
		return nro_comercio;
	}
	public void setNro_comercio(String nro_comercio) {
		this.nro_comercio = nro_comercio;
	}
	public String getCod_sucursal() {
		return cod_sucursal;
	}
	public void setCod_sucursal(String cod_sucursal) {
		this.cod_sucursal = cod_sucursal;
	}
	
	
}
