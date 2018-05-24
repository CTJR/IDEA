package com.MyBatis.mapperInt;

import com.MyBatis.Users.User;
import com.MyBatis.sqlSessionFac.SqlSessionFact;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsermapperIntTest {

    private UsermapperInt usermapperInt;
    private SqlSession sqlSession;
    @BeforeEach
    void setUp() {
        SqlSessionFactory sqlSessionFactory = SqlSessionFact.getSqlSessionFactory();
        sqlSession = sqlSessionFactory.openSession();
        usermapperInt = sqlSession.getMapper(UsermapperInt.class);

    }

    @AfterEach
    void tearDown() {
        sqlSession.close();
    }

    @Test
    void selectUser() throws Exception {
       User user = usermapperInt.selectUser(1);
        System.out.println(user);
    }

   /* @Test
    void selectUserByMoHu() {
    }

    @Test
    void insertUser() {
    }

    @Test
    void deleteUser() {
    }

    @Test
    void update() {
    }*/
}