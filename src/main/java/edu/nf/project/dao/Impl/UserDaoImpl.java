package edu.nf.project.dao.Impl;

import edu.nf.project.dao.UserDao;
import edu.nf.project.entity.User;
import edu.nf.project.uitl.MybatisUitl;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public List<User> listUser() {
        try(SqlSession sqlSession= MybatisUitl.getSession(true)) {
            return sqlSession.getMapper(UserDao.class).listUser();
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void addUser(User user) {
        try(SqlSession sqlSession=MybatisUitl.getSession(true)){
            sqlSession.getMapper(UserDao.class).addUser(user);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
