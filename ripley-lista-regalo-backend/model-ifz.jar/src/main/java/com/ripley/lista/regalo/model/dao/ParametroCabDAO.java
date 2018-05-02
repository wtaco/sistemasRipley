package com.ripley.lista.regalo.model.dao;

import org.apache.ibatis.annotations.Insert;

import com.ripley.lista.regalo.bean.ParametroCabBean;

public interface ParametroCabDAO {

	@Insert("INSERT into rpyparamcab(GRUPO, DESCRIPCION, ESTADO) VALUES(#{codigoGrupo}, #{descripcion}, #{codigoEstado})")
	void insertParametroCab(ParametroCabBean village);
	
}
