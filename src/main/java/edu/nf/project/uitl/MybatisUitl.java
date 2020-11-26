package edu.nf.project.uitl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUitl {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try{
            InputStream is= Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
            sqlSessionFactory=builder.build(is);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(Boolean a){
        return sqlSessionFactory.openSession(a);
    }
}
