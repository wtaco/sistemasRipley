package com.ripley.lista.regalo.service;

import java.util.List;

import com.ripley.lista.regalo.bean.ParametroCabBean;
import com.ripley.lista.regalo.bean.TipoEventoBean;



public interface EventoListaRegaloService {

	List<TipoEventoBean> listTrxHeader();
	void insertParametroCab(ParametroCabBean parametroCabBean);
}
