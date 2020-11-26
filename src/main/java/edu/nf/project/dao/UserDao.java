package edu.nf.project.dao;

import edu.nf.project.entity.User;

import java.util.List;

public interface UserDao {
    //查询
    List<User> listUser();

    //添加
    void addUser(User user);
}
