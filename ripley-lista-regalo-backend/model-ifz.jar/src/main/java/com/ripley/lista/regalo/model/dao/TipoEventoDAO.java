package com.ripley.lista.regalo.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ripley.lista.regalo.bean.*;

public interface TipoEventoDAO {

	@Results({	         
        @Result(property = "nro_caja", column = "nro_caja"),
        @Result(property = "nro_docu", column = "nro_docto"),
        @Result(property = "nro_comercio", column = "comercio"),
        @Result(property = "cod_sucursal", column = "sucursal")	         
      })
	@Select("SELECT nro_docto,nro_caja,comercio,sucursal FROM trx_header t where t.sucursal=62 and t.fecha_trunc=TO_DATE('01122017','DDMMYYYY') \r\n" + 
			" and t.nro_caja='000040' and t.nro_docto=91358  ")
	List<TipoEventoBean> listTipoEvento();
	
	
}
