package edu.nf.project.service;

import edu.nf.project.dao.Impl.UserDaoImpl;
import edu.nf.project.dao.UserDao;
import edu.nf.project.entity.User;

import java.util.List;

public class UserService {
    //查询
    public List<User> listUser(){
        UserDao dao=new UserDaoImpl();
        List<User> list=dao.listUser();
        return list;
    }

    //添加
    public void addUser(User user){
        UserDao dao=new UserDaoImpl();
        dao.addUser(user);
    }
}
