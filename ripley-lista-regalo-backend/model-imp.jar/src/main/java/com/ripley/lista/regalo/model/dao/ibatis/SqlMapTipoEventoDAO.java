/**
 * 
 */
package com.ripley.lista.regalo.model.dao.ibatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ripley.lista.regalo.bean.TipoEventoBean;
import com.ripley.lista.regalo.model.dao.TipoEventoDAO;

@Repository("TipoEventoDAO")
public class SqlMapTipoEventoDAO implements TipoEventoDAO{

	@Override
	public List<TipoEventoBean> listTipoEvento() {
	    System.out.println("listTipoEvento....");
	    System.out.println("MyBatisUtil:"+MyBatisUtil.getSqlSessionFactory());
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		 TipoEventoDAO mapper = session.getMapper(TipoEventoDAO.class);
		 List<TipoEventoBean> listHeader = mapper.listTipoEvento();
		  session.close();
		  return listHeader;
	}

}
