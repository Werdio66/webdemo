package com._520.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置接收编码
        req.setCharacterEncoding("UTF-8");
        //
        resp.setContentType("text/html;charset=utf-8");
        String username = req.getParameter("username");
        //如果是中文，需要编码在解码
        String ret = URLEncoder.encode(username,"utf-8");
        //对浏览器响应
        PrintWriter out = resp.getWriter();
        username = URLDecoder.decode(ret,"utf-8");
        Cookie cookie = new Cookie("username",username);
        resp.addCookie(cookie);
        out.print("欢迎：" + cookie.getValue());
        out.print("<br>");
        out.print("<a href=\"list\"> 收件箱 </a>");
    }
}
