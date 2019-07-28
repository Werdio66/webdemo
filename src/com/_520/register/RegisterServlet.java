package com._520.register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");
        String city = req.getParameter("city");
        String[] hobbys = req.getParameterValues("hobby");
        System.out.println(username);
        System.out.println(city);
        System.out.println(password);
        System.out.println("-----------------");
        System.out.println(Arrays.toString(hobbys));
        work();
    }
    public void work(){
        System.out.println("ban");
    }
}
