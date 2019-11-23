package com.bea.web;

import com.bea.dao.UserDao;
import com.bea.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by fandi on 2019/11/17 0017.
 */
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao dao = new UserDao();
        List<User> users = dao.getUsers();
        for (User u : users) {
            System.out.println(u);
        }
        String uid = users.get(0).getUid();
        System.out.println("uid:"+uid);
        request.setAttribute("users",users);
        request.setAttribute("uid",uid);
        request.getRequestDispatcher("/hello.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
