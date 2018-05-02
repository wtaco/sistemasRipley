package com.ripley.lista.regalo.model.dao.ibatis;


import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ripley.lista.regalo.bean.ParametroCabBean;
import com.ripley.lista.regalo.model.dao.ParametroCabDAO;

@Repository("ParametroCabDAO")
public class SqlMapParametroCabDAO implements ParametroCabDAO{

	@Override
	public void insertParametroCab(ParametroCabBean village) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		ParametroCabDAO mapper = session.getMapper(ParametroCabDAO.class);
		 mapper.insertParametroCab(village); 
		 session.commit();
		 session.close();
	}
	
}
