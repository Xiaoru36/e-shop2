package edu.nf.testUser;

import edu.nf.project.dao.Impl.UserDaoImpl;
import edu.nf.project.dao.UserDao;
import edu.nf.project.entity.User;

import java.util.ArrayList;
import java.util.List;

public class TestUserDao {
    public static void main(String[] args) {
        UserDao dao=new UserDaoImpl();
        List<User> list=dao.listUser();
        list.forEach(u-> System.out.println(u.getuName()));
    }
}
