package com.ripley.lista.regalo.model.dao.ibatis;


import java.io.InputStream;


import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class MyBatisUtil {
   
	private static SqlSessionFactory sqlSessionFactory;
	static {
		String resource = "config.xml";
		InputStream inputStream;
				
		inputStream = (InputStream) MyBatisUtil.class.getResourceAsStream(resource);
		System.out.println("inputStream:"+inputStream);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		System.out.println("sqlSessionFactory:"+sqlSessionFactory);
	}
	public static SqlSessionFactory getSqlSessionFactory(){
		System.out.println("listTipoEvento");
		return sqlSessionFactory;
	}
}
