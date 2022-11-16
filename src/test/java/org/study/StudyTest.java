package org.study;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class StudyTest {
    public static void main(String[] args) throws IOException {
        String resource = "study-config.xml";
        //1,读取resources下面的xml文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2,使用SqlSessionFactoryBuilder创建SqlSessionFactory，SqlSessionFactoryBuilder建造者模式
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3,通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
    }
}
