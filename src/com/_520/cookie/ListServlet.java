package com._520.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置接收编码
        req.setCharacterEncoding("UTF-8");
        //
        resp.setContentType("text/html;charset=utf-8");
        //对浏览器响应
        PrintWriter out = resp.getWriter();

        out.print("收件箱列表：<br>");
        for (int i = 0; i < 6; i++) {
            out.print("<a href=\"get\"> 邮件 </a><br>");
        }
    }
}
