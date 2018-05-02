package com.ripley.lista.regalo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ripley.lista.regalo.bean.ParametroCabBean;
import com.ripley.lista.regalo.bean.TipoEventoBean;
import com.ripley.lista.regalo.model.dao.ParametroCabDAO;
import com.ripley.lista.regalo.model.dao.TipoEventoDAO;

@Service("EventoListaRegaloService")
public class EventoListaRegaloServiceImpl implements EventoListaRegaloService{

	@Autowired
	private TipoEventoDAO tipoEventoDAO;
	
	@Autowired
	private ParametroCabDAO parametroCabDAO;
	
	@Override
	public List<TipoEventoBean> listTrxHeader() {
		 System.out.println("EventoListaRegaloService:listTrxHeader");
		tipoEventoDAO.listTipoEvento();
		return tipoEventoDAO.listTipoEvento();
	}

	@Override
	public void insertParametroCab(ParametroCabBean parametroCabBean) {
		parametroCabDAO.insertParametroCab(parametroCabBean);
	}
 
}
