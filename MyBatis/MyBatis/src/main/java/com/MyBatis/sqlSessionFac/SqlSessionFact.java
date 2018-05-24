package com.MyBatis.sqlSessionFac;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SqlSessionFact {
    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String config = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
            sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
        }
        return sessionFactory;
    }
}
