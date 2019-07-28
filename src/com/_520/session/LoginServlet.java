package com._520.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
@WebServlet("/session/login")
public class LoginServlet extends HttpServlet {
    User user = new User();
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
        //user.setUsername(username);
        HttpSession session = req.getSession();
        session.setAttribute("USER_IN_SESSION",user);
        //System.out.println(obj.toString());
        User str = (User)session.getAttribute("USER_IN_SESSION");
        out.print("欢迎：" + str.getUsername());
        out.print("<br>");
        out.print("<a href=\"list\"> 收件箱 </a>");
    }
}
