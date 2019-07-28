package com._520.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

@WebServlet("/session/get")
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
        //获取session
        HttpSession session = req.getSession();
        User user = (User)session.getAttribute("USER_IN_SESSION");


        out.print(user.getUsername() + "在一起在一起");
        out.print("<br>");
    }
}
