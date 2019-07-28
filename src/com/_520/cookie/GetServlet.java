package com._520.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet("/get")
public class GetServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置接收编码
        req.setCharacterEncoding("UTF-8");
        //
        resp.setContentType("text/html;charset=utf-8");
        //对浏览器响应
       String username = "";
        PrintWriter out = resp.getWriter();
        //获取cookie中的数据
        Cookie[] cookies = req.getCookies();
        for (Cookie cs:cookies
             ) {
                 String name = cs.getName();
                 String value = cs.getValue();
                 //如果和设置的姓名一样就返回他的值
                 if ("username".equals(name)){
                     String str = URLDecoder.decode(value,"utf-8");
                     username = str;
                 }

        }
        out.print(username + "在一起在一起");
        out.print("<br>");
    }
}
