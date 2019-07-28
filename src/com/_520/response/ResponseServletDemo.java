package com._520.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class ResponseServletDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置输出内容类型
        //resp.setContentType("text/html");
        //设置输出数据的编码方式
        //resp.setCharacterEncoding("UTF-8");
        //
        resp.setContentType("text/html;charset=utf-8");
        //OutputStream out = resp.getOutputStream();
       // out.write("你好！".getBytes());
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("你好");
        printWriter.print("老哥");
    }
}
