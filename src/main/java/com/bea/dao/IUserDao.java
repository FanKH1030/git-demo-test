package com.bea.dao;
//import com.bea.User;

import com.bea.model.User;

import java.util.List;

/**
 * Created by fandi on 2019/11/17 0017.
 */
public interface IUserDao {

    List<User> getUsers() throws Exception;
}
